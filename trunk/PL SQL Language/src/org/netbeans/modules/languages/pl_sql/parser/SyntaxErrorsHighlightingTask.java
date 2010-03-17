package org.netbeans.modules.languages.pl_sql.parser;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLParser.SyntaxError;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.ParserResultTask;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;
import org.openide.text.NbDocument;

public class SyntaxErrorsHighlightingTask extends ParserResultTask {

    public SyntaxErrorsHighlightingTask() {
    }

    public void run(Result result, SchedulerEvent event) {
        try {
            PLSQLParser.PL_SQLEditorParserResult sjResult = (PLSQLParser.PL_SQLEditorParserResult) result;
            List<SyntaxError> syntaxErrors = sjResult.getPL_SQLParser().syntaxErrors;
            Document document = result.getSnapshot().getSource().getDocument(false);
            List<ErrorDescription> errors = new ArrayList<ErrorDescription>();
            for (SyntaxError syntaxError : syntaxErrors) {
                RecognitionException exception = syntaxError.exception;
                Token token = exception.token;
                int line = exception.line;
                if (line <= 0) {
                    continue;
                }
                int start = NbDocument.findLineOffset((StyledDocument) document, token.getLine() - 1) + token.getCharPositionInLine();
                int end = start + token.getText().length();
                ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
                        Severity.ERROR,
                        syntaxError.message,
                        document,// line);
                        document.createPosition(start),
                        document.createPosition(end));
                errors.add(errorDescription);
            }
            HintsController.setErrors(document, "pl_sql", errors);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int getPriority() {
        return 100;
    }

    public Class<? extends Scheduler> getSchedulerClass() {
        return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
    }

    public void cancel() {
    }
}
