/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql;

import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.languages.pl_sql.lexer.PLSQLTokenId;
import org.netbeans.modules.languages.pl_sql.parser.PLSQLParser;
import org.netbeans.modules.parsing.spi.Parser;

/**
 *
 * @author asoumbatov
 */
public class PLSQLLanguage extends DefaultLanguageConfig {

    @Override
    public Language getLexerLanguage() {
        return PLSQLTokenId.getLanguage();
    }

    @Override
    public Parser getParser() {
        return new PLSQLParser();
    }

    @Override
    public String getDisplayName() {
        return Utils.getBundle().getString("text/pl_sql");
    }
}
