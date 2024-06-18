package com.examen.sistemadecuentasbancarias.model;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Kevin
 */
public class McuentaAhorro extends McuentaBancaria{
      String usuario = super.getUsuario();
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
    public void setAhorro(long ahorro) {
        super.setAhorro(ahorro); 
    }
    
    @Override
    public ResultSet consulta() {
        return dao.consultasaldo(conn,usuario);
    }

    @Override
    public long registro(String contra) {
        return dao.insertusuariocorriente(conn,usuario, contra);
    }

    @Override
    public long deposito() {
        return dao.updatesaldo(conn,super.getSaldo(), super.getNumeroCuenta());
    }

    @Override
    public long retiro() {
        return dao.updatesaldo(conn,super.getSaldo(), super.getNumeroCuenta());
    }
    
    public long depositoahorro() {
        return dao.updateahorro(conn,super.getAhorro(), super.getNumeroCuenta());
    }

    public long retiroahorro() {
        return dao.updateahorro(conn,super.getAhorro(), super.getNumeroCuenta());
    }
    
    public ResultSet consultaahorro() {
        return dao.consultaahorro(conn,usuario);
    }
}
