/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.lexer;

import org.antlr.runtime.Token;
import org.netbeans.modules.languages.pl_sql.AntlrCharStream;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author asoumbatov
 */
public class PL_SQLLexer implements Lexer<PL_SQLTokenId> {

    private LexerRestartInfo<PL_SQLTokenId> info;
    private org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer lexer;

    public PL_SQLLexer(LexerRestartInfo<PL_SQLTokenId> info) {
        this.info = info;

        AntlrCharStream charStream = new AntlrCharStream(info.input(), "PL/SQL Editor");
        lexer = new org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer(charStream);
    }

    public org.netbeans.api.lexer.Token<PL_SQLTokenId> nextToken() {
        Token token = lexer.nextToken();
        if (token.getType() != org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer.EOF) {
            PL_SQLTokenId tokenId = PL_SQLLanguageHierarchy.getToken(token.getType());
            return info.tokenFactory().createToken(tokenId);
        }
        return null;
    }

    public Object state() {
        return null;
    }

    public void release() {
    }
}
