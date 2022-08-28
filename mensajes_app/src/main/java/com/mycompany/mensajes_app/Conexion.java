/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author felip
 */
public class Conexion {
    
    private static Connection myConnection = null;
    
    public static Connection get_Connection(){
        if(myConnection == null){
            try{
                myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");         
                System.out.println("Conexión exitosa...");
            } catch(SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return myConnection;
    }

    public static Connection getMyConnection() {
        return myConnection;
    }
    
}
