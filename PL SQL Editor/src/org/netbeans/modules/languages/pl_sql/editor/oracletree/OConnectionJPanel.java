/*
 * OConnectionJPanel.java
 *
 * Created on 4. Juni 2008, 17:32
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.pool.OracleDataSource;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Cancellable;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.RequestProcessor;
import org.openide.util.Task;
import org.openide.util.TaskListener;

/**
 *
 * @author  SUMsoft
 */
public class OConnectionJPanel extends javax.swing.JPanel {

    /** Creates new form OConnectionJPanel */
    public OConnectionJPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ServerNamejLabel = new javax.swing.JLabel();
        ServerNamejTextField = new javax.swing.JTextField();
        PortjLabel = new javax.swing.JLabel();
        PortjTextField = new javax.swing.JTextField();
        DatabaseNamejLabel = new javax.swing.JLabel();
        DatabseNamejTextField = new javax.swing.JTextField();
        UserjPanel = new javax.swing.JPanel();
        UserNamejLabel = new javax.swing.JLabel();
        UserNamejTextField = new javax.swing.JTextField();
        SavePasswordjCheckBox = new javax.swing.JCheckBox();
        PasswordjLabel = new javax.swing.JLabel();
        PasswordjPasswordField = new javax.swing.JPasswordField();
        ConnectAsjLabel = new javax.swing.JLabel();
        ConnectAsjComboBox = new javax.swing.JComboBox();
        connectProgressPanel = new javax.swing.JPanel();
        progressMessageLabel = new javax.swing.JLabel();
        progressContainerPanel = new javax.swing.JPanel();

        ServerNamejLabel.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.ServerNamejLabel.text")); // NOI18N

        ServerNamejTextField.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.ServerNamejTextField.text")); // NOI18N

        PortjLabel.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.PortjLabel.text")); // NOI18N

        PortjTextField.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.PortjTextField.text")); // NOI18N

        DatabaseNamejLabel.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.DatabaseNamejLabel.text")); // NOI18N

        DatabseNamejTextField.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.DatabseNamejTextField.text")); // NOI18N

        UserjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.UserjPanel.border.title"))); // NOI18N

        UserNamejLabel.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.UserNamejLabel.text")); // NOI18N

        UserNamejTextField.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.UserNamejTextField.text")); // NOI18N

        SavePasswordjCheckBox.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.SavePasswordjCheckBox.text")); // NOI18N

        PasswordjLabel.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.PasswordjLabel.text")); // NOI18N

        PasswordjPasswordField.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.PasswordjPasswordField.text")); // NOI18N

        ConnectAsjLabel.setText(org.openide.util.NbBundle.getMessage(OConnectionJPanel.class, "OConnectionJPanel.ConnectAsjLabel.text")); // NOI18N

        ConnectAsjComboBox.setModel(new javax.swing.DefaultComboBoxModel( RoleTypes.values()));

