
package vista;

import controlador.CBarrios;
import java.io.IOException;
import modelo.Barrios;
public class FrmBarrios extends javax.swing.JFrame {

    
    public FrmBarrios() {
        initComponents();
    }
   @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eti1 = new javax.swing.JLabel();
        cmbBarrios = new javax.swing.JComboBox<>();
        txtNumeroDeIdentificacion = new javax.swing.JTextField();
        eti3 = new javax.swing.JLabel();
        eti4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        eti5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        eti6 = new javax.swing.JLabel();
        txtAñodeNacimiento = new javax.swing.JTextField();
        eti7 = new javax.swing.JLabel();
        txtAñosenelBarrio = new javax.swing.JTextField();
        eti8 = new javax.swing.JLabel();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        eti10 = new javax.swing.JLabel();
        optMasculino = new javax.swing.JRadioButton();
        optFemenino = new javax.swing.JRadioButton();
        eti9 = new javax.swing.JLabel();
        opt5 = new javax.swing.JRadioButton();
        opt6 = new javax.swing.JRadioButton();
        opt7 = new javax.swing.JRadioButton();
        opt8 = new javax.swing.JRadioButton();
        eti11 = new javax.swing.JLabel();
        opt9 = new javax.swing.JRadioButton();
        opt10 = new javax.swing.JRadioButton();
        eti12 = new javax.swing.JLabel();
        opt11 = new javax.swing.JRadioButton();
        opt12 = new javax.swing.JRadioButton();
        opt13 = new javax.swing.JRadioButton();
        opt14 = new javax.swing.JRadioButton();
        opt15 = new javax.swing.JRadioButton();
        opt16 = new javax.swing.JRadioButton();
        eti2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eti1.setText("ElijaBarrio");

