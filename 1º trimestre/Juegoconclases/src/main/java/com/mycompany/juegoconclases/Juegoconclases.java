package com.mycompany.juegoconclases;

import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Juegoconclases {

    public static void main(String[] args) {
        int intento, numMin, numMax;

        Scanner scan = new Scanner(System.in);

        System.out.println("Elige el numero de intentos: ");
        intento = scan.nextInt();
        System.out.println("Numero minimo: ");
        numMin = scan.nextInt();
        System.out.println("Numero maximo: ");
        numMax = scan.nextInt();

        Juego juego = new Juego(intento, numMin, numMax);
        juego.random();
    }
}