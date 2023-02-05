/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Application;
import Model.Observation;
import Model.vitalSignHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author balin
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewJPanel
     */
    private Application application;
    DefaultTableModel viewTableModel;
    Observation selectectdedObservation;
    public ViewJPanel() {
        initComponents();
    }

    ViewJPanel(Application application) {
        initComponents();
        this.application = application;
        this.viewTableModel = (DefaultTableModel) observationTable.getModel();
        
        displayObservation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldObservationId1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldBloodPressure1 = new javax.swing.JTextField();
        fieldTemperature1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        updateObservationButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        observationTable = new javax.swing.JTable();
        viewDetailsBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("VIEW VITAL SIGN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        fieldObservationId1.setEnabled(false);
        add(fieldObservationId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 90, 20));

        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 20, 20));

        jLabel3.setText("Blood Pressure");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 20));
        add(fieldBloodPressure1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 90, 20));
        add(fieldTemperature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 90, 20));

        jLabel4.setText("Temperature");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, 20));

        updateObservationButton.setText("UPDATE OBSERVATION");
        updateObservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateObservationButtonActionPerformed(evt);
            }
        });
        add(updateObservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        observationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Temperature", "BP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(observationTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 220, 260));

        viewDetailsBtn.setText("VIEW DETAILS");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });
        add(viewDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = observationTable.getSelectedRow();
        if(selectedRow >= 0 ){
            this.selectectdedObservation = (Observation) observationTable.getValueAt(selectedRow,0 );
            //fill all the text fields
            fieldObservationId1.setText(String.valueOf(this.selectectdedObservation.getObservationId()));
            fieldTemperature1.setText(String.valueOf(this.selectectdedObservation.getTemperature()));
            fieldBloodPressure1.setText(String.valueOf(this.selectectdedObservation.getBloodPressure()));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!");
        }
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void updateObservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateObservationButtonActionPerformed
        // TODO add your handling code here:
        if(!fieldObservationId1.getText().isEmpty()) {
         Observation o = this.application.getHistory().findObservation(Integer.valueOf(fieldObservationId1.getText()));
         this.selectectdedObservation.setBloodPressure(Double.valueOf(fieldBloodPressure1.getText()));
         this.selectectdedObservation.setTemperature(Double.valueOf(fieldTemperature1.getText()));
         this.selectectdedObservation.setBloodPressure(Double.valueOf(fieldBloodPressure1.getText()));
        }
        else {
            JOptionPane.showMessageDialog(null,"You have not made any selection");
        }
       
        displayObservation();
    }//GEN-LAST:event_updateObservationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldBloodPressure1;
    private javax.swing.JTextField fieldObservationId1;
    private javax.swing.JTextField fieldTemperature1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable observationTable;
    private javax.swing.JButton updateObservationButton;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables

    private void displayObservation() {
        vitalSignHistory history = this.application.getHistory();
        if(history.getVitalSignHistory().size() > 0){
            viewTableModel.setRowCount(0);
            for(Observation o: history.getVitalSignHistory())
            {
//                System.out.println(o.getObservationId());
                Object row[]= new Object[3];
                row[0] = o;
                row[1] = o.getTemperature();
                row[2] = o.getBloodPressure();
                //this.viewTableModel.
                viewTableModel.addRow(row);
            }
        }
        else{
            System.out.println("Empty List");
        }
    }
}