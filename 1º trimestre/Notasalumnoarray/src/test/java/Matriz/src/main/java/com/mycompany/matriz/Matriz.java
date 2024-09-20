/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matriz;

/**
 *
 * @author a22jesusbm
 */
public class Matriz {

    public static void main(String[] args) {
 for (int y=0,numero=10;y<5;y++,numero--,System.out.print("\n")){
       System.out.print(numero+" ");
       for (int y2=1,numero2=numero-1;y2<5;y2++,numero2--){
           System.out.print(numero2+" ");
       }      
    }
  }
}
