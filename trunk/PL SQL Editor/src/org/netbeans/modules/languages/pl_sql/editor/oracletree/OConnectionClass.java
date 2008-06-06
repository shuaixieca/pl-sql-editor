/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OUser;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.RoleTypes;
import org.openide.util.Exceptions;
import org.openide.util.NbPreferences;

/**
 *
 * @author SUMsoft
 */
public class OConnectionClass {

    private String ServerName,  DatabaseName;
    private int Port = 1521;
    private TreeSet<OUser> Users = new TreeSet<OUser>(new OUserComp());
    private static Preferences pref_root = NbPreferences.forModule(OConnectionClass.class).node("OConnectionClass");

    class OUserComp implements Comparator<OUser> {

        public int compare(OUser a, OUser b) {
            return a.toString().compareTo(b.toString());
        }
    }

    public OConnectionClass(String OServerName, int OPort, String ODatabaseName) {
        ServerName = OServerName;
        Port = OPort;
        DatabaseName = ODatabaseName;
    }

    public OConnectionClass(String OServerName, int OPort, String ODatabaseName, String OUserName, String OPassword, Boolean OSavePassword, RoleTypes OConnectRole) {
        this(OServerName, OPort, ODatabaseName);

        Users.add(new OUser(this, OUserName, OPassword, OSavePassword, OConnectRole));
    }

    public void SaveConnection() {
        Preferences pref = pref_root.node(this.toString());
        pref.put("ServerName", ServerName);
        pref.putInt("Port", Port);
        pref.put("DatabaseName", DatabaseName);
    }

    public void SaveAllUsers() {
        for (OUser ou : Users)
        {
            ou.SaveUser();
        }
    }
    
    public void RemoveConnection() {
        try {
            pref_root.node(this.toString()).removeNode();
        } catch (BackingStoreException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    public static List<OConnectionClass> LoadAllConnections() {
        ArrayList<OConnectionClass> res = new ArrayList<OConnectionClass>();
        if (pref_root != null) {
            try {
                for (String c : pref_root.childrenNames()) {
                    Preferences pref = pref_root.node(c);
                    OConnectionClass ocl = new OConnectionClass(pref.get("ServerName", ""), pref.getInt("Port", 1521), pref.get("DatabaseName", ""));
                    for (String u : pref.childrenNames()) {
                        Preferences pref_u = pref.node(u);
                        OUser os = new OUser(ocl, pref_u.get("UserName", ""), pref_u.get("Password", ""), pref_u.getBoolean("SavePassword", false), RoleTypes.valueOf(pref_u.get("ConnectRole", "")));
                        ocl.Users.add(os);
                    }
                    res.add(ocl);
                }
            } catch (BackingStoreException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return ServerName + '[' + Port + "]@" + DatabaseName;
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

    public TreeSet<OUser> getUsers() {
        return Users;
    }

    public static Preferences getPref_root() {
        return pref_root;
    }
}
