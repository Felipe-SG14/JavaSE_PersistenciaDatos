/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class MensajesService {
    
    
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCreación del mensaje...");
        System.out.print("Ingresa tu mensaje: ");
        String mensaje = sc.nextLine();
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        
        // Creación del mensaje y set de valores
        Mensaje registro = new Mensaje();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
        
        
    }
    
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }
    
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEliminación de mensaje...");
        System.out.print("Ingresa el id de mensaje a eliminar: ");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }
    
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nActualización de mensaje...");
        System.out.print("Escribe el nuevo mensaje: ");
        String mensaje = sc.nextLine();
        System.out.print("Indica el id del mensaje a editar: ");
        int id_mensaje = sc.nextInt();
        Mensaje actualizacion = new Mensaje();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
    
}
