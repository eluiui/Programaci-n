/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.juego;

import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Juego {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int num= (int) Math.floor(Math.random() * 99), intento = 100;

            for (int y = 1; y <= 5 && intento != num; y++) {
                System.out.println(y + "º intento");
                intento= scan.nextInt();
                
                if (intento<=99 && intento >=0);
                   if (intento==num){
                      System.out.println("Ganaste");
                   }else if (intento !=num&&y==5){
                      System.out.println("Perdiste vuelve a intentarlo");
                      System.out.println("El número era: "+num);
                   }else if (intento>num){
                       System.out.println("El número es menor");
                   }else
                       System.out.println("El número es mayor");
      }
        }
    }
  }
