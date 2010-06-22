/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.bracesmatching;

import org.netbeans.spi.editor.bracesmatching.BracesMatcher;
import org.netbeans.spi.editor.bracesmatching.BracesMatcherFactory;
import org.netbeans.spi.editor.bracesmatching.MatcherContext;

/**
 *
 * @author asoumbatov
 */
public class PLSQLBracesMatcherFactory implements BracesMatcherFactory {

    public BracesMatcher createMatcher(MatcherContext context) {
        return new PLSQLBracesMatcher(context);
    }
}
