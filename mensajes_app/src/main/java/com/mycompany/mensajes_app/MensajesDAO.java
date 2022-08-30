/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author felip
 */
public class MensajesDAO {
    
    // Métodos estáticos
    public static void crearMensajeDB(Mensaje mensaje){
        Connection conexion = Conexion.getMyConnection();
        
        // Insercion de los datos
        PreparedStatement ps = null;
        try{
            String query = "INSERT INTO mensajes ( mensaje, autor_mensaje) VALUES (?,?)";
            // Prepare statement
            ps = conexion.prepareStatement(query);
            // Sett variables
            ps.setString(1, mensaje.getMensaje());
            ps.setString(2, mensaje.getAutor_mensaje());
            // Se ejecuta el Query
            ps.executeUpdate();
            System.out.println("Mensaje creado ...");
        } catch(SQLException e){
                System.out.println(e.getMessage());
        }
    }
    
    public static void leerMensajesDB(){
        
    }
    
    public static void borrarMensajeDB(int id_mensaje){
        
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje){
        
    }
}
