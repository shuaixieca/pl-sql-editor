/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions;

import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.OUserNode;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.actions.CookieAction;

/**
 *
 * @author SUMsoft
 */
public class ConnectAction extends CookieAction {

    private static final Class[] COOKIE_CLASSES = new Class[]{
        ConnectCookieInterface.class
    };

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
        for (Node nd : arg0) {
            ConnectCookieInterface connect = nd.getCookie(ConnectCookieInterface.class);
            connect.Connect();
            OUserNode oun = (OUserNode) nd;
            if (oun != null) {
                oun.resetChildren();
            }
        }
    }

    @Override
    public String getName() {
        return Utils.getBundle().getString("LBL_ConnectAction");
    }

    @Override
    public HelpCtx getHelpCtx() {
        return new HelpCtx(ConnectAction.class);
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }

    @Override
    protected boolean enable(Node[] activatedNodes) {
        if (activatedNodes.length == 0) {
            return false;
        }

        Node node = activatedNodes[0];
        ConnectCookieInterface connect = node.getCookie(ConnectCookieInterface.class);
        if (connect != null && !connect.getIsConnected()) {
            return true;
        }

        return false;
    }
}
