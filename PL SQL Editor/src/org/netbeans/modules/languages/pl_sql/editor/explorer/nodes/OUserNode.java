/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.ConnectAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DisconnectAction;
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
import org.openide.util.WeakListeners;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author SUMsoft
 */
public class OUserNode extends AbstractNode implements PropertyChangeListener {

    public OUserNode(OUser ou) {
        super(ou.getIsConnected() ? Children.create(new OUserNodeChildFactory(ou), true) : Children.LEAF, Lookups.singleton(ou));
        //super(Children.create(new OUserNodeChildFactory(ou), true), Lookups.singleton(ou));
        ou.addPropertyChangeListener(WeakListeners.propertyChange(this, ou));
    }

    public void resetChildren() {
        if (getOUser().getIsConnected()) {
            this.setChildren(Children.create(new OUserNodeChildFactory(getOUser()), true));
        } else {
            this.setChildren(Children.LEAF);
        }
    }

    private OUser getOUser() {
        return (OUser) getLookup().lookup(OUser.class);
    }

    @Override
    public String getDisplayName() {
        return getOUser().toString();
    }

    @Override
    public String getHtmlDisplayName() {
        if (getOUser().getIsConnected()) {
            return "<b>" + getDisplayName() + "</b>";
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
                        SystemAction.get(ConnectAction.class),
                        SystemAction.get(DisconnectAction.class),
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

            Property IsConnectedProp = new PropertySupport.Reflection<Boolean>(obj, Boolean.class, "getIsConnected", null);
            IsConnectedProp.setName("Connected");
            set.put(IsConnectedProp);

        } catch (NoSuchMethodException ex) {
            ErrorManager.getDefault();
        }

        sheet.put(set);
        return sheet;
    }

    @Override
    public Action getPreferredAction() {
        if (getOUser().getIsConnected()) {
            return SystemAction.get(DisconnectAction.class);
        } else {
            return SystemAction.get(ConnectAction.class);
        }
    }

    public void propertyChange(PropertyChangeEvent evt) {
        if ("UserName".equals(evt.getPropertyName()) ||
                "IsConnected".equals(evt.getPropertyName())) {
            this.resetChildren();
            this.fireDisplayNameChange(null, getHtmlDisplayName());
        }
    }
}