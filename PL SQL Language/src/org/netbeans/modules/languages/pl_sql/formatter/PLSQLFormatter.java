/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.formatter;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.Formatter;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer;
import org.openide.util.Exceptions;

/**
 *
 * @author asoumbatov
 */
public class PLSQLFormatter implements Formatter {

    private static final int INDENT_SIZE = 2;
    private static final List<Integer> INDENT_TOKEN_LIST = new ArrayList<Integer>();

    static {
        INDENT_TOKEN_LIST.add(PL_SQLLexer.BEGIN_KEYWORD);
        INDENT_TOKEN_LIST.add(PL_SQLLexer.DECLARE_KEYWORD);
        INDENT_TOKEN_LIST.add(PL_SQLLexer.AS_KEYWORD);
        INDENT_TOKEN_LIST.add(PL_SQLLexer.IS_KEYWORD);
        INDENT_TOKEN_LIST.add(PL_SQLLexer.LOOP_KEYWORD);
        INDENT_TOKEN_LIST.add(PL_SQLLexer.WHILE_KEYWORD);
        INDENT_TOKEN_LIST.add(PL_SQLLexer.THEN_KEYWORD);
        INDENT_TOKEN_LIST.add(PL_SQLLexer.ELSE_KEYWORD);
        INDENT_TOKEN_LIST.add(PL_SQLLexer.EXCEPTION_KEYWORD);
    }

    public void reformat(Context context, ParserResult pr) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void reindent(Context context) {
        Document doc = context.document();
        TokenHierarchy th = TokenHierarchy.get(doc);
        TokenSequence ts = th.tokenSequence();
        int startOffset = context.startOffset();
        /*int endOffset = context.endOffset();
        System.out.println("startOffset=" + startOffset);
        System.out.println("endOffset=" + endOffset);*/
        try {
            int indent = context.lineIndent(context.lineStartOffset(startOffset - 1));
            if (isPreviosIndentTokenAtContext(ts, startOffset)) {
                indent += indentSize(); // add extra indent
            }
            context.modifyIndent(context.lineStartOffset(startOffset), indent);
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private static boolean isPreviosIndentTokenAtContext(TokenSequence ts, int offset) {
        ts.move(offset);
        do {
            if (!ts.movePrevious()) {
                return false;
            }
            Token token = ts.token();
            if (INDENT_TOKEN_LIST.contains(token.id().ordinal())) {
                return true;
            }
        } while (ts.token().id().ordinal() == PL_SQLLexer.WHITESPACE);
        return false;
    }

    public boolean needsParserResult() {
        return true;
    }

    public int indentSize() {
        return INDENT_SIZE;
    }

    public int hangingIndentSize() {
        return indentSize();
    }
}
