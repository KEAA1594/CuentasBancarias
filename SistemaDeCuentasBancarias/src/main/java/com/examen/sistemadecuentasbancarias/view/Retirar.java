package com.examen.sistemadecuentasbancarias.view;

import com.examen.sistemadecuentasbancarias.controller.CconsultasMovimientos;
import com.examen.sistemadecuentasbancarias.model.McuentaAhorro;
import com.examen.sistemadecuentasbancarias.model.McuentaCorriente;

/**
 *
 * @author Kevin
 */
public class Retirar extends javax.swing.JFrame {
    CconsultasMovimientos ccm = null;
    String tipo = "";
    McuentaAhorro ahorro = null;
    McuentaCorriente corriente = null;

    public Retirar(CconsultasMovimientos ccm,McuentaCorriente corriente) {
        initComponents();
        this.ccm = ccm;
        tipo = "corriente";
    }
    public Retirar(CconsultasMovimientos ccm,McuentaAhorro ahorro) {
        initComponents();
        this.ccm = ccm;
        tipo = "ahorro";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFieldRetirar = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad que desea retirar:");

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(btnRetirar)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRetirar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Retirar.this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Retirar.this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        String txtvalue = Retirar.this.txtFieldRetirar.getText();
        if(tipo.equals("corriente") && !txtvalue.equals("")){
            ccm.retirosaldo(Long.parseLong(txtvalue));
            corriente = ccm.rcorriente();
            Retirar.this.dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Cuenta(ccm,tipo).setVisible(true);
                }
            });
            
        }else if(tipo.equals("ahorro") && !txtvalue.equals("")){
            ccm.retiroahorro(Long.parseLong(txtvalue));
            ahorro = ccm.rahorro();
            Retirar.this.dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Cuenta(ccm,tipo).setVisible(true);
                }
            });
        }
        
        
    }//GEN-LAST:event_btnRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtFieldRetirar;
    // End of variables declaration//GEN-END:variables
}
