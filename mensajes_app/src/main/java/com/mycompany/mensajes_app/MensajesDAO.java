/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        Connection conexion = Conexion.getMyConnection();
        // Permite preparar la sentencia
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            // Query y preparación
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            
            // Ejecución del Query
            rs = ps.executeQuery();
            
            // Imprimiendo datos
            System.out.println("\nLista de mensajes...\n");
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }
                    
                    
        } catch(SQLException e){
                System.out.println("No se pudieron recuperar los mensajes...");
                System.out.println(e.getMessage());
        }
    }
    
    public static void borrarMensajeDB(int id_mensaje){
        Connection conexion = Conexion.getMyConnection();
        // Permite preparar la sentencia
        PreparedStatement ps = null;
        try{
            
            //Query y preparacion
            String query = "DELETE FROM mensajes where id_mensaje = ?";
            ps = conexion.prepareStatement(query);
            
            //Asignar valor
            ps.setInt(1, id_mensaje);
            
            //Se ejecuta el Query
            ps.executeUpdate();
            System.out.println("El mensaje ha sido borrado...");
            
        } catch(SQLException e){
                System.out.println("No se pudo borrar el mensaje...");
                System.out.println(e.getMessage());
        }
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje){
        Connection conexion = Conexion.getMyConnection();
        // Permite preparar la sentencia
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            // Query definition and preparation
            String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
            ps = conexion.prepareStatement(query);
            
            // Setting values
            ps.setString(1, mensaje.getMensaje());
            ps.setInt(2, mensaje.getId_mensaje());
            
            // Executing
            ps.executeUpdate();
            System.out.println("Se actualizo el mensaje...");
            
        } catch(SQLException e){
                System.out.println("No se actualizar el mensaje...");
                System.out.println(e.getMessage());
        }
    }
}
