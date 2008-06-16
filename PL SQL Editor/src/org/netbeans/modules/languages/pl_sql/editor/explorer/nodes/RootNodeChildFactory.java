/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import org.netbeans.modules.languages.pl_sql.editor.oracletree.OConnectionRoot;
import java.util.List;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OConnectionClass;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.WeakListeners;

/**
 *
 * @author SUMsoft
 */
public final class RootNodeChildFactory extends ChildFactory<OConnectionNode>
        implements ChangeListener {

    private final OConnectionRoot parentInfo;

    public RootNodeChildFactory(OConnectionRoot parentInfo) {
        super();
        this.parentInfo = parentInfo;
        parentInfo.addChangeListener(
                WeakListeners.create(ChangeListener.class, this, parentInfo));

        stateChanged(new ChangeEvent(parentInfo));
    }

    @Override
    public Node createNodeForKey(OConnectionNode key) {
        //DBNode nd = new DBNode(key.toString());
        if (key != null) {
            return key;
        } else {
            return new AbstractNode(Children.LEAF);
        }
    }

    @Override
    protected boolean createKeys(List<OConnectionNode> keys) {
        List<OConnectionClass> ocsl = OConnectionRoot.LoadAllConnections();
        for (OConnectionClass ocs : ocsl) {
            keys.add(new OConnectionNode(ocs));
        }
        return true;
    }

    public void stateChanged(ChangeEvent e) {
        refresh(false);
    }
}
