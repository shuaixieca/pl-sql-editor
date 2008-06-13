/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions;

import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.actions.CookieAction;

/**
 *
 * @author SUMsoft
 */
public class DeleteAction extends CookieAction {

    private static final String ICON = "org/netbeans/modules/languages/pl_sql/editor/resources/subtract.gif";
    private static final Class[] COOKIE_CLASSES = new Class[]{
        DeleteCookieInterface.class
    };

    public DeleteAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
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
        for (Node nd : arg0) {
            DeleteCookieInterface delete = nd.getCookie(DeleteCookieInterface.class);
            if (delete != null) {
                int ret = JOptionPane.showConfirmDialog(null,
                        Utils.getBundle().getString("LBL_DeleteConfirmMsg") + " \"" + delete.toString() + "\"?",
                        Utils.getBundle().getString("LBL_DeleteConfirmCaptionMsg"), JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (ret == JOptionPane.YES_OPTION) {
                    delete.Delete();
                    Node node = nd.getParentNode();
                    RefreshCookieInterface refresh = null;
                    if (node != null) {
                        refresh = node.getCookie(RefreshCookieInterface.class);
                    }
                    try {
                        nd.destroy();
                        if (refresh != null) {
                            refresh.Refresh();
                        }
                    } catch (IOException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            }
        }
    }

    @Override
    public String getName() {
        return Utils.getBundle().getString("LBL_DeleteAction");
    }

    @Override
    public HelpCtx getHelpCtx() {
        return new HelpCtx(DeleteAction.class);
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
        DeleteCookieInterface delete = node.getCookie(DeleteCookieInterface.class);
        //if (server != null && server.isConnected()) {
        if (delete != null) {
            return true;
        }

        return false;
    }

    @Override
    public String iconResource() {
        return ICON;
    }
}
