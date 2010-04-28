/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.bracesmatching;

import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer;
import org.netbeans.spi.editor.bracesmatching.BracesMatcher;
import org.netbeans.spi.editor.bracesmatching.MatcherContext;

/**
 *
 * @author asoumbatov
 */
public class PLSQLBracesMatcher implements BracesMatcher {

    private MatcherContext context;
    private int originToken;
    private int matchToken;
    private boolean searchForward;

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
    //new BracePair(PL_SQLLexer.BEGIN_KEYWORD, PL_SQLLexer.END_KEYWORD)
    };

    PLSQLBracesMatcher(MatcherContext context) {
        this.context = context;
    }

    public int[] findOrigin() throws InterruptedException, BadLocationException {
        int[] ret = null;

        AbstractDocument doc = (AbstractDocument) context.getDocument();
        doc.readLock();
        try {
            TokenHierarchy th = TokenHierarchy.get(doc);
            TokenSequence ts = th.tokenSequence();
            Token token = findTokenAtContext(ts, context.getSearchOffset());
            if (token == null) {
                return null;
            }
            int ordinal = token.id().ordinal();
            for (BracePair bp : bracePairs) {
                if (ordinal == bp.open) {
                    originToken = bp.open;
                    matchToken = bp.close;
                    searchForward = true;
                    ret = new int[]{ts.offset(), ts.offset() + token.length()};
                } else if (ordinal == bp.close) {
                    originToken = bp.close;
                    matchToken = bp.open;
                    searchForward = false;
                    ret = new int[]{ts.offset(), ts.offset() + token.length()};
                }
            }
        } finally {
            ((AbstractDocument) context.getDocument()).readUnlock();
        }
        return ret;
        //return defaultMatcher.findOrigin();
    }

    private static Token findTokenAtContext(TokenSequence ts, int offset) {
        ts.move(offset);
        Token token = ts.token();
        //there are cases when this could be null
        //in which case use the next one.
        if (token == null) {
            ts.moveNext();
            token = ts.token();
        }
        return token;
    }

    public int[] findMatches() throws InterruptedException, BadLocationException {
        int[] ret = null;

        AbstractDocument doc = (AbstractDocument) context.getDocument();
        doc.readLock();
        try {
            TokenHierarchy th = TokenHierarchy.get(doc);
            TokenSequence ts = th.tokenSequence();
            //System.out.println("--------------------");
            ret = findPaar(ts, context.getSearchOffset(), originToken, matchToken, searchForward);
        } finally {
            ((AbstractDocument) context.getDocument()).readUnlock();
        }
        return ret;
    }

    private int[] findPaar(TokenSequence ts, int searchOffset, int originToken, int matchToken, boolean searchForward) {
        int[] ret = null;
        int count = 0;
        ts.move(searchOffset);
        if (searchForward) {
            ts.moveNext(); // skip originToken
        }
        while (searchForward ? ts.moveNext() : ts.movePrevious()) {
            if (MatcherContext.isTaskCanceled()) {
                return null;
            }
            Token t = ts.token();
            if (t.id().ordinal() == originToken) {
                count++;
            }
            if (t.id().ordinal() == matchToken) {
                count--;
            }
            //System.out.println(t);
            if (count == -1) {
                ret = new int[]{ts.offset(), ts.offset() + t.length()};
                break;
            }
        }
        return ret;
    }
}
