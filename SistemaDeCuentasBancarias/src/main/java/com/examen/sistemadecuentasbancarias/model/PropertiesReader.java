/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.sistemadecuentasbancarias.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Kevin
 */
public class PropertiesReader {
      protected String read(String property){
    Properties prop = connect();
    
    return prop.getProperty(property);
    } 
    
    private Properties connect(){
        Properties prop = null;
        try{
            prop = new Properties();
            prop.load(new FileInputStream("./assets/config.properties"));
        }catch(IOException e){
            e.printStackTrace();
        }
    
    return prop;
    }
}
