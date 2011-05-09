/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.completion;

import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.openide.util.Exceptions;

/**
 *
 * @author asoumbatov
 */
public class PLSQLCompletionProvider implements CompletionProvider {

    public CompletionTask createTask(int queryType, JTextComponent component) {
        return null;
    }

    public int getAutoQueryTypes(JTextComponent component, String typedText) {
        autoCompletion(component);
        return 0;
    }

    private static void autoCompletion(JTextComponent component) {
        try {
            int offset = component.getCaretPosition();
            String fragment = component.getText(0, offset);
            if (fragment.endsWith("/*")) {
                complete(component, offset, "*/");
            } else if (fragment.endsWith("<<")) {
                complete(component, offset, ">>");
            } else if (fragment.endsWith("(")) {
                complete(component, offset, ")");
            }
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private static void complete(JTextComponent component, int offset, String s) throws BadLocationException {
        component.getDocument().insertString(offset, s, null);
        component.setCaretPosition(offset);
    }
}
