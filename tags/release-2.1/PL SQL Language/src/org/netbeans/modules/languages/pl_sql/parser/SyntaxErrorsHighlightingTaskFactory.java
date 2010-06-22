package org.netbeans.modules.languages.pl_sql.parser;

import java.util.Collection;
import java.util.Collections;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.SchedulerTask;
import org.netbeans.modules.parsing.spi.TaskFactory;

public class SyntaxErrorsHighlightingTaskFactory extends TaskFactory {

    public Collection<? extends SchedulerTask> create(Snapshot snapshot) {
        return Collections.singleton(new SyntaxErrorsHighlightingTask());
    }
}
