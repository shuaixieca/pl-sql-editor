/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.languages.pl_sql.Utils;
import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer;
import org.netbeans.modules.languages.pl_sql.parser.PLSQLParser.PL_SQLEditorParserResult;
import org.openide.text.NbDocument;

/**
 *
 * @author SUMsoft
 */
public class PLSQLStructureScanner implements StructureScanner {

    private final String FOLD_TYPE = "comments";

    public List<? extends StructureItem> scan(ParserResult pr) {
        List<StructureItem> items = new ArrayList<StructureItem>();
        items.add(new PLSQLStructureItem(PL_SQLLexer.IM_PCK_SPC, "Node"));
        return items;
    }

    public Map<String, List<OffsetRange>> folds(ParserResult pr) {
        Utils.printTree(Utils.getRoot(pr), 1);
        Map<String, List<OffsetRange>> folds = new HashMap<String, List<OffsetRange>>();
        Document document = pr.getSnapshot().getSource().getDocument(false);
        collectTokenFolds(folds, pr, document);
        collectGrammarFolds(folds, Utils.getRoot(pr), document);
        return folds;
    }

    private void collectTokenFolds(Map<String, List<OffsetRange>> folds, ParserResult pr, Document document) {
        if (pr != null) {
            CommonTokenStream tokens = ((PL_SQLEditorParserResult) pr).getTokens();
            for (int i = 0; i < tokens.getTokens().size(); i++) {
                Token token = (Token) (tokens.getTokens().get(i));
                if (token.getType() == PL_SQLLexer.BLOCK_COMMENT) {
                    addFold(FOLD_TYPE, folds, token, document);
                }
            }
        }
    }

    private void collectGrammarFolds(Map<String, List<OffsetRange>> folds, CommonTree tree, Document document) {
        if (tree != null) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                switch (tree.getChild(i).getType()) {
                    case PL_SQLLexer.IM_BEGIN_END:
                        addFold(FOLD_TYPE, folds, (CommonTree) tree.getChild(i), document, 1);
                        break;
                    case PL_SQLLexer.IM_IF:
                        addFold(FOLD_TYPE, folds, (CommonTree) tree.getChild(i), document, 2);
                        break;
                    case PL_SQLLexer.IM_LOOP:
                        addFold(FOLD_TYPE, folds, (CommonTree) tree.getChild(i), document, 2);
                        break;
                    case PL_SQLLexer.IM_CASE:
                        addFold(FOLD_TYPE, folds, (CommonTree) tree.getChild(i), document, 1);
                        break;
                }

                collectGrammarFolds(folds, (CommonTree) tree.getChild(i), document);
            }
        }
    }

    private void createFold(String foldType, Map<String, List<OffsetRange>> folds, int start, int end) {
        OffsetRange range = new OffsetRange(start, end);
        List<OffsetRange> fold = folds.get(foldType);
        if (fold == null) {
            fold = new ArrayList<OffsetRange>();
            folds.put(foldType, fold);
        }
        fold.add(range);
    }

    private void addFold(String foldType, Map<String, List<OffsetRange>> folds, CommonTree tree, Document document, int lastToken) {
        Tree firstChild = tree.getChild(0);
        Tree lastChild = getLastChild(tree, lastToken);
        //Tree lastChild = tree.getChild(tree.getChildCount() - lastToken);
        int start = NbDocument.findLineOffset((StyledDocument) document, firstChild.getLine() - 1) + firstChild.getCharPositionInLine() + firstChild.getText().length();
        int end = NbDocument.findLineOffset((StyledDocument) document, lastChild.getLine() - 1) + lastChild.getCharPositionInLine();
        createFold(foldType, folds, start, end);
    }

    private void addFold(String foldType, Map<String, List<OffsetRange>> folds, Token token, Document document) {
        int start = NbDocument.findLineOffset((StyledDocument) document, token.getLine() - 1) + token.getCharPositionInLine();
        int end = start + token.getText().length();
        createFold(foldType, folds, start, end);
    }

    private Tree getLastChild(CommonTree tree, int lastToken) {
        Tree lastChild = tree.getChild(tree.getChildCount() - lastToken);
        if (lastChild.getChildCount() > 0) {
            do {
                lastChild = lastChild.getChild(lastChild.getChildCount() - 1);
            } while (lastChild.getChildCount() > 0);
        }
        //System.out.println(lastChild.getText() + '\t' + lastChild.getLine());
        return lastChild;
    }

    public Configuration getConfiguration() {
        return new StructureScanner.Configuration(true, false); // sortable but not filterable
    }
}
