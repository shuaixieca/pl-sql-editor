/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.util.List;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.BaseClass;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OObjectType;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.WeakListeners;

/**
 *
 * @author SUMsoft
 */
public final class OObjectTypeNodeChildFactory extends ChildFactory<OObjectNode>
        implements ChangeListener {

    private final OObjectType parentInfo;

    public OObjectTypeNodeChildFactory(OObjectType parentinfo) {
        super();
        this.parentInfo = parentinfo;
        parentInfo.addChangeListener(
                WeakListeners.create(ChangeListener.class, this, parentInfo));

        stateChanged(new ChangeEvent(parentInfo));
    }

    @Override
    public Node createNodeForKey(OObjectNode key) {
        if (key != null) {
            return key;
        } else {
            return new AbstractNode(Children.LEAF);
        }
    }

    @Override
    protected boolean createKeys(List<OObjectNode> keys) {
        List<BaseClass> l = parentInfo.LoadAllObjects();
        for (BaseClass bc : l) {
            keys.add(new OObjectNode(bc));
        }
        return true;
    }

    public void stateChanged(ChangeEvent e) {
        refresh(false);
    }
}
