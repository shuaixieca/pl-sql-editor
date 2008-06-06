/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import org.netbeans.modules.languages.pl_sql.editor.oracletree.OConnectionClass;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author SUMsoft
 */
public class OConnectionNode extends AbstractNode {

    public OConnectionNode(OConnectionClass ocs) {
        super(Children.create(new OConnectionNodeChildFactory(ocs), true), Lookups.singleton(ocs));
    }

    public OConnectionClass getOConnectionClass() {
        return (OConnectionClass) getLookup().lookup(OConnectionClass.class);
    }

    @Override
    public String getDisplayName() {

        return getOConnectionClass().toString();
    }

    public static Node GetRootNode() {
        AbstractNode an = new AbstractNode(Children.create(new RootNodeChildFactory(), true));
        return an;
    }
}