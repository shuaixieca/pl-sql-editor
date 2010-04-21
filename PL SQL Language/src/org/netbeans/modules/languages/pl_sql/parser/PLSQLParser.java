/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.parser;

import java.util.Collections;
import java.util.List;
import javax.swing.event.ChangeListener;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.ParserResult;
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
    private CommonTree tree;
    private CommonTokenStream tokens;

    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) {
        this.snapshot = snapshot;
        ANTLRStringStream input = new ANTLRStringStream(snapshot.getText().toString());
        lexer = new PL_SQLLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new PL_SQLParser(tokens);
        try {
            PL_SQLParser.grammar_def_return ret = parser.grammar_def();
            tree = (CommonTree) ret.getTree();
            //parser.grammarDef();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Result getResult(Task task) {
        return new PL_SQLEditorParserResult(snapshot, parser, lexer, tree, tokens);
    }

    public void cancel() {
    }

    public void addChangeListener(ChangeListener changeListener) {
    }

    public void removeChangeListener(ChangeListener changeListener) {
    }

    public static class PL_SQLEditorParserResult extends ParserResult {

        private PL_SQLParser parser;
        private PL_SQLLexer lexer;
        private CommonTree tree;
        private CommonTokenStream tokens;
        private boolean valid = true;

        PL_SQLEditorParserResult(Snapshot snapshot, PL_SQLParser parser, PL_SQLLexer lexer, CommonTree tree, CommonTokenStream tokens) {
            super(snapshot);
            this.parser = parser;
            this.lexer = lexer;
            this.tree = tree;
            this.tokens = tokens;
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

        public CommonTree getTree() {
            return tree;
        }

        public CommonTokenStream getTokens() {
            return tokens;
        }

        protected void invalidate() {
            valid = false;
        }

        @Override
        public List<? extends Error> getDiagnostics() {
            return Collections.<Error>emptyList();
        }
    }
}
