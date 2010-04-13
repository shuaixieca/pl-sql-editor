/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
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
        List<StructureItem> items = new ArrayList<StructureItem>();
        return items;
    }

    public Map<String, List<OffsetRange>> folds(ParserResult pr) {
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
        return new StructureScanner.Configuration(true, true);
    }

    private class PLSQLStructureItem implements StructureItem {

        public String getName() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public String getSortText() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public String getHtml(HtmlFormatter hf) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ElementHandle getElementHandle() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ElementKind getKind() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Set<Modifier> getModifiers() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean isLeaf() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public List<? extends StructureItem> getNestedItems() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public long getPosition() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public long getEndPosition() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ImageIcon getCustomIcon() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }
}
