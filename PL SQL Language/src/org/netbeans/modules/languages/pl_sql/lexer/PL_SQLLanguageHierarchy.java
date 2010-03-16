/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.lexer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author asoumbatov
 */
public class PL_SQLLanguageHierarchy extends LanguageHierarchy<PL_SQLTokenId> {

    private static List<PL_SQLTokenId> tokens = new ArrayList<PL_SQLTokenId>();
    private static Map<Integer, PL_SQLTokenId> idToToken = new HashMap<Integer, PL_SQLTokenId>();

    static {
        TokenType[] tokenTypes = TokenType.values();
        for (TokenType tokenType : tokenTypes) {
            tokens.add(new PL_SQLTokenId(tokenType.name(), tokenType.category, tokenType.id));
        }
        for (PL_SQLTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized PL_SQLTokenId getToken(int id) {
        return idToToken.get(id);
    }

    protected synchronized Collection<PL_SQLTokenId> createTokenIds() {
        return tokens;
    }

    protected synchronized Lexer<PL_SQLTokenId> createLexer(LexerRestartInfo<PL_SQLTokenId> info) {
        return new PL_SQLLexer(info);
    }

    protected String mimeType() {
        return "text/pl_sql";
    }
}
