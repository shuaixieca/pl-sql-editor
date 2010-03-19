/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.parser;

import javax.swing.event.ChangeListener;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer;
import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLParser;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * @author asoumbatov
 */
public class PLSQLParser extends Parser {

    private Snapshot snapshot;
    private PL_SQLParser parser;
    private PL_SQLLexer lexer;

    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) {
        this.snapshot = snapshot;
        ANTLRStringStream input = new ANTLRStringStream(snapshot.getText().toString());
        lexer = new PL_SQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new PL_SQLParser(tokens);
        try {
            parser.grammar_def();
            //parser.grammarDef();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Result getResult(Task task) {
        return new PL_SQLEditorParserResult(snapshot, parser, lexer);
    }

    public void cancel() {
    }

    public void addChangeListener(ChangeListener changeListener) {
    }

    public void removeChangeListener(ChangeListener changeListener) {
    }

    public static class PL_SQLEditorParserResult extends Result {

        private PL_SQLParser parser;
        private PL_SQLLexer lexer;
        private boolean valid = true;

        PL_SQLEditorParserResult(Snapshot snapshot, PL_SQLParser parser, PL_SQLLexer lexer) {
            super(snapshot);
            this.parser = parser;
            this.lexer = lexer;
        }

        public PL_SQLParser getPL_SQLParser()
                throws ParseException {
            if (!valid) {
                throw new ParseException();
            }
            return parser;
        }

        public PL_SQLLexer getLexer() {
            return lexer;
        }

        protected void invalidate() {
            valid = false;
        }
    }
}
