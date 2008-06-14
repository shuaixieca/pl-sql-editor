/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.AddAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.EditAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshAction;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OConnectionClass;
import org.openide.ErrorManager;
import org.openide.actions.PropertiesAction;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.PropertySupport;
import org.openide.nodes.Sheet;
import org.openide.util.WeakListeners;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author SUMsoft
 */
public class OConnectionNode extends AbstractNode implements PropertyChangeListener {

    public OConnectionNode(OConnectionClass ocs) {
        super(Children.create(new OConnectionNodeChildFactory(ocs), false), Lookups.singleton(ocs));
        //super(Children.create(new OConnectionNodeChildFactory(ocs), true));
        ocs.addPropertyChangeListener(WeakListeners.propertyChange(this, ocs));
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
    public boolean canDestroy() {
        return true;
    }

    @Override
    protected Sheet createSheet() {

        Sheet sheet = Sheet.createDefault();
        Sheet.Set set = Sheet.createPropertiesSet();
        OConnectionClass obj = getOConnectionClass();

        try {
            Property ServerNameProp = new PropertySupport.Reflection<String>(obj, String.class, "getServerName", null);
            Property PortProp = new PropertySupport.Reflection<Integer>(obj, Integer.class, "getPort", null);
            Property DatabaseNameProp = new PropertySupport.Reflection<String>(obj, String.class, "getDatabaseName", null);

            ServerNameProp.setName("Server Name");
            PortProp.setName("Port");
            DatabaseNameProp.setName("Database Name");

            set.put(ServerNameProp);
            set.put(PortProp);
            set.put(DatabaseNameProp);

        } catch (NoSuchMethodException ex) {
            ErrorManager.getDefault();
        }

        sheet.put(set);
        return sheet;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        if ("ServerName".equals(evt.getPropertyName()) || "Port".equals(evt.getPropertyName()) || "DatabaseName".equals(evt.getPropertyName())) {
            this.fireDisplayNameChange(null, getDisplayName());
        }
    }
}