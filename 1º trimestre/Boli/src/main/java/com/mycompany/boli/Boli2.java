package com.mycompany.boli;

public class Boli2 {

    private int unidades = 30;

    public void escribir(int numPalabras, String palabra) {
        if (numPalabras > this.unidades) {
            System.out.println("No tienes tinta suficiente");

        } else {
            for (int y = 0; y < numPalabras; y++) {
                System.out.println(palabra);
            }

            this.unidades = this.unidades - numPalabras;
        }

    }
}
