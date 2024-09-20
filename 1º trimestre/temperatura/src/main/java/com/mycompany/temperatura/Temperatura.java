/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.temperatura;

/**
 *
 * @author a22jesusbm
 */
public class Temperatura {

    public static void main(String[] args) {
     int tem=25;
     int hum=51;
     if (tem>24 && hum>50)
         System.out.println("Alerta roja");
     else if (tem>24 && hum<50)
         System.out.println("Alerta amarilla");
     else if (tem<24 && hum<50)
         System.out.println("Alerta verde");
       
        
    }
}
