package com.examen.sistemadecuentasbancarias.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kevin
 */
public class DBConnection {
    PropertiesReader prop = new PropertiesReader();
    
    public Connection dbConnection(){
        Connection conn = createConnection();
        return conn;
    }
    private Connection createConnection(){
        
        Connection conn = null;
        try{
            String url = prop.read("db.url");
            conn = DriverManager.getConnection(url);
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conn;
    }
}
