/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OConnectionClass;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OUser;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

/**
 *
 * @author SUMsoft
 */
public final class RootNodeChildFactory extends ChildFactory<OConnectionNode> {

    //private final DBNode parentInfo;
    /*
    public MyChildFactory(DBNode parentInfo) {
    this.parentInfo = parentInfo;
    parentInfo.addChangeListener(
    WeakListeners.create(ChangeListener.class, this, parentInfo));
    
    stateChanged(new ChangeEvent(parentInfo));
    }*/

    @Override
    public Node[] createNodesForKey(OConnectionNode key) {
        //DBNode nd = new DBNode(key.toString());
        return new Node[]{key};        
    }

    @Override
    protected boolean createKeys(List<OConnectionNode> keys) {
        List<OConnectionClass> ocsl = OConnectionClass.LoadAllConnections();
        for (OConnectionClass ocs : ocsl) {
            keys.add(new OConnectionNode(ocs));
        }
        return true;
    }
}
