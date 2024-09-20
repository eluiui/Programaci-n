/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sumamatrices;

/**
 *
 * @author a22jesusbm
 */
public class Sumamatrices {

    public static void main(String[] args) {
        //Matriz matriz = new Matriz();
        //System.out.println("Segunda matriz a sumar: ");
        //matriz.mostrarMatriz(matriz.sumar());

        System.out.println("Matriz 1:");
        Matriz2 matriz = new Matriz2();
        System.out.println("Matriz 2:");
        Matriz2 matriz2 = new Matriz2();

        System.out.println("Matriz 1:");
        matriz.mostrarMatriz(matriz);
        System.out.println("Matriz 2:");
        matriz2.mostrarMatriz(matriz2);

        System.out.println("Resultado suma:");
        matriz2.mostrarMatriz(matriz2.sumar(matriz));
    }
}
