/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.formatter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
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
    private static final List<Integer> FORMAT_TOKEN_LIST = new ArrayList<Integer>();

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

        FORMAT_TOKEN_LIST.add(PL_SQLLexer.BEGIN_KEYWORD);
        FORMAT_TOKEN_LIST.add(PL_SQLLexer.LOOP_KEYWORD);
        FORMAT_TOKEN_LIST.add(PL_SQLLexer.IF_KEYWORD);
        FORMAT_TOKEN_LIST.add(PL_SQLLexer.CASE_KEYWORD);
    }

    public void reformat(Context context, ParserResult pr) {
        reformat(context, indentSize());
    }

    private void reformat(Context context, int indent) {
        Document doc = context.document();
        TokenHierarchy th = TokenHierarchy.get(doc);
        TokenSequence ts = th.tokenSequence();
        ts.moveStart();
        int newIndent = 0;
        boolean nextIndent = false;
        TreeMap<Integer, Integer> newIdentMap = new TreeMap<Integer, Integer>(new ReverseOrderInteger());
        do {
            Token token = ts.token();
            if (token != null && token.id().ordinal() != PL_SQLLexer.WHITESPACE) {
                if (nextIndent) {
                    newIndent += indent;
                    nextIndent = false;
                }
                if (FORMAT_TOKEN_LIST.contains(token.id().ordinal())) {
                    nextIndent = true;
                }
                if (LA(token, ts)) {
                    newIndent -= indent;
                }
                if (newIndent < 0) {
                    newIndent = 0;
                }
                try {
                    newIdentMap.put(context.lineStartOffset(ts.offset()), newIndent);
                } catch (BadLocationException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        } while (ts.moveNext());
        for (Integer line : newIdentMap.keySet()) {
            //System.out.println(line + " : " + newIdentMap.get(line));
            setIndent(context, line, newIdentMap.get(line));
        }
        //System.out.println("--------------------");
    }

    private boolean LA(Token token, TokenSequence ts) {
        boolean ret = false;
        if (token.id().ordinal() == PL_SQLLexer.END_KEYWORD) {
            ret = true;
            //int orgOffset = ts.offset();
            Token nextToken = null;
            while (ts.moveNext()) {
                nextToken = ts.token();
                if (nextToken == null || nextToken.id().ordinal() != PL_SQLLexer.WHITESPACE) {
                    break;
                }
            }
            /*if (nextToken == null || !FORMAT_TOKEN_LIST.contains(nextToken.id().ordinal())) {
            ts.move(orgOffset);
            }*/
        }
        return ret;
    }

    private void setIndent(Context context, int offset, int indent) {
        try {
            int currentLineIndent = context.lineIndent(context.lineStartOffset(offset));
            if (currentLineIndent != indent) {
                context.modifyIndent(context.lineStartOffset(offset), indent);
            }
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
        }
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
        return false;
    }

    public int indentSize() {
        return INDENT_SIZE;
    }

    public int hangingIndentSize() {
        return indentSize();
    }

    private class ReverseOrderInteger implements Comparator<Integer> {

        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }
}
