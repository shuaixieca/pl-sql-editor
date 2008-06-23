/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeListener;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.pool.OracleDataSource;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.ChangeOAccessCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.ConnectCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DisconnectCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.EditCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshCookieInterface;
import org.openide.util.Cancellable;
import org.openide.util.ChangeSupport;
import org.openide.util.Exceptions;
import org.openide.util.RequestProcessor;
import org.openide.util.TaskListener;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputListener;

/**
 *
 * @author SUMsoft
 */
public class OUser implements RefreshCookieInterface, EditCookieInterface, DeleteCookieInterface,
        ConnectCookieInterface, DisconnectCookieInterface, ChangeOAccessCookieInterface {

    private String UserName,  Password = "";
    private Boolean SavePassword = false;
    private RoleTypes ConnectRole = RoleTypes.normal;
    private OConnectionClass Parent;
    private List<PropertyChangeListener> listeners = Collections.synchronizedList(new LinkedList<PropertyChangeListener>());
    private final ChangeSupport changeSupport = new ChangeSupport(this);
    private OracleConnection conn;
    private boolean IsConnected,  IsCanceled = false;
    private boolean progressed = false;
    private ConnectionTry ct = null;
    private ObjectAccessed oaccess = ObjectAccessed.User;
    private ProgressHandle progressHandle = ProgressHandleFactory.createHandle(null, new Cancellable() {

        public boolean cancel() {
            IsCanceled = true;
            OutputMsg("Canceled.", null, false);
            return true;
        }
    });

    public Preferences getPreferencesRoot() {
        return OConnectionClass.getPref_root().node(Parent.getPrefNode()).node(getUserName());
    }

    public OUser(OConnectionClass OParent, String OUserName, String OPassword,
            Boolean OSavePassword, RoleTypes OConnectRole, ObjectAccessed OObjectAccessed) {
        Parent = OParent;
        UserName = OUserName;
        if (OSavePassword) {
            Password = OPassword;
        }
        //Password = OPassword;
        SavePassword = OSavePassword;
        ConnectRole = OConnectRole;
        oaccess = OObjectAccessed;
    }

    public void addChangeListener(ChangeListener listener) {
        changeSupport.addChangeListener(listener);
    }

    public void removeChangeListener(ChangeListener listener) {
        changeSupport.removeChangeListener(listener);
    }

    protected void notifyChange() {
        changeSupport.fireChange();
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        listeners.add(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        listeners.remove(pcl);
    }

    private void fire(String propertyName, Object old, Object nue) {
        //Passing 0 below on purpose, so you only synchronize for one atomic call:
        PropertyChangeListener[] pcls = (PropertyChangeListener[]) listeners.toArray(new PropertyChangeListener[0]);
        for (int i = 0; i < pcls.length; i++) {
            pcls[i].propertyChange(new PropertyChangeEvent(this, propertyName, old, nue));
        }
    }

    public void SaveUser() {
        Preferences pref_user = getPreferencesRoot();
        pref_user.put("UserName", getUserName());
        if (getSavePassword()) {
            pref_user.put("Password", getPassword());
        }
        pref_user.putBoolean("SavePassword", getSavePassword());
        pref_user.put("ConnectRole", getConnectRole().toString());
        pref_user.put("Access", getObjectAccessed().toString());
        try {
            pref_user.flush();
        } catch (BackingStoreException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    public void RemoveUser() {
        try {
            getPreferencesRoot().removeNode();
            getPreferencesRoot().flush();
        } catch (BackingStoreException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    public String toString() {
        return getUserName();
    }

    public OracleDataSource getOracleDataSource() throws SQLException {
        OracleDataSource ods = new OracleDataSource();
        ods.setDriverType("thin");
        ods.setServerName(Parent.getServerName());
        ods.setNetworkProtocol("tcp");
        ods.setDatabaseName(Parent.getDatabaseName());
        ods.setPortNumber(Parent.getPort());
        ods.setUser(UserName);
        if (SavePassword) {
            ods.setPassword(Password);
        }
        //ods.setPassword(Password);
        if (ConnectRole != RoleTypes.normal) {
            java.util.Properties prop = new java.util.Properties();
            prop.put("internal_logon", ConnectRole.toString());
            ods.setConnectionProperties(prop);
        }
        return ods;
    }

    public RoleTypes getConnectRole() {
        return ConnectRole;
    }

    public Boolean getSavePassword() {
        return SavePassword;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public OConnectionClass getParent() {
        return Parent;
    }

    public void setConnectRole(RoleTypes ConnectRole) {
        this.ConnectRole = ConnectRole;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setSavePassword(Boolean SavePassword) {
        this.SavePassword = SavePassword;
    }

    public void setUserName(String UserName) {
        String oldUserName = this.UserName;
        this.UserName = UserName;
        fire("UserName", oldUserName, UserName);
    }

    public synchronized void setIsConnected(boolean b) {
        boolean oldb = this.IsConnected;
        this.IsConnected = b;
        fire("IsConnected", oldb, b);
        Parent.fire("IsConnected", oldb, b);
    }

    public synchronized boolean getIsConnected() {
        return IsConnected;
    }

    public OracleConnection getConn() {
        return conn;
    }

    public void Delete() {
        this.RemoveUser();
        Parent.getUsers().remove(this);
    }

    public void Edit() {
        OConnectionJPanel oc = new OConnectionJPanel();
        oc.ShowEditUserDialog(this);
        if (oc.getIsSaved()) {
            if (oc.getUserName().compareTo(this.getUserName()) != 0) {
                this.RemoveUser();
            }
            setUserName(oc.getUserName());
            setSavePassword(oc.getSaveUserPassword());
            if (oc.getSaveUserPassword()) {
                setPassword(oc.getPassword());
            }
            setConnectRole(oc.getConnectRole());
        }
    }

    private InputOutput getio() {
        return IOProvider.getDefault().getIO(Parent.toString(), false);
    }

    public synchronized void OutputMsg(String msg, OutputListener ol, boolean error) {
        if (error) {
            getio().select();
            if (ol != null) {
                try {
                    getio().getErr().println(msg, ol);
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            } else {
                getio().getErr().println(msg);
            }
            getio().getErr().close();
        } else {
            if (ol != null) {
                try {
                    getio().getOut().println(msg, ol);
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            } else {
                getio().getOut().println(msg);
            }
            getio().getOut().close();
        }
    }
    //private ProgressHandle progressHandle;

    private void startProgress(final String msg) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                try {
                    progressHandle.setDisplayName(msg);
                    progressHandle.start();
                    progressed = true;
                } catch (IllegalStateException e) {
                    progressed = false;
                }
            }
        });
    }

    private void stopProgress() {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                progressHandle.finish();
            }
        });

    }

    private synchronized void EnableHints() {
        if (IsConnected) {
            CallableStatement st = null;
            try {
                st = conn.prepareCall("begin :1 := DBMS_DB_VERSION.VERSION; end;");
                st.registerOutParameter(1, Types.INTEGER);
                st.execute();
                if (st.getInt(1) >= 10) {
                    st.clearParameters();
                    st.execute("ALTER SESSION SET PLSQL_WARNINGS='ENABLE:ALL'");
                }

            } catch (SQLException ex) {
                // Do nothing because Oracle version < 9i
                Exceptions.printStackTrace(ex);
            } finally {
                if (st != null) {
                    try {
                        st.close();
                    } catch (SQLException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            }
        }
    }

    public synchronized void Connect() {
        ct = new ConnectionTry();
        ct.post();
    }

    public synchronized void Disconnect() {
        if (IsConnected) {
            try {
                conn.close();
                OutputMsg("\'" + UserName + "\' user is disconnected.", null, false);
                this.notifyChange();
            } catch (SQLException ex) {
                OutputMsg(ex.getMessage(), null, true);
            }

            setIsConnected(false);
        }
    }

    class ConnectionTry {

        private RequestProcessor rp;
        private RequestProcessor.Task task;

        public ConnectionTry() {
            rp = new RequestProcessor(ConnectionTry.class.getName(), 1, true);

            task = rp.create(new Runnable() {

                public void run() {
                    if (!IsConnected && !progressed) {
                        try {
                            boolean connect = true;
                            OracleDataSource ods = getOracleDataSource();
                            if (!getSavePassword()) {
                                PasswordJPanel pjp = new PasswordJPanel();
                                pjp.ShowDialog(getUserName());
                                connect =
                                        pjp.getisOK();
                                if (connect) {
                                    ods.setPassword(pjp.getPassword());
                                }

                            }
                            if (connect) {
                                String localmsg = "Connecting to " + Parent.toString() + " as \'" + UserName + "\' user.";
                                //progressHandle.setDisplayName(localmsg);
                                //progressHandle.start();
                                startProgress(localmsg);

                                OutputMsg(localmsg, null, false);
                                conn =
                                        (OracleConnection) ods.getConnection();
                                setIsConnected(true);
                                OutputMsg("Connected as \'" + UserName + "\' user.", null, false);
                                EnableHints();
                                notifyChange();
                            }

                        } catch (SQLException ex) {
                            setIsConnected(false);
                            if (!IsCanceled) {
                                OutputMsg(ex.getMessage(), null, true);
                            }

                        } finally {
                            if (IsCanceled) {
                                if (IsConnected) {
                                    try {
                                        conn.close();
                                    } catch (SQLException ex) {
                                        OutputMsg(ex.getMessage(), null, true);
                                    } finally {
                                        setIsConnected(false);
                                    }

                                }
                                IsCanceled = false;
                            }

                            if (progressed) {
                                //progressHandle.finish();
                                stopProgress();
                                progressed =
                                        false;
                            }

                        }
                    }
                }
            });

            task.addTaskListener(
                    new TaskListener() {

                        public void taskFinished(org.openide.util.Task arg0) {
                            if (!IsCanceled) {
                                //stopProgress(msg, connected);
                                //ChangeTestButton();
                                ct = null;
                            }
                        }
                    });
        }

        public void post() {
            rp.post(task);
        }

        public void stop() {
            task.cancel();
            IsCanceled = true;
            ct = null;
        }
    }

    public void Refresh() {
        this.notifyChange();
    }

    @Override
    protected void finalize() {
        this.Disconnect();
        this.conn = null;
    }

    public void ChangeOAccess(ObjectAccessed oa) {
        this.oaccess = oa;
        Preferences pref_user = getPreferencesRoot();
        pref_user.put("Access", getObjectAccessed().toString());
        this.Refresh();
    }

    public ObjectAccessed getObjectAccessed() {
        return oaccess;
    }
}
