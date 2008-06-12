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
import javax.swing.event.ChangeListener;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.AddCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OConnectionClass;
import org.openide.util.ChangeSupport;
import org.openide.util.Exceptions;

/**
 *
 * @author SUMsoft
 */
public class OConnectionRoot implements RefreshCookieInterface, AddCookieInterface {

    static class OConnectionComp implements Comparator<OConnectionClass> {

        public int compare(OConnectionClass a, OConnectionClass b) {
            return a.toString().compareTo(b.toString());
        }
    }
    private final ChangeSupport changeSupport = new ChangeSupport(this);
    private static TreeSet<OConnectionClass> Connections = null;

    public void addChangeListener(ChangeListener listener) {
        changeSupport.addChangeListener(listener);
    }

    public void removeChangeListener(ChangeListener listener) {
        changeSupport.removeChangeListener(listener);
    }

    protected void notifyChange() {
        changeSupport.fireChange();
    }

    public void Refresh() {
        this.notifyChange();
    }

    public static List<OConnectionClass> LoadAllConnections() {
        if (Connections == null) {
            Connections = new TreeSet<OConnectionClass>(new OConnectionComp());
        }
        //ArrayList<OConnectionClass> res = new ArrayList<OConnectionClass>();
        if (OConnectionClass.pref_root != null) {
            try {
                for (String c : OConnectionClass.pref_root.childrenNames()) {
                    Preferences pref = OConnectionClass.pref_root.node(c);
                    OConnectionClass ocl = new OConnectionClass(c, pref.get("ServerName", ""), pref.getInt("Port", 1521), pref.get("DatabaseName", ""));
                    ocl.Refresh();
                    Connections.add(ocl);
                }
            } catch (BackingStoreException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        ArrayList<OConnectionClass> res = new ArrayList<OConnectionClass>();
        for (OConnectionClass occ : Connections) {
            res.add(occ);
        }
        return res;
    //return Arrays.asList(Connections.toArray(new OConnectionClass[Connections.size()]));
    }

    public void Add() {
        OConnectionJPanel oc = new OConnectionJPanel();
        oc.ShowEmptyDialog();
        if (oc.getIsSaved()) {
            Refresh();
        }
    }
}
