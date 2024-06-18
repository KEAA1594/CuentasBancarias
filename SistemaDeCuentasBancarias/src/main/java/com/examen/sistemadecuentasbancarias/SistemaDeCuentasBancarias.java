package com.examen.sistemadecuentasbancarias;

import com.examen.sistemadecuentasbancarias.view.Bancxamen;

/**
 *
 * @author Kevin
 */
public class SistemaDeCuentasBancarias {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bancxamen().setVisible(true);
            }
        });
    }
}
