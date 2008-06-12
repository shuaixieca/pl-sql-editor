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
public class RefreshAction extends CookieAction {

    private static final String ICON = "org/netbeans/modules/languages/pl_sql/editor/resources/reload.gif";
    private static final Class[] COOKIE_CLASSES = new Class[]{
        RefreshCookieInterface.class
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
            RefreshCookieInterface refresh = nd.getCookie(RefreshCookieInterface.class);
            if (refresh != null) {
                refresh.Refresh();
            }
        }
    }

    @Override
    public String getName() {
        return Utils.getBundle().getString("LBL_RefreshAction");
    }

    @Override
    public HelpCtx getHelpCtx() {
        return new HelpCtx(RefreshAction.class);
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

        RefreshCookieInterface refresh = node.getCookie(RefreshCookieInterface.class);
        //if (server != null && server.isConnected()) {
        if (refresh != null) {
            return true;
        }

        return false;
    }

    @Override
    public String iconResource() {
        return ICON;
    }

    /*
    @Override
    public Component getToolbarPresenter() {
    JButton RefreshjButton = new JButton();
    RefreshjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/languages/pl_sql/editor/resources/reload.gif"))); // NOI18N
    RefreshjButton.setFocusable(false);
    return RefreshjButton;
    }*/
}
