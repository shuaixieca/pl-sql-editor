/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.AddCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.EditCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OUser;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.RoleTypes;
import org.openide.util.ChangeSupport;
import org.openide.util.Exceptions;
import org.openide.util.NbPreferences;

/**
 *
 * @author SUMsoft
 */
public class OConnectionClass implements RefreshCookieInterface, AddCookieInterface,
        DeleteCookieInterface, EditCookieInterface {

    private String ServerName,  DatabaseName,  PrefNodeName = null;
    private int Port = 1521;
    private TreeSet<OUser> Users = new TreeSet<OUser>(new OUserComp());
    protected static final Preferences pref_root = NbPreferences.forModule(OConnectionClass.class).node("oroot");
    private final ChangeSupport changeSupport = new ChangeSupport(this);
    private List<PropertyChangeListener> listeners = Collections.synchronizedList(new LinkedList<PropertyChangeListener>());

    class OUserComp implements Comparator<OUser> {

        public int compare(OUser a, OUser b) {
            return a.toString().compareTo(b.toString());
        }
    }

    public OConnectionClass(String OPrefNodeName, String OServerName, int OPort, String ODatabaseName) {
        ServerName = OServerName;
        Port = OPort;
        DatabaseName = ODatabaseName;        
        if (OPrefNodeName == null) {
            PrefNodeName = String.valueOf(this.toString().hashCode());
        } else {
            PrefNodeName = OPrefNodeName;
        }
    }

    public OConnectionClass(String OPrefNodeName, String OServerName, int OPort, String ODatabaseName, String OUserName, String OPassword, Boolean OSavePassword, RoleTypes OConnectRole) {
        this(OPrefNodeName, OServerName, OPort, ODatabaseName);

        Users.add(new OUser(this, OUserName, OPassword, OSavePassword, OConnectRole, ObjectAccessed.User));
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

    protected void fire(String propertyName, Object old, Object nue) {
        //Passing 0 below on purpose, so you only synchronize for one atomic call:
        PropertyChangeListener[] pcls = (PropertyChangeListener[]) listeners.toArray(new PropertyChangeListener[0]);
        for (int i = 0; i < pcls.length; i++) {
            pcls[i].propertyChange(new PropertyChangeEvent(this, propertyName, old, nue));
        }
    }

    public void SaveConnection() {
        Preferences pref = pref_root.node(getPrefNode());
        pref.put("ServerName", ServerName);
        pref.putInt("Port", Port);
        pref.put("DatabaseName", DatabaseName);
        try {
            pref.flush();
        } catch (BackingStoreException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    public void SaveAllUsers() {
        for (OUser ou : Users) {
            ou.SaveUser();
        }
    }

    public void RemoveConnection() {
        try {
            pref_root.node(getPrefNode()).removeNode();
            pref_root.flush();
        } catch (BackingStoreException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    public String toString() {
        return ServerName + ':' + Port + '/' + DatabaseName;
    }

    public String getPrefNode() {
        if (PrefNodeName != null) {
            return PrefNodeName;
        } else {
            return String.valueOf(this.toString().hashCode());
        }
    }

    public String getDatabaseName() {
        return DatabaseName;
    }

    public int getPort() {
        return Port;
    }

    public String getServerName() {
        return ServerName;
    }

    public void setDatabaseName(String DatabaseName) {
        String oldDatabaseName = this.DatabaseName;
        this.DatabaseName = DatabaseName;
        fire("DatabaseName", oldDatabaseName, DatabaseName);
    }

    public void setPort(int Port) {
        int oldPort = this.Port;
        this.Port = Port;
        fire("Port", oldPort, Port);
    }

    public void setServerName(String ServerName) {
        String OldServerName = this.ServerName;
        this.ServerName = ServerName;
        fire("ServerName", OldServerName, ServerName);
    }

    public TreeSet<OUser> getUsers() {
        return Users;
    }

    public static Preferences getPref_root() {
        return pref_root;
    }

    public void Refresh() {
        this.notifyChange();
    }

    public synchronized void ReloadChilds() {
        //Users.clear();
        synchronized (Users) {
            List<OUser> rem = new ArrayList<OUser>();
            for (OUser ou : Users) {
                if (!ou.getIsConnected()) {
                    rem.add(ou);
                }
            }
            Users.removeAll(rem);

            try {
                Preferences pref = pref_root.node(getPrefNode());
                for (String u : pref.childrenNames()) {
                    Preferences pref_u = pref.node(u);
                    if (pref_u.get("ConnectRole", "").compareTo("") != 0) {
                        OUser os = new OUser(this, pref_u.get("UserName", ""), pref_u.get("Password", ""),
                                pref_u.getBoolean("SavePassword", false), 
                                RoleTypes.valueOf(pref_u.get("ConnectRole", "")),
                                ObjectAccessed.valueOf(pref_u.get("Access", "User")));
                        Users.add(os);
                    }
                }
            } catch (BackingStoreException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    public void Add() {
        OConnectionJPanel oc = new OConnectionJPanel();
        oc.ShowDialog(this);
        if (oc.getIsSaved()) {
            Refresh();
        }
    }

    public void Delete() {
        Users.clear();
        this.RemoveConnection();
        OConnectionRoot.RemoveConnection(this);
    }

    public void Edit() {
        OConnectionJPanel oc = new OConnectionJPanel();
        oc.ShowEditConnDialog(this);
        if (oc.getIsSaved()) {
            setDatabaseName(oc.getDatabaseName());
            setPort(oc.getPort());
            setServerName(oc.getServerName());
        }
    }

    public boolean getIsConnected() {
        for (OUser ou : Users) {
            if (ou.getIsConnected()) {
                return true;
            }
        }
        return false;
    }    
}
