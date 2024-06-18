package com.examen.sistemadecuentasbancarias.model;


import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Kevin
 */
public class McuentaCorriente extends McuentaBancaria{
    DAO dao = new DAO();
    Connection conn;
    
    
    public void setConnection(Connection conn) {
        this.conn = conn; 
    }
    
    @Override
    public void setUsuario(String usuario) {
        super.setUsuario(usuario); 
    }

    @Override
    public void setNumeroCuenta(int numeroCuenta) {
        super.setNumeroCuenta(numeroCuenta); 
    }

    @Override
    public void setSaldo(long saldo) {
        super.setSaldo(saldo); 
    }
    
    @Override
    public ResultSet consulta() {
        return dao.consultasaldo(conn,super.getUsuario());
    }

    @Override
    public long registro(String contra) {
        return dao.insertusuariocorriente(conn,super.getUsuario(), contra);
    }

    @Override
    public long deposito() {
        return dao.updatesaldo(conn,super.getSaldo(), super.getNumeroCuenta());
    }

    @Override
    public long retiro() {
        return dao.updatesaldo(conn,super.getSaldo(), super.getNumeroCuenta());
    }
    
    
    
    
}
