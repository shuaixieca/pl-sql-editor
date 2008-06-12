/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import javax.swing.Action;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.AddAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshAction;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OConnectionClass;
import org.openide.actions.PropertiesAction;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author SUMsoft
 */
public class OConnectionNode extends AbstractNode {

    public OConnectionNode(OConnectionClass ocs) {
        super(Children.create(new OConnectionNodeChildFactory(ocs), true), Lookups.singleton(ocs));
    //super(Children.create(new OConnectionNodeChildFactory(ocs), true));
    }

    public OConnectionClass getOConnectionClass() {
        return (OConnectionClass) getLookup().lookup(OConnectionClass.class);
    //return model;
    }

    @Override
    public String getDisplayName() {

        return getOConnectionClass().toString();
    }

    @Override
    public Action[] getActions(boolean context) {
        if (context) {
            return super.getActions(context);
        } else {
            return new SystemAction[]{
                        SystemAction.get(AddAction.class),
                        SystemAction.get(DeleteAction.class),
                        null,
                        SystemAction.get(RefreshAction.class),
                        null,
                        SystemAction.get(PropertiesAction.class)
                    };
        }
    }

    @Override
    public boolean canDestroy() {
        return true;
    }
}