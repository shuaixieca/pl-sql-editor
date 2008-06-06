/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import org.netbeans.modules.languages.pl_sql.editor.oracletree.OUser;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author SUMsoft
 */
public class OUserNode extends AbstractNode {

    public OUserNode(OUser ou) {
        super(Children.LEAF, Lookups.singleton(ou));
    }

    private OUser getOUser() {
        return (OUser) getLookup().lookup(OUser.class);
    }

    @Override
    public String getDisplayName() {

        return getOUser().toString();
    }
}