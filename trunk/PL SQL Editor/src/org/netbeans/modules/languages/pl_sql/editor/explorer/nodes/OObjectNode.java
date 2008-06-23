/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.awt.Image;
import java.util.Date;
import javax.swing.Action;
import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.CompileLocalFileAction;
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
import org.openide.util.Utilities;

/**
 *
 * @author SUMsoft
 */
public class OObjectNode extends AbstractNode {

    private final String ERROR_BADGE_PATH = "org/netbeans/modules/languages/pl_sql/editor/resources/error_pix.png";

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
        if (!getBaseClass().isValid()) {
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
                        SystemAction.get(CompileLocalFileAction.class),
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
    public Image getIcon(int type) {
        Image original = super.getIcon(type);
        if (getBaseClass().isValid()) {
            return original;
        } else {
            Image errorBadge =
                    Utilities.loadImage(ERROR_BADGE_PATH);
            return Utilities.mergeImages(original,
                    errorBadge, 6, 6);
        }
    }

    @Override
    @SuppressWarnings("unchecked") 
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
            PropertySupport.Reflection LocalFileProp = new PropertySupport.Reflection<String>(obj, String.class, "getLocalFile", "setLocalFile");

            ObjectNameProp.setName("Name");
            ObjectTypeProp.setName("Type");
            CreatedProp.setName("Created");
            LastDDLTimeProp.setName("Last DDL Time");
            StatusProp.setName("Status");
            LocalFileProp.setName("Local File");
            LocalFileProp.setPropertyEditorClass(LocalFileEditor.class);

            set.put(ObjectNameProp);
            set.put(ObjectTypeProp);
            set.put(CreatedProp);
            set.put(LastDDLTimeProp);
            set.put(StatusProp);
            set.put(LocalFileProp);

        } catch (NoSuchMethodException ex) {
            ErrorManager.getDefault();
        }

        sheet.put(set);
        return sheet;
    }
}