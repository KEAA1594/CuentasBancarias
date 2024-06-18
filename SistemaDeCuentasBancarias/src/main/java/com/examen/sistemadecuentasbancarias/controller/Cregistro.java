package com.examen.sistemadecuentasbancarias.controller;
import com.examen.sistemadecuentasbancarias.model.McuentaCorriente;
import com.examen.sistemadecuentasbancarias.model.McuentaAhorro;

/**
 *
 * @author Kevin
 */
public class Cregistro {
    
    public long registrarcorriente(String usuario,String contra){
        McuentaCorriente corriente = new McuentaCorriente();
        corriente.setUsuario(usuario);
        return corriente.registro(contra);
    }
    
    public long registrarahorro(String usuario,String contra){
        McuentaAhorro ahorro = new McuentaAhorro();
        ahorro.setUsuario(usuario);
        return ahorro.registro(contra);
    }
    
}
