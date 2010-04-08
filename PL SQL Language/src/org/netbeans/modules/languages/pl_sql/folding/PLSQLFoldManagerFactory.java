/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.folding;

import org.netbeans.spi.editor.fold.FoldManager;
import org.netbeans.spi.editor.fold.FoldManagerFactory;

/**
 *
 * @author asoumbatov
 */
public class PLSQLFoldManagerFactory implements FoldManagerFactory {

    public FoldManager createFoldManager() {
        System.out.println("folding!!!!!!!!!!!");
        return new PLSQLFoldManager();
    }
}
