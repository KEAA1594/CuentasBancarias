package com.examen.sistemadecuentasbancarias.view;

/**
 *
 * @author Kevin
 */
public class Bancxamen extends javax.swing.JFrame {

    public Bancxamen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSesion = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bancxamen");

        btnSesion.setText("Iniciar Sesion");
        btnSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionActionPerformed(evt);
            }
        });

        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("no tienes cuenta?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(btnSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionActionPerformed
        Bancxamen.this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Bancxamen.this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        Bancxamen.this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnRegistroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
