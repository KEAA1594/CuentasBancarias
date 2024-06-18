package com.examen.sistemadecuentasbancarias.view;

import com.examen.sistemadecuentasbancarias.controller.Cregistro;

/**
 *
 * @author Kevin
 */
public class Registrar extends javax.swing.JFrame {

    public Registrar() {
        initComponents();
        Registrar.this.jrbCorriente.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldUsuario = new javax.swing.JTextField();
        txtFieldPass = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jrbCorriente = new javax.swing.JRadioButton();
        jrbAhorro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Password:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jrbCorriente.setText("Corriente");
        jrbCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCorrienteActionPerformed(evt);
            }
        });

        jrbAhorro.setText("Ahorro");
        jrbAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAhorroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(txtFieldPass))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbCorriente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbAhorro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnRegistrar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbCorriente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbAhorro))
                .addGap(26, 26, 26)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Registrar.this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bancxamen().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Registrar.this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Cregistro cr = new Cregistro();
        if(Registrar.this.jrbAhorro.isSelected()){
            if(!Registrar.this.txtFieldUsuario.getText().equals("") && !Registrar.this.txtFieldPass.getText().equals("")){
                cr.registrarahorro(Registrar.this.txtFieldUsuario.getText(), Registrar.this.txtFieldPass.getText());
            }
        }else if(Registrar.this.jrbCorriente.isSelected()){
            if(!Registrar.this.txtFieldUsuario.getText().equals("") && !Registrar.this.txtFieldPass.getText().equals("")){
                cr.registrarcorriente(Registrar.this.txtFieldUsuario.getText(), Registrar.this.txtFieldPass.getText());
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jrbCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCorrienteActionPerformed
        Registrar.this.jrbAhorro.setSelected(false);
    }//GEN-LAST:event_jrbCorrienteActionPerformed

    private void jrbAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAhorroActionPerformed
        Registrar.this.jrbCorriente.setSelected(false);
    }//GEN-LAST:event_jrbAhorroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jrbAhorro;
    private javax.swing.JRadioButton jrbCorriente;
    private javax.swing.JTextField txtFieldPass;
    private javax.swing.JTextField txtFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
