/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.lexer;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author asoumbatov
 */
public class PL_SQLTokenId implements TokenId {

    private static final Language<PL_SQLTokenId> language = new PL_SQLLanguageHierarchy().language();
    private final String name;
    private final String primaryCategory;
    private final int id;

    public PL_SQLTokenId(String name, String primaryCategory, int id) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
    }

    public String primaryCategory() {
        return primaryCategory;
    }

    public int ordinal() {
        return id;
    }

    public String name() {
        return name;
    }

    public static final Language<PL_SQLTokenId> getLanguage() {
        return language;
    }
}
