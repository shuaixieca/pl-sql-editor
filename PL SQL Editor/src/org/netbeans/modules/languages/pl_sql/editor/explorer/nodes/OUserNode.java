/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import javax.swing.Action;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.EditAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshAction;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OUser;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.RoleTypes;
import org.openide.ErrorManager;
import org.openide.actions.PropertiesAction;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.PropertySupport;
import org.openide.nodes.Sheet;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author SUMsoft
 */
public class OUserNode extends AbstractNode {

    public OUserNode(OUser ou) {
        super(Children.LEAF, Lookups.singleton(ou));
    }

    private OUser getOUser() {
        return (OUser) getLookup().lookup(OUser.class);
    }

    @Override
    public String getDisplayName() {

        return getOUser().toString();
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
    public boolean canDestroy() {
        return true;
    }

    @Override
    protected Sheet createSheet() {

        Sheet sheet = Sheet.createDefault();
        Sheet.Set set = Sheet.createPropertiesSet();
        OUser obj = getOUser();

        try {
            Property UserNameProp = new PropertySupport.Reflection<String>(obj, String.class, "getUserName", null);
            UserNameProp.setName("User Name");
            set.put(UserNameProp);

            Property SavePasswordProp = new PropertySupport.Reflection<Boolean>(obj, Boolean.class, "getSavePassword", null);
            SavePasswordProp.setName("Save password?");
            set.put(SavePasswordProp);
            
            Property ConnectRoleProp = new PropertySupport.Reflection<RoleTypes>(obj, RoleTypes.class, "getConnectRole", null);
            ConnectRoleProp.setName("Connect as");
            set.put(ConnectRoleProp);
        } catch (NoSuchMethodException ex) {
            ErrorManager.getDefault();
        }

        sheet.put(set);
        return sheet;
    }
}