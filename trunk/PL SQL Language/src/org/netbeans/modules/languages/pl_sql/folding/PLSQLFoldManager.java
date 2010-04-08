/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.folding;

import javax.swing.event.DocumentEvent;
import org.netbeans.api.editor.fold.Fold;
import org.netbeans.spi.editor.fold.FoldHierarchyTransaction;
import org.netbeans.spi.editor.fold.FoldManager;
import org.netbeans.spi.editor.fold.FoldOperation;

/**
 *
 * @author asoumbatov
 */
public class PLSQLFoldManager implements FoldManager {

    public void init(FoldOperation operation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void initFolds(FoldHierarchyTransaction transaction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insertUpdate(DocumentEvent evt, FoldHierarchyTransaction transaction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeUpdate(DocumentEvent evt, FoldHierarchyTransaction transaction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void changedUpdate(DocumentEvent evt, FoldHierarchyTransaction transaction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeEmptyNotify(Fold epmtyFold) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeDamagedNotify(Fold damagedFold) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void expandNotify(Fold expandedFold) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void release() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
