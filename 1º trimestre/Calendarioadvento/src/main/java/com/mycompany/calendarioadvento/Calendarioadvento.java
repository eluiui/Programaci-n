/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calendarioadvento;

import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Calendarioadvento {

    public static void main(String[] args) {
      Calendario calendario=new Calendario();
      calendario.mostrar();

      Scanner scan = new Scanner(System.in);
      for (int i = 0; i < 24; i++) {
          System.out.print("Numero a comer: ");
          calendario.comer(scan.nextInt());
          calendario.mostrar();
          calendario.llegoNavidad();
      }
      
    }
}
