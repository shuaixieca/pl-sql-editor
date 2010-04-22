/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.structure;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.languages.pl_sql.antlr.PL_SQLLexer;
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
    private List<? extends StructureItem> nestedItems;

    public PLSQLStructureItem(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSortText() {
        return name;
    }

    public String getHtml(HtmlFormatter hf) {
        hf.appendHtml("<font color=808080>");
        switch (type) {
            case PL_SQLLexer.IM_PCK_SPC:
                hf.appendText("package");
                break;
            case PL_SQLLexer.IM_PCK_BODY:
                hf.appendText("package body");
                break;
        }
        hf.appendHtml("</font>");
        hf.appendText(" ");
        hf.appendText(name);
        return hf.getText();
    }

    public ElementHandle getElementHandle() {
        return null;
    }

    public ElementKind getKind() {
        return ElementKind.OTHER;
    }

    public Set<Modifier> getModifiers() {
        return Collections.emptySet();
    }

    public boolean isLeaf() {
        return nestedItems == null ? true : false;
    }

    public List<? extends StructureItem> getNestedItems() {
        return nestedItems;
    }

    public long getPosition() {
        return 100;
    }

    public long getEndPosition() {
        return 500;
    }

    public ImageIcon getCustomIcon() {
        String iconPath = "";
        switch (type) {
            case PL_SQLLexer.IM_PCK_SPC:
                iconPath = PCK_SPEC_ICON;
                break;
            case PL_SQLLexer.IM_PCK_BODY:
                iconPath = PCK_BODY_ICON;
                break;
        }
        return ImageUtilities.loadImageIcon(iconPath, false);
    }
}

