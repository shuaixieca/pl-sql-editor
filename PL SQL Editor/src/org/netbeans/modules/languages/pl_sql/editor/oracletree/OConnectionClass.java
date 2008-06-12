/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.AddCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteCookieInterface;
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
public class OConnectionClass implements RefreshCookieInterface, AddCookieInterface, DeleteCookieInterface {

    private String ServerName,  DatabaseName,  PrefNodeName;
    private int Port = 1521;
    private TreeSet<OUser> Users = new TreeSet<OUser>(new OUserComp());
    protected static Preferences pref_root = NbPreferences.forModule(OConnectionClass.class).node("OConnectionClass");
    private final ChangeSupport changeSupport = new ChangeSupport(this);

    class OUserComp implements Comparator<OUser> {

        public int compare(OUser a, OUser b) {
            return a.toString().compareTo(b.toString());
        }
    }

    public OConnectionClass(String OPrefNodeName, String OServerName, int OPort, String ODatabaseName) {
        PrefNodeName = OPrefNodeName;
        ServerName = OServerName;
        Port = OPort;
        DatabaseName = ODatabaseName;
        PrefNodeName = String.valueOf(this.toString().hashCode());
    }

    public OConnectionClass(String OPrefNodeName, String OServerName, int OPort, String ODatabaseName, String OUserName, String OPassword, Boolean OSavePassword, RoleTypes OConnectRole) {
        this(OPrefNodeName, OServerName, OPort, ODatabaseName);

        Users.add(new OUser(this, OUserName, OPassword, OSavePassword, OConnectRole));
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

    public void SaveConnection() {
        Preferences pref = pref_root.node(getPrefNode());
        pref.put("ServerName", ServerName);
        pref.putInt("Port", Port);
        pref.put("DatabaseName", DatabaseName);
    }

    public void SaveAllUsers() {
        for (OUser ou : Users) {
            ou.SaveUser();
        }
    }

    public void RemoveConnection() {
        try {
            pref_root.node(getPrefNode()).removeNode();
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

    public TreeSet<OUser> getUsers() {
        return Users;
    }

    public static Preferences getPref_root() {
        return pref_root;
    }

    public void Refresh() {
        this.notifyChange();
    }

    public void ReloadChilds() {
        Users.clear();
        try {
            Preferences pref = pref_root.node(getPrefNode());
            for (String u : pref.childrenNames()) {
                Preferences pref_u = pref.node(u);
                if (pref_u.get("ConnectRole", "").compareTo("") != 0) {
                    OUser os = new OUser(this, pref_u.get("UserName", ""), pref_u.get("Password", ""), pref_u.getBoolean("SavePassword", false), RoleTypes.valueOf(pref_u.get("ConnectRole", "")));
                    Users.add(os);
                }
            }
        } catch (BackingStoreException ex) {
            Exceptions.printStackTrace(ex);
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
        this.RemoveConnection();
        OConnectionRoot.RemoveConnection(this);
    }
}
