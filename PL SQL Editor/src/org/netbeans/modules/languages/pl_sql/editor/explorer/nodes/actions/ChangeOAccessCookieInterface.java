/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions;

import org.netbeans.modules.languages.pl_sql.editor.oracletree.ObjectAccessed;
import org.openide.nodes.Node.Cookie;

/**
 *
 * @author SUMsoft
 */
public interface ChangeOAccessCookieInterface extends Cookie {

    public void ChangeOAccess(ObjectAccessed oa);
    
    public ObjectAccessed getObjectAccessed();
}
