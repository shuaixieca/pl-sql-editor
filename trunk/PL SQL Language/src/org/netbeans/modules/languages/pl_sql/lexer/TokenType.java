/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.lexer;

import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer;

/**
 *
 * @author asoumbatov
 */
public enum TokenType {

    BLOCK_COMMENT(PL_SQLLexer.BLOCK_COMMENT, "comment"),
    LINE_COMMENT(PL_SQLLexer.LINE_COMMENT, "comment"),
    WHITESPACE(PL_SQLLexer.WHITESPACE, "whitespace"),
    OPERATOR(PL_SQLLexer.OPERATOR, "operator"),
    OR_OPERATOR(PL_SQLLexer.OR_OPERATOR, "operator"),
    NOT_OPERATOR(PL_SQLLexer.NOT_OPERATOR, "operator"),
    AND_OPERATOR(PL_SQLLexer.AND_OPERATOR, "operator"),
    NUMBER_UNSIGNED(PL_SQLLexer.NUMBER_UNSIGNED, "number");
    public int id;
    public String category;
    public String text;

    private TokenType(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public static TokenType valueOf(int id) {
        TokenType[] values = values();
        for (TokenType value : values) {
            if (value.id == id) {
                return value;
            }
        }
        throw new IllegalArgumentException("The id " + id + " is not recognized");
    }
}
