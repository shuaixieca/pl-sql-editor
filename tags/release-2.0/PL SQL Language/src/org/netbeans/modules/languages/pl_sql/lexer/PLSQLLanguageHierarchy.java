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
public class PLSQLLanguageHierarchy extends LanguageHierarchy<PLSQLTokenId> {

    private static List<PLSQLTokenId> tokens = new ArrayList<PLSQLTokenId>();
    private static Map<Integer, PLSQLTokenId> idToToken = new HashMap<Integer, PLSQLTokenId>();

    static {
        TokenType[] tokenTypes = TokenType.values();
        for (TokenType tokenType : tokenTypes) {
            tokens.add(new PLSQLTokenId(tokenType.name(), tokenType.category, tokenType.id));
        }
        for (PLSQLTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized PLSQLTokenId getToken(int id) {
        return idToToken.get(id);
    }

    protected synchronized Collection<PLSQLTokenId> createTokenIds() {
        return tokens;
    }

    protected synchronized Lexer<PLSQLTokenId> createLexer(LexerRestartInfo<PLSQLTokenId> info) {
        return new PLSQLLexer(info);
    }

    protected String mimeType() {
        return "text/pl_sql";
    }
}
