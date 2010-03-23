/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.lexer;

import org.antlr.runtime.Token;
import org.netbeans.modules.languages.pl_sql.antlr.AntlrCharStream;
import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author asoumbatov
 */
public class PLSQLLexer implements Lexer<PLSQLTokenId> {

    private LexerRestartInfo<PLSQLTokenId> info;
    private PL_SQLLexer lexer;

    public PLSQLLexer(LexerRestartInfo<PLSQLTokenId> info) {
        this.info = info;

        AntlrCharStream charStream = new AntlrCharStream(info.input(), "PL/SQL Editor");
        lexer = new PL_SQLLexer(charStream);
    }

    public org.netbeans.api.lexer.Token<PLSQLTokenId> nextToken() {
        Token token = lexer.nextToken();
        System.out.println("tokenType=" + token.getType());
        if (token.getType() != PL_SQLLexer.EOF) {
            PLSQLTokenId tokenId = PLSQLLanguageHierarchy.getToken(token.getType());
            //System.out.println("tokenId=" + tokenId.ordinal());
            if (tokenId != null) {
                return info.tokenFactory().createToken(tokenId);
            }
        }
        return null;
    }

    public Object state() {
        return null;
    }

    public void release() {
    }
}
