/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import oracle.jdbc.pool.OracleDataSource;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.EditCookieInterface;
import org.openide.util.Exceptions;

/**
 *
 * @author SUMsoft
 */
public class OUser implements EditCookieInterface, DeleteCookieInterface {

    private String UserName,  Password = "";
    private Boolean SavePassword = false;
    private RoleTypes ConnectRole = RoleTypes.normal;
    private OConnectionClass Parent;
    private List<PropertyChangeListener> listeners = Collections.synchronizedList(new LinkedList<PropertyChangeListener>());

    private Preferences pref() {
        return OConnectionClass.getPref_root().node(Parent.getPrefNode());
    }

    public OUser(OConnectionClass OParent, String OUserName, String OPassword, Boolean OSavePassword, RoleTypes OConnectRole) {
        Parent = OParent;
        UserName = OUserName;
        if (OSavePassword) {
            Password = OPassword;
        }
        //Password = OPassword;
        SavePassword = OSavePassword;
        ConnectRole = OConnectRole;
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
        Preferences pref_user = pref().node(getUserName());
        pref_user.put("UserName", getUserName());
        if (getSavePassword()) {
            pref_user.put("Password", getPassword());
        }
        pref_user.putBoolean("SavePassword", getSavePassword());
        pref_user.put("ConnectRole", getConnectRole().toString());
    }

    public void RemoveUser() {
        try {
            pref().node(getUserName()).removeNode();
            pref().flush();
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
}
