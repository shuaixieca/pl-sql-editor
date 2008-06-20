/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.util.Date;
import javax.swing.Action;
import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshAction;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.BaseClass;
import org.openide.ErrorManager;
import org.openide.actions.EditAction;
import org.openide.actions.PropertiesAction;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.PropertySupport;
import org.openide.nodes.Sheet;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.ObjectTypes;

/**
 *
 * @author SUMsoft
 */
public class OObjectNode extends AbstractNode {

    public OObjectNode(BaseClass ot) {
        //super(Children.create(new OObjectTypeNodeChildFactory(ot), false), Lookups.singleton(ot));
        //ot.addPropertyChangeListener(WeakListeners.propertyChange(this, ot));        
        super(Children.LEAF, Lookups.singleton(ot));
        Utils.setOracleIconBase(this, ot.getObjectType(), false);
    }

    private BaseClass getBaseClass() {
        return (BaseClass) getLookup().lookup(BaseClass.class);
    }

    @Override
    public String getDisplayName() {

        return getBaseClass().toString();
    }

    @Override
    public String getHtmlDisplayName() {
        if (getBaseClass().getStatus().equalsIgnoreCase("INVALID")) {
            return "<font color=\"#FF0000\">" + getDisplayName() + "</font>";
        } else {
            return null;
        }
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

    @Override
    protected Sheet createSheet() {

        Sheet sheet = Sheet.createDefault();
        Sheet.Set set = Sheet.createPropertiesSet();
        BaseClass obj = getBaseClass();

        try {
            Property ObjectNameProp = new PropertySupport.Reflection<String>(obj, String.class, "toString", null);
            Property ObjectTypeProp = new PropertySupport.Reflection<ObjectTypes>(obj, ObjectTypes.class, "getObjectType", null);
            Property CreatedProp = new PropertySupport.Reflection<Date>(obj, Date.class, "getCreated", null);
            Property LastDDLTimeProp = new PropertySupport.Reflection<Date>(obj, Date.class, "getLastDDLTime", null);
            Property StatusProp = new PropertySupport.Reflection<String>(obj, String.class, "getStatus", null);

            ObjectNameProp.setName("Name");
            ObjectTypeProp.setName("Type");
            CreatedProp.setName("Created");
            LastDDLTimeProp.setName("Last DDL Time");
            StatusProp.setName("Status");

            set.put(ObjectNameProp);
            set.put(ObjectTypeProp);
            set.put(CreatedProp);
            set.put(LastDDLTimeProp);
            set.put(StatusProp);

        } catch (NoSuchMethodException ex) {
            ErrorManager.getDefault();
        }

        sheet.put(set);
        return sheet;
    }
}