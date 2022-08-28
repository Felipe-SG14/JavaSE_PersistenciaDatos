/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felip
 */
public class Inicio {

    public static void main(String[] args) {
        
        // Menu
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println("Iniciando aplicación...");
        
        do{
            //Connecting to database
            if( Conexion.getMyConnection() == null ){
                System.out.println("Conectando a la base de datos...");
                Conexion.get_Connection();
            }
          
            System.out.println("--------------------------");
            System.out.println("Aplicación de mensajes...");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");
            // Leemos la opcion del usuario
            System.out.print("\nIngesa tu opción: ");
            opcion = Integer.parseInt(sc.nextLine());
            
            // Switch
            switch(opcion){
                case 1 -> mensajesService.crearMensaje();
                case 2 -> mensajesService.listarMensajes();
                case 3 -> mensajesService.editarMensaje();
                case 4 -> mensajesService.borrarMensaje();
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Ingresa una opción adecuada...\n");
            }  
        }while(opcion != 5);
        
        // Close connection
        
        Connection conexion = Conexion.getMyConnection();
        try {
            conexion.close();
            System.out.println("Conexión cerrada...");
        } catch (SQLException ex) {
            System.out.println("Error al cerrar conexión...");
        }
        
    }
}
