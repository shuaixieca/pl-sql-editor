/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions;

import org.openide.nodes.Node.Cookie;

/**
 *
 * @author SUMsoft
 */
public interface CompileLocalFileCookieInterface extends Cookie {

    public void CompileLocalFile();
    public boolean isLocalFileExists();
    
}
