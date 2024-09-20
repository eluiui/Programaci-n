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
    
    System.out.print("matriz 1");
    Matriz matriz=new Matriz();
    System.out.print("matriz 2");
    Matriz matriz2= new Matriz(true);
    System.out.println("resultado suma");
    matriz.sumar(matriz2).mostrarMatriz();
    System.out.println("resultado resta");
    matriz.restar(matriz2).mostrarMatriz();
    }
}