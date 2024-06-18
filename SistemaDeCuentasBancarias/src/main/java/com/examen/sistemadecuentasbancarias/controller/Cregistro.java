package com.examen.sistemadecuentasbancarias.controller;
import com.examen.sistemadecuentasbancarias.model.DBConnection;
import com.examen.sistemadecuentasbancarias.model.McuentaCorriente;
import com.examen.sistemadecuentasbancarias.model.McuentaAhorro;
import java.sql.Connection;

/**
 *
 * @author Kevin
 */
public class Cregistro {
    DBConnection dbconn = new DBConnection();
        Connection conn = dbconn.dbConnection();
    
    public long registrarcorriente(String usuario,String contra){
        McuentaCorriente corriente = new McuentaCorriente();
        corriente.setUsuario(usuario);
        corriente.setConnection(conn);
        return corriente.registro(contra);
    }
    
    public long registrarahorro(String usuario,String contra){
        McuentaAhorro ahorro = new McuentaAhorro();
        ahorro.setUsuario(usuario);
        ahorro.setConnection(conn);
        return ahorro.registro(contra);
    }
    
}
