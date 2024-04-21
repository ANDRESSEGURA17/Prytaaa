/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.CTarifas;
import java.io.IOException;
import modelo.Tarifas;

/**
 *
 * @author 57300
 */
public class FrmTarifas extends javax.swing.JFrame {

    /**
     * Creates new form FrmTarifas
     */
    public FrmTarifas() {
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

        eti1 = new javax.swing.JLabel();
        eti2 = new javax.swing.JLabel();
        eti3 = new javax.swing.JLabel();
        eti4 = new javax.swing.JLabel();
        eti5 = new javax.swing.JLabel();
        eti6 = new javax.swing.JLabel();
        txtTaEst1 = new javax.swing.JTextField();
        txtTaEst2 = new javax.swing.JTextField();
        txtTaEst3 = new javax.swing.JTextField();
        txtTaEst4 = new javax.swing.JTextField();
        txtTaEst5 = new javax.swing.JTextField();
        txtTaEst6 = new javax.swing.JTextField();
        CmbClientes = new javax.swing.JComboBox<>();
        eti8 = new javax.swing.JLabel();
        eti9 = new javax.swing.JLabel();
        eti10 = new javax.swing.JLabel();
        eti11 = new javax.swing.JLabel();
        eti12 = new javax.swing.JLabel();
        eti13 = new javax.swing.JLabel();
        txtConEst1 = new javax.swing.JTextField();
        txtConEst2 = new javax.swing.JTextField();
        txtConEst3 = new javax.swing.JTextField();
        txtConEst4 = new javax.swing.JTextField();
        txtConEst5 = new javax.swing.JTextField();
        txtConEst6 = new javax.swing.JTextField();
        eti14 = new javax.swing.JLabel();
        CmbCiudad = new javax.swing.JComboBox<>();
        CmbBarrio = new javax.swing.JComboBox<>();
        eti15 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        eti16 = new javax.swing.JLabel();
        eti17 = new javax.swing.JLabel();
        eti18 = new javax.swing.JLabel();
        eti19 = new javax.swing.JLabel();
        eti20 = new javax.swing.JLabel();
        eti21 = new javax.swing.JLabel();
        txtKiEst1 = new javax.swing.JTextField();
        txtKiEst2 = new javax.swing.JTextField();
        txtKiEst3 = new javax.swing.JTextField();
        txtKiEst4 = new javax.swing.JTextField();
        txtKiEst5 = new javax.swing.JTextField();
        txtKiEst6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eti1.setText("TarifaporEst1");

        eti2.setText("TarifaporEst2");

        eti3.setText("TarifaporEst3");

        eti4.setText("TarifaporEst4");

        eti5.setText("TarifaporEst5");

        eti6.setText("TarifaporEst6");

        txtTaEst2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaEst2ActionPerformed(evt);
            }
        });

        txtTaEst5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaEst5ActionPerformed(evt);
            }
        });

        CmbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes" }));
        CmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbClientesActionPerformed(evt);
            }
        });

        eti8.setText("ConsumoEst1");

        eti9.setText("ConsumoEst2");

        eti10.setText("ConsumoEst3");

        eti11.setText("ConsumoEst4");

        eti12.setText("ConsumoEst5");

        eti13.setText("ConsumoEst6");

        txtConEst6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConEst6ActionPerformed(evt);
            }
        });

        eti14.setText("SelecionelaCiudadparalaTarifa");

        CmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barranquilla", "Tolima", "Bogota", "Medellin" }));

        CmbBarrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simon Bolivar", "Vista Hermosa", "Costa Hermosa", "Las nieves" }));

        eti15.setText("SelecioneelBarrioparalaTarifa");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        eti16.setText("KilovatioEst1");

        eti17.setText("KilovatioEst2");

        eti18.setText("KilovatioEst3");

        eti19.setText("KilovatioEst4");

        eti20.setText("KilovatioEst5");

        eti21.setText("KilovatioEst5");

        txtKiEst5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKiEst5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTaEst1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTaEst3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti4)
                                .addGap(18, 18, 18)
                                .addComponent(txtTaEst4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eti2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTaEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti5)
                                .addGap(18, 18, 18)
                                .addComponent(txtTaEst5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eti6)
                                    .addComponent(eti8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eti9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eti10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eti11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTaEst6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtConEst4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtConEst1)
                                    .addComponent(txtConEst2)
                                    .addComponent(txtConEst3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti13)
                                .addGap(18, 18, 18)
                                .addComponent(txtConEst6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti12)
                                .addGap(18, 18, 18)
                                .addComponent(txtConEst5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti17)
                                .addGap(18, 18, 18)
                                .addComponent(txtKiEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eti16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtKiEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(eti14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eti15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CmbBarrio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CmbCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti19)
                                .addGap(18, 18, 18)
                                .addComponent(txtKiEst4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti18)
                                .addGap(18, 18, 18)
                                .addComponent(txtKiEst3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtKiEst5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtKiEst6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti14)
                    .addComponent(CmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti1)
                            .addComponent(txtTaEst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti15))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti2)
                            .addComponent(txtTaEst2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti16)
                            .addComponent(txtKiEst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti3)
                            .addComponent(txtTaEst3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti17)
                            .addComponent(txtKiEst2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti4)
                            .addComponent(txtTaEst4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti18)
                            .addComponent(txtKiEst3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti5)
                            .addComponent(txtTaEst5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti19)
                            .addComponent(txtKiEst4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTaEst6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eti20)
                                .addComponent(txtKiEst5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti8)
                            .addComponent(txtConEst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti21)
                            .addComponent(txtKiEst6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(CmbBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti9)
                            .addComponent(txtConEst2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti10)
                            .addComponent(txtConEst3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti11)
                            .addComponent(txtConEst4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti12)
                            .addComponent(txtConEst5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti13)
                            .addComponent(txtConEst6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar))))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaEst2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaEst2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaEst2ActionPerformed

    private void CmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbClientesActionPerformed

    private void txtConEst6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConEst6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConEst6ActionPerformed

    private void txtKiEst5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKiEst5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKiEst5ActionPerformed

    private void txtTaEst5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaEst5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaEst5ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
 String TaEst1=txtTaEst1.getText();
 String TaEst2=txtTaEst2.getText();
 String TaEst3=txtTaEst3.getText();
 String TaEst4=txtTaEst4.getText();
 String TaEst5=txtTaEst5.getText();
 String TaEst6=txtTaEst6.getText();
 String ConEst1=txtConEst1.getText();
 String ConEst2=txtConEst2.getText();
 String ConEst3=txtConEst3.getText();
 String ConEst4=txtConEst4.getText();
 String ConEst5=txtConEst5.getText();
 String ConEst6=txtConEst6.getText();
 String SelecCiuTa=CmbCiudad.getSelectedItem().toString();
 String SelecBaTa=CmbBarrio.getSelectedItem().toString();
 String KiEst1=txtKiEst1.getText();
 String KiEst2=txtKiEst2.getText();
 String KiEst3=txtKiEst3.getText();
 String KiEst4=txtKiEst4.getText();
 String KiEst5=txtKiEst5.getText();
 String KiEst6=txtKiEst6.getText();
 
 Tarifas M = new Tarifas(TaEst1, TaEst2, TaEst3,TaEst4,TaEst5, TaEst6, ConEst1 , ConEst2, ConEst3, ConEst4, ConEst5, ConEst6, SelecCiuTa, SelecBaTa,KiEst1,KiEst2, KiEst3,KiEst4,KiEst5,KiEst6);
 
 CTarifas m = new CTarifas();
