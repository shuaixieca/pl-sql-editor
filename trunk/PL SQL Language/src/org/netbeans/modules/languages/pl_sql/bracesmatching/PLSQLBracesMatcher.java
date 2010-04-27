/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.bracesmatching;

import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer;
import org.netbeans.spi.editor.bracesmatching.BracesMatcher;
import org.netbeans.spi.editor.bracesmatching.MatcherContext;

/**
 *
 * @author asoumbatov
 */
public class PLSQLBracesMatcher implements BracesMatcher {

    private MatcherContext context;

    private class BracePair {

        int open;       // Lexer ordinal of opening brace eg { or [
        int close;      // Lexer ordinal of closing brace eg } or }

        private BracePair(int op, int cl) {
            open = op;
            close = cl;
        }
    }
    BracePair[] bracePairs = {
        new BracePair(PL_SQLLexer.LPAREN, PL_SQLLexer.RPAREN)
    };

    PLSQLBracesMatcher(MatcherContext context) {
        this.context = context;
    }

    public int[] findOrigin() throws InterruptedException, BadLocationException {
        int[] array = {1,2};

        ((AbstractDocument) context.getDocument()).readLock();
        try {
        } finally {
            ((AbstractDocument) context.getDocument()).readUnlock();
        }
        return array;
    }

    public int[] findMatches() throws InterruptedException, BadLocationException {
        int[] array = {10,11};
        return array;
    }
}
