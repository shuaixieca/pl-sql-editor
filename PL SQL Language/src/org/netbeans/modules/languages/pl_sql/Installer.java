/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql;

import javax.swing.JOptionPane;
import org.openide.modules.ModuleInstall;
import org.openide.util.NbBundle;

/**
 * Manages a module's lifecycle. Remember that an installer is optional and
 * often not needed at all.
 */
@Deprecated
public class Installer extends ModuleInstall {

    private static final long REQ_MEMORY = 500 * 1024 * 1024; // 500MB


    @Override
    public void validate() throws IllegalStateException {
        long heapMaxSize = Runtime.getRuntime().maxMemory();
        if (heapMaxSize < REQ_MEMORY) {
            String msg = NbBundle.getMessage(Installer.class, "LBL_Memory", heapMaxSize / 1024 / 1024);
            JOptionPane.showMessageDialog(null, msg,
                    NbBundle.getMessage(Installer.class, "error"), JOptionPane.ERROR_MESSAGE);
            //LifecycleManager.getDefault().exit();
            throw new IllegalStateException(msg);
        }
    }
}
