/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bisiesto;

/**
 *
 * @author a22jesusbm
 */
public class Bisiesto {

    public static void main(String[] args) {
        int mes=4;
        boolean bisiesto= true;
        switch (mes) {
            case 1,3,5,7,8,10,12:
                System.out.println("Este mes tiene 31 dias");
                break;
            case 4,6,9,11:
                System.out.println("este mes tiene 30 dias");
            break;
            case 2:
                if (bisiesto == true)
                    System.out.print("Este mes tiene 29 dias");
                else
                    System.out.print("Este mes tiene 28 dias");
                }
        }
               
               
    }

