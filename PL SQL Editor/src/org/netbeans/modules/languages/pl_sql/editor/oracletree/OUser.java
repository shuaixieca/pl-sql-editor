/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.sql.SQLException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import oracle.jdbc.pool.OracleDataSource;
import org.openide.util.Exceptions;

/**
 *
 * @author SUMsoft
 */
public class OUser {

    private String UserName,  Password = "";
    private Boolean SavePassword = false;
    private RoleTypes ConnectRole = RoleTypes.normal;
    private OConnectionClass Parent;

    private Preferences pref() {
        return OConnectionClass.getPref_root().node(Parent.toString());
    }

    public OUser(OConnectionClass OParent, String OUserName, String OPassword, Boolean OSavePassword, RoleTypes OConnectRole) {
        Parent = OParent;
        UserName = OUserName;
        if (OSavePassword) {
            Password = OPassword;
        }
        SavePassword = OSavePassword;
        ConnectRole = OConnectRole;
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
        } catch (BackingStoreException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    public String toString() {
        return UserName;
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
}
