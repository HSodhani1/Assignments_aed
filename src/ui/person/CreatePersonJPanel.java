/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ui.person;
import model.IntegerVerifier;
import model.StringVerifier;
import model.Person;
import model.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hardik sodhani
 */
public class CreatePersonJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form CreatePatientJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    
    public CreatePersonJPanel(JPanel userProcessContainer,PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        addVerifiers();
    }
    
    private void addVerifiers() {
        InputVerifier integerVerifier = new IntegerVerifier();
        personAgeJTextField.setInputVerifier(integerVerifier);
        InputVerifier stringVerifier = new StringVerifier();
        pesonNameJTextField.setInputVerifier(stringVerifier);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personAgeJTextField = new javax.swing.JTextField();
        addPersonJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientNameJLabel = new javax.swing.JLabel();
        AgeJLabel = new javax.swing.JLabel();
        pesonNameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        weightjLabel = new javax.swing.JLabel();
        personWeightJTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        cityjLabel = new javax.swing.JLabel();
        personAddressJTextField = new javax.swing.JTextField();
        personCityJTextField = new javax.swing.JTextField();
        personCommunityJTextField1 = new javax.swing.JLabel();
        personCommunityjComboBox1 = new javax.swing.JComboBox<>();
        personhospitalJTextField1 = new javax.swing.JLabel();
        personhospital = new javax.swing.JComboBox<>();
        persondoctorJTextField1 = new javax.swing.JLabel();
        persondoctor = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        personAgeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personAgeJTextFieldActionPerformed(evt);
            }
        });

        addPersonJButton.setText("Create Profile");
        addPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Person Profile");

        patientNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        patientNameJLabel.setText("Person Name: ");

        AgeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AgeJLabel.setText("Age : ");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        weightjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        weightjLabel.setText("Weight: ");

        personWeightJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personWeightJTextFieldActionPerformed(evt);
            }
        });

        addressjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressjLabel.setText("Address:");

        cityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityjLabel.setText("City:");

        personCityJTextField.setEditable(false);
        personCityJTextField.setText("Boston");

        personCommunityJTextField1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        personCommunityJTextField1.setText("Community:");

        personCommunityjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roxbury", "Fenway", "Downtown", "Kenmore" }));
        personCommunityjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCommunityjComboBox1ActionPerformed(evt);
            }
        });

        personhospitalJTextField1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        personhospitalJTextField1.setText("Hospital:");

        personhospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personhospitalActionPerformed(evt);
            }
        });

        persondoctorJTextField1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        persondoctorJTextField1.setText("Doctor:");

        persondoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cardiologist", "Neurologist", "Gynachologist", "Dentist" }));
        persondoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persondoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AgeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientNameJLabel)
                                .addComponent(weightjLabel)
                                .addComponent(addressjLabel)
                                .addComponent(cityjLabel)
                                .addComponent(persondoctorJTextField1))
                            .addComponent(personCommunityJTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(personhospitalJTextField1))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addPersonJButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(personAgeJTextField)
                    .addComponent(persondoctor, 0, 159, Short.MAX_VALUE)
                    .addComponent(personAddressJTextField)
                    .addComponent(pesonNameJTextField)
                    .addComponent(personWeightJTextField)
                    .addComponent(personCityJTextField)
                    .addComponent(personCommunityjComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personhospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(206, 206, 206))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AgeJLabel, addressjLabel, cityjLabel, patientNameJLabel, personCommunityJTextField1, persondoctorJTextField1, personhospitalJTextField1, weightjLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesonNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personWeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressjLabel)
                    .addComponent(personAddressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personCityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personCommunityJTextField1)
                    .addComponent(personCommunityjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personhospitalJTextField1)
                    .addComponent(personhospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(persondoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persondoctorJTextField1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPersonJButton)
                    .addComponent(backJButton))
                .addGap(236, 236, 236))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {personAddressJTextField, personAgeJTextField, personCityJTextField, personCommunityjComboBox1, personWeightJTextField, persondoctor, personhospital, pesonNameJTextField});

    }// </editor-fold>//GEN-END:initComponents

    private void addPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonJButtonActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput()==Boolean.TRUE)
        {
            Person person=personDirectory.createAndAddPerson();
            person.setPersonName(pesonNameJTextField.getText());
            person.setAge(Integer.parseInt(personAgeJTextField.getText()));
            person.setweight(Integer.parseInt(personWeightJTextField.getText()));
            person.setCommunity((String)personCommunityjComboBox1.getSelectedItem());
            person.setCity(personCityJTextField.getText());
            person.setAddress(personAddressJTextField.getText());
            person.setHospital((String)personhospital.getSelectedItem());
            JOptionPane.showMessageDialog(this, "Person added!!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addPersonJButtonActionPerformed
    private void clearFields()
    {
        pesonNameJTextField.setText("");
        personAgeJTextField.setText("");
        personWeightJTextField.setText("");
        personAddressJTextField.setText("");
        personCityJTextField.setText("");
    }
    private Boolean checkBlankInput()
    {
        if(pesonNameJTextField.getText().length()==0
                ||personAgeJTextField.getText().length()==0)
        {
            return false;
        }
        else{
            return true;
        }
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void personWeightJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personWeightJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personWeightJTextFieldActionPerformed

    private void personCommunityjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCommunityjComboBox1ActionPerformed
        // TODO add your handling code here:
        if(personCommunityjComboBox1.getSelectedItem().equals("Roxbury")){
            personhospital.removeAllItems();

            personhospital.addItem("Boston Medical Center");
            personhospital.addItem("Brigham and Women's Hospital");
            personhospital.addItem("Massachusetts General Hospital");

        }

        else{
            if(personCommunityjComboBox1.getSelectedItem().equals("Fenway")){
                personhospital.removeAllItems();

                personhospital.addItem("Boston children's Hospital");
                personhospital.addItem("Emergency Department");
                personhospital.addItem("General Hospital");
            }
            else{
                personCommunityjComboBox1.removeAllItems();
                //txtHospital.addItem(null);
                personhospital.addItem("HRI Hospital");
                personhospital.addItem("Bournewood Hospital");
                personhospital.addItem("Lemuel Shattuck Hospital");
            }
        }
    }//GEN-LAST:event_personCommunityjComboBox1ActionPerformed

    private void personhospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personhospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personhospitalActionPerformed

    private void persondoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persondoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persondoctorActionPerformed

    private void personAgeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personAgeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personAgeJTextFieldActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JButton addPersonJButton;
    private javax.swing.JLabel addressjLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JTextField personAddressJTextField;
    private javax.swing.JTextField personAgeJTextField;
    private javax.swing.JTextField personCityJTextField;
    private javax.swing.JLabel personCommunityJTextField1;
    private javax.swing.JComboBox<String> personCommunityjComboBox1;
    private javax.swing.JTextField personWeightJTextField;
    private javax.swing.JComboBox<String> persondoctor;
    private javax.swing.JLabel persondoctorJTextField1;
    private javax.swing.JComboBox<String> personhospital;
    private javax.swing.JLabel personhospitalJTextField1;
    private javax.swing.JTextField pesonNameJTextField;
    private javax.swing.JLabel weightjLabel;
    // End of variables declaration//GEN-END:variables
}
