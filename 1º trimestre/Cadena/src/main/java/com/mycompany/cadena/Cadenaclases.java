/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadena;

import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Cadenaclases {

    public static void main(String[] args) {
        String string, string2, string3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Cadena1: ");
        string = scan.nextLine();
        System.out.println("Cadena2: ");
        string2 = scan.nextLine();
        System.out.println("Cadena3: ");
        string3 = scan.nextLine();

        Cadena cadena =new Cadena(string, string2, string3);
        

    }
}
