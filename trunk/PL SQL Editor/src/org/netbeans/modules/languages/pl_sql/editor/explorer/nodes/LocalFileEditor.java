/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.beans.PropertyEditorSupport;
import java.io.File;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import org.openide.util.Exceptions;

/**
 *
 * @author SUMsoft
 */
public class LocalFileEditor extends PropertyEditorSupport {

    @Override
    public Component getCustomEditor() {
        JFileChooser fc = new JFileChooser();
        fc.setDialogType(JFileChooser.SAVE_DIALOG);
        fc.setSelectedFile(new File((String) getValue()));
        fc.addActionListener(new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
                    try {
                        setValue(((JFileChooser) e.getSource()).getSelectedFile().getCanonicalPath());
                    } catch (IOException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            }
        });
        return fc;
    }

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }
}
