package com.examen.sistemadecuentasbancarias.view;

import com.examen.sistemadecuentasbancarias.controller.CconsultasMovimientos;
import com.examen.sistemadecuentasbancarias.model.McuentaAhorro;
import com.examen.sistemadecuentasbancarias.model.McuentaCorriente;

/**
 *
 * @author Kevin
 */
public class Cuenta extends javax.swing.JFrame {
    String tipo;
    McuentaAhorro ahorro = null;
    McuentaCorriente corriente = null;
    CconsultasMovimientos ccm = null;
    
    public Cuenta(CconsultasMovimientos ccm,String tipo) {
        initComponents();
        
        if(tipo.equals("corriente")){
            Cuenta.this.btnDepositarAhorro.setVisible(false);
            Cuenta.this.lblAhorroCant.setVisible(false);
            Cuenta.this.lblAhorro.setVisible(false);
            Cuenta.this.btnRetirarAhorro.setVisible(false);
            corriente = ccm.rcorriente();
            ccm.saldo();
            this.ccm = ccm;
            Cuenta.this.lblSaldo.setText(String.valueOf(corriente.getSaldo()));
            Cuenta.this.lblCuenta.setText(String.valueOf(corriente.getNumeroCuenta()));
        }else if(tipo.equals("corriente")){
            ahorro = ccm.rahorro();
            ccm.saldoahorro();
            this.ccm = ccm;
            Cuenta.this.lblSaldo.setText(String.valueOf(ahorro.getSaldo()));
            Cuenta.this.lblCuenta.setText(String.valueOf(ahorro.getNumeroCuenta()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        lblAhorro = new javax.swing.JLabel();
        lblAhorroCant = new javax.swing.JLabel();
        btnRetirarAhorro = new javax.swing.JButton();
        btnDepositarAhorro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Saldo:");

        jLabel3.setText("No. Cuenta:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar Sesion");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        lblAhorro.setText("Ahorro:");

        btnRetirarAhorro.setText("Retirar");
        btnRetirarAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarAhorroActionPerformed(evt);
            }
        });

        btnDepositarAhorro.setText("Depositar");
        btnDepositarAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarAhorroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRetirar)
                                    .addComponent(lblAhorro))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAhorroCant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRetirarAhorro)
                                .addGap(18, 18, 18)
                                .addComponent(btnDepositarAhorro)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetirar)
                    .addComponent(btnDepositar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAhorro)
                    .addComponent(lblAhorroCant, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetirarAhorro)
                    .addComponent(btnDepositarAhorro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnCerrar)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Cuenta.this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Cuenta.this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Cuenta.this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retirar(ccm,corriente).setVisible(true);
            }
        });
        Cuenta.this.dispose();
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Depositar(ccm,corriente).setVisible(true);
            }
        });
        Cuenta.this.dispose();
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarAhorroActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retirar(ccm,ahorro).setVisible(true);
            }
        });
        Cuenta.this.dispose();
    }//GEN-LAST:event_btnRetirarAhorroActionPerformed

    private void btnDepositarAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarAhorroActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Depositar(ccm,ahorro).setVisible(true);
            }
        });
        Cuenta.this.dispose();
    }//GEN-LAST:event_btnDepositarAhorroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnDepositarAhorro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnRetirarAhorro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAhorro;
    private javax.swing.JLabel lblAhorroCant;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblSaldo;
    // End of variables declaration//GEN-END:variables
}
