package com.examen.sistemadecuentasbancarias.model;

import java.sql.ResultSet;

/**
 *
 * @author Kevin
 */
public abstract class McuentaBancaria {
    
    private String usuario;
    private int numeroCuenta;
    private long saldo;
    private long ahorro;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    
    public long getAhorro() {
        return ahorro;
    }

    public void setAhorro(long ahorro) {
        this.ahorro = ahorro;
    }
    
    public abstract ResultSet consulta();
    public abstract long registro(String contra);
    public abstract long deposito();
    public abstract long retiro();
}
