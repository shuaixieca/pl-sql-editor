/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions;

import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.actions.CookieAction;

/**
 *
 * @author SUMsoft
 */
public class AddAction extends CookieAction {

    private static final String ICON = "org/netbeans/modules/languages/pl_sql/editor/resources/add.gif";
    private static final Class[] COOKIE_CLASSES = new Class[]{
        AddCookieInterface.class
    };

    /*public AddAction() {
    putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_INSERT, 0));
    }*/
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
        /*Node found = nd.getChildren().findChild("svco");
        if (found != null) {
        JOptionPane.showMessageDialog(null, "Found " + found.getName());
        return;
        }*/
        AddCookieInterface add = nd.getCookie(AddCookieInterface.class);
        if (add != null) {
            add.Add();
        }

    }

    @Override
    public String getName() {
        return Utils.getBundle().getString("LBL_AddAction");
    }

    @Override
    public HelpCtx getHelpCtx() {
        return new HelpCtx(AddAction.class);
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
        AddCookieInterface add = node.getCookie(AddCookieInterface.class);
        //if (server != null && server.isConnected()) {
        if (add != null) {
            return true;
        }

        return false;
    }

    @Override
    public String iconResource() {
        return ICON;
    }
}
