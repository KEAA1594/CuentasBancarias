package com.examen.sistemadecuentasbancarias.controller;

import com.examen.sistemadecuentasbancarias.model.DAO;
import com.examen.sistemadecuentasbancarias.model.DBConnection;
import com.examen.sistemadecuentasbancarias.model.McuentaAhorro;
import com.examen.sistemadecuentasbancarias.model.McuentaCorriente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kevin
 */
public class CconsultasMovimientos {
        McuentaAhorro ahorro;
        McuentaCorriente corriente;
        private String contra;
        DBConnection dbconn = new DBConnection();
        Connection conn = dbconn.dbConnection();
    
    public McuentaAhorro rahorro(){
        return this.ahorro;
    }
    public McuentaCorriente rcorriente(){
        return this.corriente;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
        
    public String iniciosesion(String usuario,String contra){
        DAO dao = new DAO();

        ResultSet rs = dao.iniciosesion(conn,usuario, contra);
        String tipo = "";
        this.contra = contra;
        try{
            tipo =rs.getString(4);
            
            if(tipo.equals("ahorro")){
                ahorro = new McuentaAhorro();
                ahorro.setConnection(conn);
                ahorro.setUsuario(usuario);
                ahorro.setNumeroCuenta(rs.getInt(1));
            }else if(tipo.equals("corriente")){
                corriente = new McuentaCorriente();
                corriente.setUsuario(usuario);
                corriente.setConnection(conn);
                corriente.setNumeroCuenta(rs.getInt(1));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return tipo;
    }
    public int[] saldoahorro(){
        int[] sald = new int[2];
        try{
            ResultSet rssaldo = ahorro.consulta();
            ResultSet rsahorro = ahorro.consultaahorro();
            
            ahorro.setSaldo(rssaldo.getInt(3));
            ahorro.setAhorro(rsahorro.getInt(3));
            sald[0] = rssaldo.getInt(3);
            sald[1] = rsahorro.getInt(3);
            
        }catch(SQLException e){
        e.printStackTrace();}
        return sald;
    }
    public int saldo(){
        int sald = 0;
        try{
            ResultSet rssaldo = corriente.consulta();
            
            corriente.setSaldo(rssaldo.getInt(3));
            sald = rssaldo.getInt(3);
            
        }catch(SQLException e){
        e.printStackTrace();}
        return sald;
    }
    public void depositosaldo(long depositar){
        corriente.setSaldo(saldo()+depositar);
        corriente.deposito();
    }
    public void depositoahorro(long ahorrar){
        int[] sald = saldoahorro();
        ahorro.setAhorro(sald[1]+ahorrar);
        ahorro.depositoahorro();
    }
    public void retirosaldo(long retiros){
        corriente.setSaldo(saldo()-retiros);
        corriente.retiro();
    }
    public void retiroahorro(long retiroa){
        int[] sald = saldoahorro();
        ahorro.setAhorro(sald[1]-retiroa);
        ahorro.retiroahorro();
    }
}
