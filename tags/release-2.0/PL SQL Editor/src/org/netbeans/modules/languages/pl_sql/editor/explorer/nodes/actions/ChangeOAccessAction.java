/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions;

import org.netbeans.modules.languages.pl_sql.editor.oracletree.ObjectAccessed;
import org.openide.nodes.Node;
import org.openide.util.actions.CookieAction;

/**
 *
 * @author SUMsoft
 */
public abstract class ChangeOAccessAction extends CookieAction {

    private static final Class[] COOKIE_CLASSES = new Class[]{
        ChangeOAccessCookieInterface.class
    };

    protected void ChangeOAccess(Node nd, ObjectAccessed oa) {
        ChangeOAccessCookieInterface acc = nd.getCookie(ChangeOAccessCookieInterface.class);
        if (acc != null) {
            acc.ChangeOAccess(oa);
        }
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
    protected boolean asynchronous() {
        return false;
    }

    @Override
    protected boolean enable(Node[] activatedNodes) {
        if (activatedNodes.length == 0 || activatedNodes.length > 1) {
            return false;
        }

        Node node = activatedNodes[0];
        ChangeOAccessCookieInterface acc = node.getCookie(ChangeOAccessCookieInterface.class);
        if (acc != null) {
            return true;
        }

        return false;
    }
}
