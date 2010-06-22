/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions;

import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;
import javax.swing.KeyStroke;
import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.actions.CookieAction;

/**
 *
 * @author SUMsoft
 */
public class CompileLocalFileAction extends CookieAction {

    private static final Class[] COOKIE_CLASSES = new Class[]{
        CompileLocalFileCookieInterface.class
    };

    public CompileLocalFileAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F9, KeyEvent.CTRL_DOWN_MASK));
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
        Set<RefreshCookieInterface> refr = new HashSet<RefreshCookieInterface>();
        for (Node nd : arg0) {
            CompileLocalFileCookieInterface compile = nd.getCookie(CompileLocalFileCookieInterface.class);
            if (compile != null && compile.isLocalFileExists()) {
                compile.CompileLocalFile();
                RefreshCookieInterface refresh = nd.getParentNode().getCookie(RefreshCookieInterface.class);
                if (refresh != null) {
                    refr.add(refresh);
                }
            }
        }
        for (RefreshCookieInterface refresh : refr) {
            refresh.Refresh();
        }
    }

    @Override
    public String getName() {
        return Utils.getBundle().getString("LBL_CompileLocalFileAction");
    }

    @Override
    public HelpCtx getHelpCtx() {
        return new HelpCtx(CompileLocalFileAction.class);
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
        for (Node nd : activatedNodes) {
            CompileLocalFileCookieInterface compile = nd.getCookie(CompileLocalFileCookieInterface.class);
            if (compile == null || !compile.isLocalFileExists()) {
                return false;
            }
        }
        return true;
    }
}
