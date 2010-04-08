/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql;

import java.util.List;
import java.util.Map;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 *
 * @author SUMsoft
 */
public class PLSQLStructureScanner implements StructureScanner {

    public List<? extends StructureItem> scan(ParserResult pr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Map<String, List<OffsetRange>> folds(ParserResult pr) {
        System.out.println(pr);
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Configuration getConfiguration() {
        return new StructureScanner.Configuration(true, true);
    }
}
