/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.carteraclase;

import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Carteraclase {

    public static void main(String[] args) {
        Cartera cartera1 = new Cartera();
        Scanner scan = new Scanner(System.in);

        System.out.println("Cuanto efectivo tienes: ");
        double dinero = scan.nextDouble();
        System.out.println("Tienes tarjeta");
        boolean tarjeta = scan.nextBoolean();

        cartera1.setDinero(dinero, tarjeta);

        
    }
}