        org.jdesktop.layout.GroupLayout UserjPanelLayout = new org.jdesktop.layout.GroupLayout(UserjPanel);
        UserjPanel.setLayout(UserjPanelLayout);
        UserjPanelLayout.setHorizontalGroup(
            UserjPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, UserjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(UserjPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(UserjPanelLayout.createSequentialGroup()
                        .add(UserjPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(UserNamejLabel)
                            .add(ConnectAsjLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(UserjPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(SavePasswordjCheckBox)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, UserjPanelLayout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(ConnectAsjComboBox, 0, 164, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, UserNamejTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                    .add(UserjPanelLayout.createSequentialGroup()
                        .add(PasswordjLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(PasswordjPasswordField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                .addContainerGap())
        );
        UserjPanelLayout.setVerticalGroup(
            UserjPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(UserjPanelLayout.createSequentialGroup()
                .add(UserjPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(UserNamejLabel)
                    .add(UserNamejTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(SavePasswordjCheckBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(UserjPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(PasswordjLabel)
                    .add(PasswordjPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(UserjPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ConnectAsjLabel)
                    .add(ConnectAsjComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        connectProgressPanel.setLayout(new java.awt.BorderLayout(0, 5));
        connectProgressPanel.add(progressMessageLabel, java.awt.BorderLayout.NORTH);

        progressContainerPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        progressContainerPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        progressContainerPanel.setLayout(new java.awt.BorderLayout());
        connectProgressPanel.add(progressContainerPanel, java.awt.BorderLayout.CENTER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, connectProgressPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, UserjPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(DatabaseNamejLabel)
                            .add(PortjLabel)
                            .add(ServerNamejLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(ServerNamejTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, PortjTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .add(DatabseNamejTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ServerNamejLabel)
                    .add(ServerNamejTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(PortjLabel)
                    .add(PortjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(DatabaseNamejLabel)
                    .add(DatabseNamejTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(UserjPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(connectProgressPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ConnectAsjComboBox;
    private javax.swing.JLabel ConnectAsjLabel;
    private javax.swing.JLabel DatabaseNamejLabel;
    private javax.swing.JTextField DatabseNamejTextField;
    private javax.swing.JLabel PasswordjLabel;
    private javax.swing.JPasswordField PasswordjPasswordField;
    private javax.swing.JLabel PortjLabel;
    private javax.swing.JTextField PortjTextField;
    private javax.swing.JCheckBox SavePasswordjCheckBox;
    private javax.swing.JLabel ServerNamejLabel;
    private javax.swing.JTextField ServerNamejTextField;
    private javax.swing.JLabel UserNamejLabel;
    private javax.swing.JTextField UserNamejTextField;
    private javax.swing.JPanel UserjPanel;
    private javax.swing.JPanel connectProgressPanel;
    private javax.swing.JPanel progressContainerPanel;
    private javax.swing.JLabel progressMessageLabel;
    // End of variables declaration//GEN-END:variables
    private Dialog dlg;
    private TestConnection tc = null;
    private boolean isSaved = false;
    private final String[] str = {"Test", "Save", "Cancel", "Help"};

    public void setDatabseName(String str) {
        this.DatabseNamejTextField.setText(str);
    }

    public void setPort(int i) {
        this.PortjTextField.setText(String.valueOf(i));
    }

    public void setServerName(String str) {
        this.ServerNamejTextField.setText(str);
    }

    public String getServerName() {
        return ServerNamejTextField.getText();
    }

    public int getPort() {
        return Integer.parseInt(PortjTextField.getText());
    }

    public String getDatabaseName() {
        return DatabseNamejTextField.getText();
    }

    public String getUserName() {
        return UserNamejTextField.getText();
    }

    public Boolean getSaveUserPassword() {
        return SavePasswordjCheckBox.isSelected();
    }

    public String getPassword() {
        return String.copyValueOf(PasswordjPasswordField.getPassword());
    }

    public RoleTypes getConnectRole() {
        return (RoleTypes) ConnectAsjComboBox.getSelectedItem();
    }

    public Boolean Validate() {
        final String msg_part = "must be specified";
        final String msg_titel = "Input Error";
        if (getServerName().length() == 0) {
            JOptionPane.showMessageDialog(this, "The Server Name " + msg_part, msg_titel, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            int i = getPort();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The Port " + msg_part, msg_titel, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (getDatabaseName().length() == 0) {
            JOptionPane.showMessageDialog(this, "The Database Name " + msg_part, msg_titel, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (getUserName().length() == 0) {
            JOptionPane.showMessageDialog(this, "The User Name " + msg_part, msg_titel, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (getSaveUserPassword() && getPassword().length() == 0) {
            JOptionPane.showMessageDialog(this, "The Password " + msg_part, msg_titel, JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    ActionListener listener = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().compareTo("Cancel") == 0) {
                dlg.setVisible(false);
            }
            if (e.getActionCommand().compareTo("Save") == 0) {
                if (Validate()) {
                    OConnectionClass ocs = new OConnectionClass(null, getServerName(), getPort(), getDatabaseName(),
                            getUserName(), getPassword(), getSaveUserPassword(), getConnectRole());
                    ocs.SaveConnection();
                    ocs.SaveAllUsers();
                    isSaved = true;
                    dlg.setVisible(false);
                }
            }
            if (e.getActionCommand().compareTo("Test") == 0) {
                //JOptionPane.showMessageDialog(null, "Object is " + dlg.getFocusOwner().getClass().getName());
                if (tc == null) {
                    if (Validate()) {
                        if (getPassword().length() == 0) {
                            JOptionPane.showMessageDialog(dlg, "The Password is required", "Input Error", JOptionPane.ERROR_MESSAGE);
                        }
                        OConnectionClass ocs = new OConnectionClass(null, getServerName(), getPort(), getDatabaseName(),
                                getUserName(), getPassword(), true, getConnectRole());

                        tc = new TestConnection(ocs);
                        tc.post();
                        testbtn = (javax.swing.JButton) dlg.getFocusOwner();
                        ChangeTestButton();
                    }
                }
            }
            if (e.getActionCommand().compareTo("Stop") == 0) {
                tc.stop();
                testbtn = (javax.swing.JButton) dlg.getFocusOwner();
                ChangeTestButton();
            }
        // TODO Help event            
        }
    };
    private ProgressHandle progressHandle;
    private JComponent progressComponent;
    private JButton testbtn;

    private void ChangeTestButton() {
        if (testbtn != null) {
            if (testbtn.getText().compareTo("Test") == 0) {
                testbtn.setText("Stop");
                return;
            }
            if (testbtn.getText().compareTo("Stop") == 0) {
                testbtn.setText("Test");
            }
        }
    }

    private void startProgress(final String msg) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                progressHandle = ProgressHandleFactory.createHandle(null);/*, new Cancellable () {
                
                public boolean cancel() {
                throw new UnsupportedOperationException("Not supported yet.");
                }
                
                });*/
                progressComponent = ProgressHandleFactory.createProgressComponent(progressHandle);
                progressContainerPanel.add(progressComponent, BorderLayout.CENTER);
                //JLabel progressMessage = ProgressHandleFactory.createDetailLabelComponent(progressHandle);
                progressHandle.start();
                //dlg.validate();
                progressMessageLabel.setForeground(Color.BLACK);
                progressMessageLabel.setText(msg);
            }
        });
    }

    private void stopProgress(final String msg, final boolean connected) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                progressHandle.finish();
                progressContainerPanel.remove(progressComponent);
                // without this, the removed progress component remains painted on its parent... why?
                progressContainerPanel.repaint();
                if (connected) {
                    progressMessageLabel.setForeground(Color.BLACK);
                } else {
                    progressMessageLabel.setForeground(Color.RED);
                }
                progressMessageLabel.setText(msg);
            //dlg.pack();
            //dlg.validate();
            }
        });
    }

    private void ShowDialogInternal(String caption) {
        //OConnectionJPanel oc = new OConnectionJPanel();
        DialogDescriptor d = new DialogDescriptor(this, caption, true, str, null, DialogDescriptor.BOTTOM_ALIGN, HelpCtx.DEFAULT_HELP, listener);
        //d.setModal(true);
        //d.setMessageType(NotifyDescriptor.PLAIN_MESSAGE);
        //d.setOptionType(NotifyDescriptor.DEFAULT_OPTION);
        dlg = DialogDisplayer.getDefault().createDialog(d);
        dlg.pack();
        //dlg.setSize(new Dimension(800, 600));
        dlg.setVisible(true);
    }

    public void ShowEmptyDialog() {
        ShowDialogInternal("Add new Oracle connection");
    }

    private void DisableDBControls() {
        this.DatabseNamejTextField.setEnabled(false);
        this.PortjTextField.setEnabled(false);
        this.ServerNamejTextField.setEnabled(false);
        UserNamejTextField.transferFocus();
    }

    public void ShowDialog(OConnectionClass ocs) {
        if (ocs != null) {
            setServerName(ocs.getServerName());
            setPort(ocs.getPort());
            setDatabseName(ocs.getDatabaseName());
            DisableDBControls();
            ShowDialogInternal("Add new Oracle user");
        }
    }

    public boolean getIsSaved() {
        return isSaved;
    }

    class TestConnection {

        private OConnectionClass ocs;
        private RequestProcessor rp;
        private RequestProcessor.Task task;
        private String msg;
        private boolean connected = false;
        private OracleConnection oc = null;
        private boolean interrupted = false;

        public TestConnection(final OConnectionClass ocs) {
            this.ocs = ocs;
            rp = new RequestProcessor(TestConnection.class.getName(), 1, true);

            task = rp.create(new Runnable() {

                public void run() {
                    try {
                        startProgress("Connecting to " + ocs.toString());
                        oc = (OracleConnection) ocs.getUsers().first().getOracleDataSource().getConnection();
                        msg = "Connected to " + ocs.toString();
                        connected = true;
                    } catch (SQLException ex) {
                        msg = ex.getMessage();
                    } finally {
                        if (oc != null) {
                            try {
                                oc.close();
                            } catch (SQLException ex) {
                                msg = ex.getMessage();
                            }
                        }
                    }
                }
            });
            task.addTaskListener(
                    new TaskListener() {

                        public void taskFinished(Task arg0) {
                            if (!interrupted) {
                                stopProgress(msg, connected);
                                ChangeTestButton();
                                tc = null;
                            }
                        }
                    });

        }

        public void post() {
            rp.post(task);
        }

        public void stop() {
            task.cancel();
            interrupted = true;
            stopProgress("Canceled", false);
            tc = null;
        }
    }
}
