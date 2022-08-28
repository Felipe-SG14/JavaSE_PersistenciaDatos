/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Inicio {

    public static void main(String[] args) {
        
        // Menu
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do{
            System.out.println("-------------");
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
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensajes();
                    break;
                case 3:
                    mensajesService.editarMensaje();
                    break;
                case 4:
                    mensajesService.borrarMensaje();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingresa una opción adecuada...\n");
                    break;
            }
            
            
        }while(opcion != 5);
        
        
//        Conexion conexion = new Conexion();
//        try{
//            Connection cnx = conexion.get_Connection();
//        } catch(Exception e) {
//            System.out.println(e);
//        }
    }
}
