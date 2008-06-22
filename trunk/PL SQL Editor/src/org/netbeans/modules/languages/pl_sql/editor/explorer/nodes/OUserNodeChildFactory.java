/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OConnectionClass;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OObjectType;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OUser;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.ObjectTypes;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.WeakListeners;

/**
 *
 * @author SUMsoft
 */
public final class OUserNodeChildFactory extends ChildFactory<OObjectTypeNode>
        implements ChangeListener {

    private final OUser parentInfo;

    public OUserNodeChildFactory(OUser parentInfo) {
        super();
        this.parentInfo = parentInfo;
        parentInfo.addChangeListener(
                WeakListeners.create(ChangeListener.class, this, parentInfo));

        stateChanged(new ChangeEvent(parentInfo));
    }

    @Override
    public Node createNodeForKey(OObjectTypeNode key) {
        if (key != null) {
            return key;
        } else {
            return new AbstractNode(Children.LEAF);
        }
    }

    @Override
    protected boolean createKeys(List<OObjectTypeNode> keys) {
        /*if (!parentInfo.getIsConnected()) {
        parentInfo.Connect();
        }*/
        if (parentInfo.getIsConnected()) {
            keys.add(new OObjectTypeNode(new OObjectType(ObjectTypes.FUNCTION, parentInfo)));
            keys.add(new OObjectTypeNode(new OObjectType(ObjectTypes.PROCEDURE, parentInfo)));
            keys.add(new OObjectTypeNode(new OObjectType(ObjectTypes.PACKAGE, parentInfo)));
            keys.add(new OObjectTypeNode(new OObjectType(ObjectTypes.PACKAGE_BODY, parentInfo)));
            keys.add(new OObjectTypeNode(new OObjectType(ObjectTypes.TYPE, parentInfo)));
            keys.add(new OObjectTypeNode(new OObjectType(ObjectTypes.TYPE_BODY, parentInfo)));
            keys.add(new OObjectTypeNode(new OObjectType(ObjectTypes.TRIGGER, parentInfo)));
        }
        return true;
    }

    public void stateChanged(ChangeEvent e) {
        refresh(false);
    }
}
