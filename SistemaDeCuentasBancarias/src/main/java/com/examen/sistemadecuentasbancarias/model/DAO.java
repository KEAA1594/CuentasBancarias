package com.examen.sistemadecuentasbancarias.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kevin
 */
public class DAO extends DBConnection{
    private String INSERTARUSUARIOS = "INSERT INTO USUARIOS VALUES (null,?,?,?)";
    private String INSERTARSALDO = "INSERT INTO SALDOS VALUES (null,?,?)";
    private String INSERTARAHORRO = "INSERT INTO AHORROS VALUES (null,?,?)";
    private String IDUSUARIO = "SELECT ID FROM USUARIOS WHERE NOMBRE = ?";
    
    private String UPDATESALDO = "UPDATE SALDOS SET SALDO = ? WHERE IDUSUARIO = ?";
    private String UPDATEAHORRO = "UPDATE AHORROS SET AHORRO = ? WHERE IDUSUARIO NOMBRE = ?";
   
    private String INICIODESESION = "SELECT * FROM USUARIOS WHERE NOMBRE = ? AND PASSW = ?";
    private String CONSULTASALDO = "SELECT * FROM SALDOS WHERE IDUSUARIO = (SELECT ID FROM USUARIOS WHERE NOMBRE = ?)";
    private String CONSULTAAHORRO = "SELECT * FROM AHORROS WHERE IDUSUARIO = (SELECT ID FROM USUARIOS WHERE NOMBRE = ?)";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public int insertusuariocorriente(Connection conn,String usuario, String contra){
        int rowsAffected = 0;
        try{

            ps = conn.prepareStatement(INSERTARUSUARIOS);
            
            ps.setString(1, usuario);
            ps.setString(2, contra);
            ps.setString(3, "corriente");
            
            ps.executeUpdate();
            
            ps = conn.prepareStatement(IDUSUARIO);
            ps.setString(1, usuario);
            
            rs = ps.executeQuery();
            
            ps = conn.prepareStatement(INSERTARSALDO);
            ps.setInt(1, rs.getInt(1));
            ps.setInt(2, rowsAffected);
            
            ps.executeUpdate();
            return rowsAffected;
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rowsAffected;
    }
    public int insertusuarioahorro(Connection conn,String usuario, String contra){
        int rowsAffected = 0;
        try{
            
            ps = conn.prepareStatement(INSERTARUSUARIOS);
            
            ps.setString(1, usuario);
            ps.setString(2, contra);
            ps.setString(3, "ahorro");
            
            rowsAffected = ps.executeUpdate();
            
            ps = conn.prepareStatement(IDUSUARIO);
            ps.setString(1, usuario);
            
            rs = ps.executeQuery();
            
            ps = conn.prepareStatement(INSERTARSALDO);
            ps.setInt(1, rs.getInt(1));
            ps.setInt(2, rowsAffected);
            
            ps.executeUpdate();
            
            ps = conn.prepareStatement(INSERTARAHORRO);
            ps.setInt(1, rs.getInt(1));
            ps.setInt(2, rowsAffected);
            
            ps.executeUpdate();
            
            return rowsAffected;
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rowsAffected;
    }
    public int updatesaldo(Connection conn,long saldo, int id){
        int rowsAffected = 0;
        try{
            ps = conn.prepareStatement(UPDATESALDO);
            ps.setLong(1, saldo);
            ps.setInt(2, id);
            
            rowsAffected = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rowsAffected;
    }
    public int updateahorro(Connection conn,long saldo, int id){
        int rowsAffected = 0;
        try{
            
            
            ps = conn.prepareStatement(UPDATEAHORRO);
            ps.setLong(1, saldo);
            ps.setInt(2, id);
            rowsAffected = ps.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rowsAffected;
    }
    public ResultSet consultasaldo(Connection conn,String usuario){
        try{
            
            ps = conn.prepareStatement(CONSULTASALDO);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet consultaahorro(Connection conn,String usuario){
        try{
            
            ps = conn.prepareStatement(CONSULTAAHORRO);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet iniciosesion(Connection conn,String usuario, String contra){
        try{
           
            ps = conn.prepareStatement(INICIODESESION);
            ps.setString(1, usuario);
            ps.setString(2, contra);
            rs = ps.executeQuery();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    
}
