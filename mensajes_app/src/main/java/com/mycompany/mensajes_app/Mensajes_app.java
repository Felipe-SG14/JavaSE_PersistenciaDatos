/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author felip
 */
public class Mensajes_app {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Conexion conexion = new Conexion();
        try{
            Connection cnx = conexion.get_Connection();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
