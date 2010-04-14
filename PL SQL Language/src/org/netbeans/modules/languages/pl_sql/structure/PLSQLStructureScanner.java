/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.languages.pl_sql.Utils;

/**
 *
 * @author SUMsoft
 */
public class PLSQLStructureScanner implements StructureScanner {

    public List<? extends StructureItem> scan(ParserResult pr) {
        List<StructureItem> items = new ArrayList<StructureItem>();
        return items;
    }

    public Map<String, List<OffsetRange>> folds(ParserResult pr) {
        CommonTree tree = Utils.getRoot(pr);
        CommonTreeNodeStream s = new CommonTreeNodeStream(tree);
        System.out.println(s.nextElement().getClass().toString());
        //Utils.printTree(tree, 1);
        OffsetRange range = new OffsetRange(10, 280);
        OffsetRange range2 = new OffsetRange(400, 600);
        ArrayList<OffsetRange> list = new ArrayList<OffsetRange>();
        list.add(range);
        list.add(range2);
        HashMap<String, List<OffsetRange>> ret = new HashMap<String, List<OffsetRange>>();
        ret.put("codeblocks", list);
        return ret;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public Configuration getConfiguration() {
        return new StructureScanner.Configuration(true, false); // sortable but not filterable
    }
}
