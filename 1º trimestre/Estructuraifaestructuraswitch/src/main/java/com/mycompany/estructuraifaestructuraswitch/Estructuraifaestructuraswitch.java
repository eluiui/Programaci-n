/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructuraifaestructuraswitch;

/**
 *
 * @author a22jesusbm
 */
public class Estructuraifaestructuraswitch {

    public static void main(String[] args) {
        int calificacion=7;
        switch (calificacion) {
            
            case 10:
                System.out.println("Matricula de honor");
                  break;
            case 9:
                System.out.println("sobresaliente");
                  break;
            case 7,8:
                System.out.println("Notable");
                  break;
            case 6:
                System.out.println("Bien");
                  break;
            case 5: 
                System.out.println("Aprobado");
                  break;
            default:
                System.out.println("Suspenso");
                
                
        }
    }
}
