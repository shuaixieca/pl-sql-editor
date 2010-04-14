/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.structure;

import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.StructureItem;

/**
 *
 * @author asoumbatov
 */
public class PLSQLStructureItem implements StructureItem {

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

