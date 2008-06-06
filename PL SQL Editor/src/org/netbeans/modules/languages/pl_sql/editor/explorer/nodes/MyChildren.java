/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.util.prefs.Preferences;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.NbPreferences;

/**
 *
 * @author SUMsoft
 */
public class MyChildren extends Children.Keys {

    @Override
    protected void addNotify() {
        DBNode[] objs = new DBNode[5];
        Preferences pref = NbPreferences.forModule(DBNode.class).node("Mydb456");
        pref.put("a1b2c3", "1234");
        /*try {
            pref.flush();
            NbPreferences.forModule(DBNode.class).flush();
        } catch (BackingStoreException ex) {
            Exceptions.printStackTrace(ex);
        }*/
       /* for (int i = 0; i < objs.length; i++) {
            objs[i] = new MyNode(pref.get("a1b2c3", null));
        }*/
        setKeys(objs);
    }

    @Override
    protected Node[] createNodes(Object o) {
    DBNode obj = (DBNode) o;
    //return new Node[] { new DBRootNode(obj) };
    return new Node[] { DBRootNode.GetDBRootNode() };
}
    /*
    @Override
    protected Node[] createNodes(Object arg0) {
        APIObject obj = (APIObject) arg0;
        AbstractNode result = new AbstractNode(new MyChildren(), Lookups.singleton(obj));
        result.setDisplayName(obj.toString());
        return new Node[]{result};
    }*/
}
