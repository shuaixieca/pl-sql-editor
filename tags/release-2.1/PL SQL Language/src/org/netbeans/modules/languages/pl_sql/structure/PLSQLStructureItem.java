/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer;
import org.openide.text.NbDocument;
import org.openide.util.ImageUtilities;

/**
 *
 * @author asoumbatov
 */
public class PLSQLStructureItem implements StructureItem {

    private final static String FUNC_ICON = "org/netbeans/modules/languages/pl_sql/images/FunctionsObj.png";
    private final static String PROC_ICON = "org/netbeans/modules/languages/pl_sql/images/ProceduresObj.png";
    private final static String PCK_SPEC_ICON = "org/netbeans/modules/languages/pl_sql/images/PackagesObj.png";
    private final static String PCK_BODY_ICON = "org/netbeans/modules/languages/pl_sql/images/PackagesBodyObj.png";
    private final static String TRIGGER_ICON = "org/netbeans/modules/languages/pl_sql/images/TriggersObj.png";
    private final static String TYPE_SPC_ICON = "org/netbeans/modules/languages/pl_sql/images/TypesObj.png";
    private final static String TYPE_BODY_ICON = "org/netbeans/modules/languages/pl_sql/images/TypesBodyObj.png";
    private String name;
    private int type;
    private List<PLSQLStructureItem> nestedItems;
    private int start;
    private int end;

    public PLSQLStructureItem(int type, String name, int start, int end, CommonTree tree, Document document, List<CommonTree> visitedTree) {
        this.type = type;
        this.name = name;
        this.start = start;
        this.end = end;
        //System.out.println(getName());
        nestedItems = new ArrayList<PLSQLStructureItem>();
        collectStructureItems(nestedItems, tree, document, true, visitedTree);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSortText() {
        return name.toUpperCase();
    }

    @Override
    public String getHtml(HtmlFormatter hf) {
        hf.appendHtml("<font color=808080>");
        switch (type) {
            case PL_SQLLexer.IM_PCK_SPC:
                hf.appendText("package");
                break;
            case PL_SQLLexer.IM_PCK_BODY:
                hf.appendText("package body");
                break;
            case PL_SQLLexer.IM_FUNC:
                hf.appendText("function");
                break;
            case PL_SQLLexer.IM_PROC:
                hf.appendText("procedure");
                break;
            case PL_SQLLexer.TRIGGER_KEYWORD:
                hf.appendText("trigger");
                break;
            case PL_SQLLexer.IM_TYPE_SPC:
                hf.appendText("type");
                break;
            case PL_SQLLexer.IM_TYPE_BODY:
                hf.appendText("type body");
                break;
        }
        hf.appendHtml("</font>");
        hf.appendText(" ");
        hf.appendText(name);
        return hf.getText();
    }

    @Override
    public ElementHandle getElementHandle() {
        return null;
    }

    @Override
    public ElementKind getKind() {
        return ElementKind.OTHER;
    }

    @Override
    public Set<Modifier> getModifiers() {
        return Collections.emptySet();
    }

    @Override
    public boolean isLeaf() {
        return nestedItems.isEmpty() ? true : false;
    }

    @Override
    public List<? extends StructureItem> getNestedItems() {
        return nestedItems;
    }

    @Override
    public long getPosition() {
        return start;
    }

    @Override
    public long getEndPosition() {
        return end;
    }

    @Override
    public ImageIcon getCustomIcon() {
        String iconPath = "";
        switch (type) {
            case PL_SQLLexer.IM_PCK_SPC:
                iconPath = PCK_SPEC_ICON;
                break;
            case PL_SQLLexer.IM_PCK_BODY:
                iconPath = PCK_BODY_ICON;
                break;
            case PL_SQLLexer.IM_FUNC:
                iconPath = FUNC_ICON;
                break;
            case PL_SQLLexer.IM_PROC:
                iconPath = PROC_ICON;
                break;
            case PL_SQLLexer.TRIGGER_KEYWORD:
                iconPath = TRIGGER_ICON;
                break;
            case PL_SQLLexer.IM_TYPE_SPC:
                iconPath = TYPE_SPC_ICON;
                break;
            case PL_SQLLexer.IM_TYPE_BODY:
                iconPath = TYPE_BODY_ICON;
                break;
        }
        return ImageUtilities.loadImageIcon(iconPath, false);
    }

    public static void collectStructureItems(List<PLSQLStructureItem> items, CommonTree tree, Document document, boolean rekursiv, List<CommonTree> visitedTree) {
        if (tree != null) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                switch (tree.getChild(i).getType()) {
                    case PL_SQLLexer.IM_FUNC:
                        addItem(PL_SQLLexer.IM_FUNC, items, (CommonTree) tree.getChild(i), document, visitedTree);
                        break;
                    case PL_SQLLexer.IM_PROC:
                        addItem(PL_SQLLexer.IM_PROC, items, (CommonTree) tree.getChild(i), document, visitedTree);
                        break;
                    case PL_SQLLexer.IM_PCK_SPC:
                        addItem(PL_SQLLexer.IM_PCK_SPC, items, (CommonTree) tree.getChild(i), document, visitedTree);
                        break;
                    case PL_SQLLexer.IM_PCK_BODY:
                        addItem(PL_SQLLexer.IM_PCK_BODY, items, (CommonTree) tree.getChild(i), document, visitedTree);
                        break;
                    case PL_SQLLexer.TRIGGER_KEYWORD:
                        addItem(PL_SQLLexer.TRIGGER_KEYWORD, items, (CommonTree) tree.getChild(i), document, visitedTree);
                        break;
                    case PL_SQLLexer.IM_TYPE_SPC:
                        addItem(PL_SQLLexer.IM_TYPE_SPC, items, (CommonTree) tree.getChild(i), document, visitedTree);
                        break;
                    case PL_SQLLexer.IM_TYPE_BODY:
                        addItem(PL_SQLLexer.IM_TYPE_BODY, items, (CommonTree) tree.getChild(i), document, visitedTree);
                        break;
                }
                if (rekursiv) {
                    collectStructureItems(items, (CommonTree) tree.getChild(i), document, rekursiv, visitedTree);
                }
            }
        }
    }

    private static void addItem(int itemType, List<PLSQLStructureItem> items, CommonTree tree, Document document, List<CommonTree> visitedTree) {
        if (!visitedTree.contains(tree)) {
            Tree firstChild = tree.getChild(0);
            Tree nameChild = tree.getChild(1);
            if (itemType == PL_SQLLexer.IM_PCK_SPC || itemType == PL_SQLLexer.TRIGGER_KEYWORD
                    || itemType == PL_SQLLexer.IM_TYPE_SPC) {
                nameChild = tree.getChild(0);
            }
            Tree lastChild = PLSQLStructureScanner.getLastChild(tree, 1);
            if (firstChild.getLine() != 0 && nameChild.getLine() != 0 && lastChild.getLine() != 0) {
                int start = NbDocument.findLineOffset((StyledDocument) document, firstChild.getLine() - 1) + firstChild.getCharPositionInLine();
                int end = NbDocument.findLineOffset((StyledDocument) document, lastChild.getLine() - 1) + lastChild.getCharPositionInLine();
                visitedTree.add(tree);
                items.add(new PLSQLStructureItem(itemType, nameChild.getText(), start, end, tree, document, visitedTree));
            }
        }
    }
}
