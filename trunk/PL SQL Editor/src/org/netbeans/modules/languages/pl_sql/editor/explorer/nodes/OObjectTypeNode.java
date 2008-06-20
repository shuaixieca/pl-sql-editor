/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OObjectType;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author SUMsoft
 */
public class OObjectTypeNode extends AbstractNode {

    public OObjectTypeNode(OObjectType ot) {
        //super(Children.LEAF, Lookups.singleton(ot));
        super(Children.create(new OObjectTypeNodeChildFactory(ot), true), Lookups.singleton(ot));
        Utils.setOracleIconBase(this, ot.getObjecttype(), true);
    //ot.addPropertyChangeListener(WeakListeners.propertyChange(this, ou));
    }

    private OObjectType getOObjectType() {
        return (OObjectType) getLookup().lookup(OObjectType.class);
    }

    @Override
    public String getDisplayName() {

        return getOObjectType().toString();
    }

    @Override
    public boolean canDestroy() {
        return false;
    }
}