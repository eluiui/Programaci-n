package com.mycompany.lasvocales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palabra {
    private int intentos = 5;
    private String palabraOculta = "perro", palabra;
    private List<Character> letras = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    // Cambia un arraylist con _ por cada letra que tiene la palabra
    private void llenarLista() {
        letras.clear();
        for (int y = 0; y < palabraOculta.length(); y++) {
            letras.add('_');
        }
    }

    // muestra el array
    private void mostrarLista() {
        for (int y = 0; y < palabraOculta.length(); y++) {
            System.out.print(letras.get(y));
            System.out.print(" ");
        }
        System.out.print("\n\n");
    }

    // pide una palabra de cinco letras y al recibirla llama al metodo comprobar
    private void pedirPalabra() {
        boolean error = true;
        while (error) {
            System.out.print("Intento nº" + intentos + ": ");
            palabra = scan.nextLine();
            if (palabra.length() == palabraOculta.length()) {
                error = false;
                comprobar(palabra);
            } else {
                System.out.println("La palabra tiene que tener " + palabraOculta.length() + " letras :)");
            }
        }
    }

    // comprueba si concide algun letra de la palara introducida con
    // la palabra que teniamos si es asi si la intercambia en el array
    // en la misma posicion y si la palabra que teniamos contiene alguna letra
    // de la palabra introducida nos dice cual es la lera que no corresponde
    // en esa posicion acto seguido resta un intento
    private void comprobar(String palabra) {
        for (int y = 0; y < palabraOculta.length(); y++) {
            if (palabraOculta.charAt(y) == palabra.charAt(y)) {
                letras.set(y, palabra.charAt(y));
            } else if (palabraOculta.indexOf(palabra.charAt(y)) != -1) {
                System.out.print("La letra [" + palabra.charAt(y) + "] no esta en la posicion correcta :)\n");
            }
        }
        intentos--;
    }

    // comprueba que el array esta completo con palabras o en caso de que
    // se acabasen los intentos, devuelve si el juego continua o si ha acabado
    private boolean end() {
        if (palabraOculta.equals(palabra)) {
            System.out.print("Has ganado!!");
            return true;
        } else if (intentos == 0) {
            System.out.print("Se acabaron los intentos");
            return true;
        }
        return false;

    }

    // muestra las intrucciones del juego, llama al metodo llenarlista
    // y llama a los metodos mostrarlista y pedirpalabra hasta que el
    // metodo fin devuelva que el juego ha acabado
    public void jugar() {
        System.out.println("\nTienes que adivinar una palabra de " + palabraOculta.length()
                + " caracteres escribiendo palabras de su misma longitud, tienes " + intentos + " intentos");
        llenarLista();
        while (!end()) {
            mostrarLista();
            llenarLista();
            pedirPalabra();
        }
    }
}
