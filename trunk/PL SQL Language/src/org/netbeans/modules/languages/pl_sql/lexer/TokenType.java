/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.lexer;

/**
 *
 * @author asoumbatov
 */
public enum TokenType {

    BLOCK_COMMENT(4, "comment"),
    LINE_COMMENT(5, "comment"),
    WHITESPACE(7, "whitespace"),
    OPERATOR(8, "operator"),
    OR_OPERATOR(11, "operator"),
    NOT_OPERATOR(17, "operator"),
    AND_OPERATOR(15, "operator"),
    NUMBER_UNSIGNED(6, "number");
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
