/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author felip
 */
public class MensajesDAO {
    
    // Métodos estáticos
    public static void CrearMensajeDB(Mensaje mensaje){
        Connection conexion = Conexion.getMyConnection();
        
        // Insercion de los datos
        try{
            PreparedStatement ps = null;
            try{
                String query = "";
            } catch {
                
            }
        }catch{
            
        }
        
    }
    
    public static void leerMensajesDB(){
        
    }
    
    public static void borrarMensajeDB(int id_mensaje){
        
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje){
        
    }
}