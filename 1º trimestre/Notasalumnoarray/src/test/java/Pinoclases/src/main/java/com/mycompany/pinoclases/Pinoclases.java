/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pinoclases;

import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Pinoclases {

    public static void main(String[] args) {
        Pino pino = new Pino();

        Scanner scan = new Scanner(System.in);
        System.out.print("Elige una altura: ");
        pino.setAltura(scan.nextInt());
        System.out.println(pino.getAltura());

        System.out.print("Cuanto quieres cortar: ");
        pino.cortar(scan.nextInt());
        System.out.println(pino.getAltura());

    }
}
