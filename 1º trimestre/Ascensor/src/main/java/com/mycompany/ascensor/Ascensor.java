/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ascensor;

/**
 *
 * @author a22jesusbm
 */
public class Ascensor {

    public static void main(String[] args) {
       char mover='m';
       switch (mover){
           case 'a': 
               System.out.println("abrir");
                 break;
           case 'b':
               System.out.println("bajar");
                 break;
           case 'c':
               System.out.println("cerrar");
                 break;
           case 's':
               System.out.println("subir");
                 break;
           default:
                System.out.println("ERROR");
       }
              
       
               
                
    }
}
