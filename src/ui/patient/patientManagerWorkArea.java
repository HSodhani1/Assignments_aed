/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.patient;

/**
 *
 * @author hardiksodhani
 */
public class patientManagerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form patientManagerWorkArea
     */
    public patientManagerWorkArea() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPatientDirectory = new javax.swing.JButton();
        btnEncounterHistory = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        btnPatientDirectory.setText("Patient Directory");

        btnEncounterHistory.setText("Encounter History");
        btnEncounterHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterHistoryActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnLogout)
                    .addComponent(btnPatientDirectory)
                    .addComponent(btnEncounterHistory))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnPatientDirectory)
                .addGap(18, 18, 18)
                .addComponent(btnEncounterHistory)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(169, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncounterHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncounterHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncounterHistory;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPatientDirectory;
    // End of variables declaration//GEN-END:variables
}
