/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.antlr;

import org.antlr.runtime.RecognitionException;

/**
 *
 * @author asoumbatov
 */
public class SyntaxError {

    public RecognitionException exception;
    public String message;
    public int line;
    public int charPositionInLine;
}