        cmbBarrios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santa Ines", "Simon Bolivar", "Vista Hermosa", "Costa Hermosa", "Las nieves", "Hipodromo" }));
        cmbBarrios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBarriosActionPerformed(evt);
            }
        });

        txtNumeroDeIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDeIdentificacionActionPerformed(evt);
            }
        });

        eti3.setText("Nombres ");

        eti4.setText("Apellidos");

        eti5.setText("Edad");

        eti6.setText("AñodeNacimiento");

        eti7.setText("AñosenelBarrio");

        eti8.setText("ConQuienvive");

        opt1.setText("Solo");

        opt2.setText("Pareja");

        opt3.setText("Familia");

        opt4.setText("Amigos");

        eti10.setText("Sexo");

        optMasculino.setText("Masculino");
        optMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optMasculinoActionPerformed(evt);
            }
        });

        optFemenino.setText("Femenino");
        optFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optFemeninoActionPerformed(evt);
            }
        });

        eti9.setText("UstedEs");

        opt5.setText("Casado");

        opt6.setText("Divorciado");

        opt7.setText("Viudo");

        opt8.setText("Union libre");

        eti11.setText("SuBarrioEsInseguro?");

        opt9.setText("Si");

        opt10.setText("No");

        eti12.setText("Estrato");

        opt11.setText("1");
        opt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt11ActionPerformed(evt);
            }
        });

        opt12.setText("2");

        opt13.setText("3");

        opt14.setText("4");
        opt14.setToolTipText("");

        opt15.setText("5");

        opt16.setText("6");

        eti2.setText("NumeroDeIdentificacion");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBarrios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroDeIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eti5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eti4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eti3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombres)
                                    .addComponent(txtApellidos)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                            .addComponent(eti7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eti8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opt1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opt2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opt3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opt4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opt8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opt7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opt6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opt5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eti9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(optFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti11)
                            .addComponent(opt9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opt14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opt15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opt16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opt12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opt13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opt11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(244, 244, 244))
            .addGroup(layout.createSequentialGroup()
                .addComponent(eti6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAñosenelBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAñodeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opt10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti1)
                    .addComponent(cmbBarrios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroDeIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti3)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti4)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti5)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti6)
                            .addComponent(txtAñodeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(optMasculino)
                        .addGap(4, 4, 4)
                        .addComponent(optFemenino)
                        .addGap(27, 27, 27)
                        .addComponent(eti11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opt9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opt10)))
                .addGap(18, 18, 18)
                .addComponent(eti12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eti7)
                        .addComponent(txtAñosenelBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opt11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti8)
                    .addComponent(eti9)
                    .addComponent(opt12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opt1)
                    .addComponent(opt5)
                    .addComponent(opt13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opt2)
                    .addComponent(opt6)
                    .addComponent(opt14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opt15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opt16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opt3)
                            .addComponent(opt7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opt4)
                            .addComponent(opt8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt11ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
 String EliBa=cmbBarrios.getSelectedItem().toString();
 String NumIde=txtNumeroDeIdentificacion.getText();
 String nom=txtNombres.getText();
 String ape=txtApellidos.getText();
 String ed=txtEdad.getText();
 String AñodeNa=txtAñodeNacimiento.getText();
 String AñoBa=txtAñosenelBarrio.getText();
 String ConQVi=null;
 if(opt1.isSelected()){ConQVi=opt1.getText();}
 else if (opt2.isSelected()){ConQVi=opt2.getText();}
 else if (opt3.isSelected()){ConQVi=opt3.getText();}
 else if (opt4.isSelected()){ConQVi=opt4.getText();}
 String UstEs=null;
 if(opt5.isSelected()){UstEs=opt5.getText();}
 else if (opt6.isSelected()){UstEs=opt6.getText();}
 else if (opt7.isSelected()){UstEs=opt7.getText();}
 else if (opt8.isSelected()){UstEs=opt8.getText();}
 String sex=null;
 if(optMasculino.isSelected()){sex=optMasculino.getText();}
 else if (optFemenino.isSelected()){sex=optFemenino.getText();} 
 String SuBaIn=null;
 if(opt9.isSelected()){SuBaIn=opt9.getText();}
 else if (opt10.isSelected()){SuBaIn=opt10.getText();}
 String est=null;
 if(opt11.isSelected()){est=opt11.getText();}
 else if (opt12.isSelected()){est=opt12.getText();}
 else if (opt13.isSelected()){est=opt13.getText();}
 else if (opt14.isSelected()){est=opt14.getText();}
 else if (opt15.isSelected()){est=opt15.getText();}
 else if (opt16.isSelected()){est=opt16.getText();}       
 
 Barrios M = new Barrios(EliBa,NumIde,nom,ape,ed,AñodeNa,AñoBa,ConQVi,UstEs,sex,SuBaIn,est);
 CBarrios m = new CBarrios();
//Aca se crea m
 try {
 m.Registar(M);
 } catch (IOException ex) {
 //Logger.getLogger(FrmClientes.class.getName()).log(Level.SEVERE, null, ex);
 }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void optFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optFemeninoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void optMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optMasculinoActionPerformed

    private void cmbBarriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBarriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBarriosActionPerformed

    private void txtNumeroDeIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDeIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDeIdentificacionActionPerformed

        public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBarrios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbBarrios;
    private javax.swing.JLabel eti1;
    private javax.swing.JLabel eti10;
    private javax.swing.JLabel eti11;
    private javax.swing.JLabel eti12;
    private javax.swing.JLabel eti2;
    private javax.swing.JLabel eti3;
    private javax.swing.JLabel eti4;
    private javax.swing.JLabel eti5;
    private javax.swing.JLabel eti6;
    private javax.swing.JLabel eti7;
    private javax.swing.JLabel eti8;
    private javax.swing.JLabel eti9;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt10;
    private javax.swing.JRadioButton opt11;
    private javax.swing.JRadioButton opt12;
    private javax.swing.JRadioButton opt13;
    private javax.swing.JRadioButton opt14;
    private javax.swing.JRadioButton opt15;
    private javax.swing.JRadioButton opt16;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JRadioButton opt5;
    private javax.swing.JRadioButton opt6;
    private javax.swing.JRadioButton opt7;
    private javax.swing.JRadioButton opt8;
    private javax.swing.JRadioButton opt9;
    private javax.swing.JRadioButton optFemenino;
    private javax.swing.JRadioButton optMasculino;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtAñodeNacimiento;
    private javax.swing.JTextField txtAñosenelBarrio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroDeIdentificacion;
    // End of variables declaration//GEN-END:variables
}