//Aca se crea m
 try {
 m.Registar(M);
 } catch (IOException ex) {
 } 
        
    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTarifas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTarifas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTarifas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTarifas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTarifas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbBarrio;
    private javax.swing.JComboBox<String> CmbCiudad;
    private javax.swing.JComboBox<String> CmbClientes;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel eti1;
    private javax.swing.JLabel eti10;
    private javax.swing.JLabel eti11;
    private javax.swing.JLabel eti12;
    private javax.swing.JLabel eti13;
    private javax.swing.JLabel eti14;
    private javax.swing.JLabel eti15;
    private javax.swing.JLabel eti16;
    private javax.swing.JLabel eti17;
    private javax.swing.JLabel eti18;
    private javax.swing.JLabel eti19;
    private javax.swing.JLabel eti2;
    private javax.swing.JLabel eti20;
    private javax.swing.JLabel eti21;
    private javax.swing.JLabel eti3;
    private javax.swing.JLabel eti4;
    private javax.swing.JLabel eti5;
    private javax.swing.JLabel eti6;
    private javax.swing.JLabel eti8;
    private javax.swing.JLabel eti9;
    private javax.swing.JTextField txtConEst1;
    private javax.swing.JTextField txtConEst2;
    private javax.swing.JTextField txtConEst3;
    private javax.swing.JTextField txtConEst4;
    private javax.swing.JTextField txtConEst5;
    private javax.swing.JTextField txtConEst6;
    private javax.swing.JTextField txtKiEst1;
    private javax.swing.JTextField txtKiEst2;
    private javax.swing.JTextField txtKiEst3;
    private javax.swing.JTextField txtKiEst4;
    private javax.swing.JTextField txtKiEst5;
    private javax.swing.JTextField txtKiEst6;
    private javax.swing.JTextField txtTaEst1;
    private javax.swing.JTextField txtTaEst2;
    private javax.swing.JTextField txtTaEst3;
    private javax.swing.JTextField txtTaEst4;
    private javax.swing.JTextField txtTaEst5;
    private javax.swing.JTextField txtTaEst6;
    // End of variables declaration//GEN-END:variables
}