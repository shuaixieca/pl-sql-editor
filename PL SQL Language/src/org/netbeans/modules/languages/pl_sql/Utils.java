/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql;

import java.util.ResourceBundle;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.languages.pl_sql.parser.PLSQLParser.PL_SQLEditorParserResult;
import org.openide.util.NbBundle;

/**
 *
 * @author asoumbatov
 */
public class Utils {

    public static ResourceBundle getBundle() {
        return NbBundle.getBundle(Utils.class);
    }

    public static CommonTree getRoot(ParserResult result) {
        CommonTree ret = null;
        if (result == null) {
            return null;
        }
        if (result instanceof PL_SQLEditorParserResult) {
            ret = ((PL_SQLEditorParserResult) result).getTree();
        }
        return ret;
    }

    public static void printTree(CommonTree t, int indent) {
        if (t != null) {
            StringBuffer sb = new StringBuffer(indent);
            for (int i = 0; i < indent; i++) {
                sb = sb.append('\t');
            }
            for (int i = 0; i < t.getChildCount(); i++) {
                System.out.println(sb.toString() + t.getChild(i).toString());
                printTree((CommonTree) t.getChild(i), indent + 1);
            }
        }
    }
}
