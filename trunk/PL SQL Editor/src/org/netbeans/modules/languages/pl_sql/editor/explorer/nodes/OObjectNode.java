/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import javax.swing.Action;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshAction;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.BaseClass;
import org.openide.actions.EditAction;
import org.openide.actions.PropertiesAction;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author SUMsoft
 */
public class OObjectNode extends AbstractNode {

    public OObjectNode(BaseClass ot) {
        //super(Children.create(new OObjectTypeNodeChildFactory(ot), false), Lookups.singleton(ot));
        //ot.addPropertyChangeListener(WeakListeners.propertyChange(this, ot));        
        super(Children.LEAF, Lookups.singleton(ot));
    }

    private BaseClass getBaseClass() {
        return (BaseClass) getLookup().lookup(BaseClass.class);
    }

    @Override
    public String getDisplayName() {

        return getBaseClass().toString();
    }

    @Override
    public Action[] getActions(boolean context) {
        if (context) {
            return super.getActions(context);
        } else {
            return new SystemAction[]{
                        SystemAction.get(EditAction.class),
                        SystemAction.get(DeleteAction.class),
                        null,
                        SystemAction.get(RefreshAction.class),
                        null,
                        SystemAction.get(PropertiesAction.class)
                    };
        }
    }

    @Override
    public Action getPreferredAction() {
        return SystemAction.get(EditAction.class);
    }
}