/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions;

import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.ObjectAccessed;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;

/**
 *
 * @author SUMsoft
 */
public class DBAOAccessAction extends ChangeOAccessAction {

    private static final String ICON = "org/netbeans/modules/languages/pl_sql/editor/resources/mydba.gif";

    @Override
    protected void performAction(Node[] arg0) {
        Node nd = arg0[0];
        ChangeOAccess(nd, ObjectAccessed.DBA);
    }

    @Override
    public String getName() {
        return Utils.getBundle().getString("LBL_DBAOAccessAction");
    }

    @Override
    public HelpCtx getHelpCtx() {
        return new HelpCtx(DBAOAccessAction.class);
    }

    @Override
    public String iconResource() {
        return ICON;
    }
}
