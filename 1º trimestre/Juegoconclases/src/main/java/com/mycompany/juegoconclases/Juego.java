package com.mycompany.juegoconclases;

import java.util.Scanner;

public class Juego {
    private int intento;
    private int numero;

    public Juego(int intento, int numMin, int numMax) {
        this.intento = intento;
        this.numero = (int) Math.floor(Math.random() * (numMin - numMax) + numMax);
    }

    public void random() {
        for (int y = 1, num; y <= intento; y++) {

            System.out.println("Intento " + y + ": ");

            num = new Scanner(System.in).nextInt();

            if (num == this.numero) {
                y = this.intento + 1;
                System.out.println("Ganaste");

            } else if (num < this.numero) {
                System.out.println("El numero es mayor");
            } else if (num > this.numero) {
                System.out.println("El número es menor");
            } else {
                System.out.println("Escribe un valor valido");
            }

        }
    }
}
