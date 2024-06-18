package com.examen.sistemadecuentasbancarias.view;

import com.examen.sistemadecuentasbancarias.controller.CconsultasMovimientos;
import com.examen.sistemadecuentasbancarias.model.McuentaAhorro;
import com.examen.sistemadecuentasbancarias.model.McuentaCorriente;

/**
 *
 * @author Kevin
 */
public class Depositar extends javax.swing.JFrame {
    CconsultasMovimientos ccm;
    String tipo = "";
    McuentaAhorro ahorro = null;
    McuentaCorriente corriente = null;

    public Depositar(CconsultasMovimientos ccm,McuentaCorriente corriente) {
        initComponents();
        this.ccm = ccm;
        tipo = "corriente";
    }
    public Depositar(CconsultasMovimientos ccm,McuentaAhorro ahorro) {
        initComponents();
        this.ccm = ccm;
        tipo = "ahorro";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFieldDepositar = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad a depositar:");

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtFieldDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(btnDepositar)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDepositar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Depositar.this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Depositar.this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        String txtvalue = Depositar.this.txtFieldDepositar.getText();
        System.out.println(txtvalue);
        if(tipo.equals("corriente") && !txtvalue.equals("")){
            ccm.depositosaldo(Long.parseLong(txtvalue));
            corriente = ccm.rcorriente();
            Depositar.this.dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Cuenta(ccm,tipo).setVisible(true);
                }
            });
           
           
            
        }else if(tipo.equals("ahorro") && !txtvalue.equals("")){
            ccm.retiroahorro(Long.parseLong(txtvalue));
            ahorro = ccm.rahorro();
            Depositar.this.dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Cuenta(ccm,tipo).setVisible(true);
                }
            });
            
            
        }
    }//GEN-LAST:event_btnDepositarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtFieldDepositar;
    // End of variables declaration//GEN-END:variables
}
