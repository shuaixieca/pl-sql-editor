/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions;

import java.util.HashSet;
import java.util.Set;
import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.actions.CookieAction;

/**
 *
 * @author SUMsoft
 */
public class CompileAction extends CookieAction {

    private static final Class[] COOKIE_CLASSES = new Class[]{
        CompileCookieInterface.class
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
        Set<RefreshCookieInterface> refr = new HashSet<RefreshCookieInterface>();
        for (Node nd : arg0) {
            CompileCookieInterface compile = nd.getCookie(CompileCookieInterface.class);
            if (compile != null) {
                compile.Compile();
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
        return Utils.getBundle().getString("LBL_CompileAction");
    }

    @Override
    public HelpCtx getHelpCtx() {
        return new HelpCtx(CompileAction.class);
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
            CompileCookieInterface compile = nd.getCookie(CompileCookieInterface.class);
            if (compile == null) {
                return false;
            }
        }
        return true;
    }
}
