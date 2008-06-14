/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import javax.swing.Action;
import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.AddAction;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshAction;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OConnectionRoot;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author SUMsoft
 */
public class OConnectionRootNode extends AbstractNode {

    public OConnectionRootNode(OConnectionRoot ocr) {
        super(Children.create(new RootNodeChildFactory(ocr), false), Lookups.singleton(ocr));
    }

    @Override
    public Action[] getActions(boolean context) {
        if (context) {
            return super.getActions(context);
        } else {
            return new SystemAction[]{
                        SystemAction.get(AddAction.class),
                        null,
                        SystemAction.get(RefreshAction.class)
                    };
        }
    }

    @Override
    public String getDisplayName() {
        return Utils.getBundle().getString("LBL_RootNodeName");
    }

    public static Node GetRootNode() {
        OConnectionRoot ocr = new OConnectionRoot();
        //AbstractNode an = new AbstractNode(Children.create(new RootNodeChildFactory(ocr), true), Lookups.singleton(ocr));
        OConnectionRootNode ocrn = new OConnectionRootNode(ocr);
        //ocrn.setDisplayName(Utils.getBundle().getString("LBL_RootNodeName"));
        //AbstractNode an = new AbstractNode(Children.create(new RootNodeChildFactory(ocr), true));
        return ocrn;
    }
}
