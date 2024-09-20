/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ordenar;

/**
 *
 * @author a22jesusbm
 */
public class Ordenar {

    public static void main(String[] args) {

        ArrayOrdenar ordenar = new ArrayOrdenar(1000, 95, 26, 3, 99);
        ordenar.ordenar();
        try{
           ordenar.mostrar(); 
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        
    }
}
