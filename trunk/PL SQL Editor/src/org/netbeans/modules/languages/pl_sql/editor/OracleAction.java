/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.modules.languages.pl_sql.editor;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.windows.TopComponent;

/**
 * Action which shows Oracle component.
 */
public class OracleAction extends AbstractAction {

    public OracleAction() {
        super(NbBundle.getMessage(OracleAction.class, "CTL_OracleAction"));
        putValue(SMALL_ICON, new ImageIcon(Utilities.loadImage(OracleTopComponent.ICON_PATH, true)));
    }

    public void actionPerformed(ActionEvent evt) {
        TopComponent win = OracleTopComponent.findInstance();
        win.open();
        win.requestActive();
    }

}
