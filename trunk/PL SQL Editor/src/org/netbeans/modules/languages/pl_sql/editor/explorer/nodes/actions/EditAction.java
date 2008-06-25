/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions;

import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.actions.CookieAction;

/**
 *
 * @author SUMsoft
 */
public class EditAction extends CookieAction {

    private static final Class[] COOKIE_CLASSES = new Class[]{
        EditCookieInterface.class
    };

    public EditAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
    }

    @Override
    protected int mode() {
        return MODE_EXACTLY_ONE;
    }

    @Override
    protected Class<?>[] cookieClasses() {
        return COOKIE_CLASSES;
    }

    @Override
    protected void performAction(Node[] arg0) {
        //Object cls = arg0[0];
        //JOptionPane.showMessageDialog(null, "Object is " + cls.getClass().getName());
        Node nd = arg0[0];
        EditCookieInterface edit = nd.getCookie(EditCookieInterface.class);
        if (edit != null) {
            edit.Edit();
        }
    }

    @Override
    public String getName() {
        return Utils.getBundle().getString("LBL_EditAction");
    }

    @Override
    public HelpCtx getHelpCtx() {
        return new HelpCtx(EditAction.class);
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }

    @Override
    protected boolean enable(Node[] activatedNodes) {
        if (activatedNodes.length == 0 || activatedNodes.length > 1) {
            return false;
        }

        Node node = activatedNodes[0];
        EditCookieInterface edit = node.getCookie(EditCookieInterface.class);
        if (edit != null && !edit.getIsConnected()) {
            return true;
        }

        return false;
    }
}
