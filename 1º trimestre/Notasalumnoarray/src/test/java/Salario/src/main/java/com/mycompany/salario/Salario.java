/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.salario;

/**
 *
 * @author a22jesusbm
 */
public class Salario {

    public static void main(String[] args) {
       char dia='d';
       char noche='n';
       char domingo='d';
       char dias='x';
       int horas=8;
       if (dia=='d'){
           if (dia=='d'&&dias=='x')
               System.out.println("Ganara "+(horas*8)+"€");
           else if(dia=='d'&&domingo=='d')
               System.out.println("Ganara "+horas*(8+(8*0.2))+"€");
       } else if(noche=='n'){
           if (noche=='n'&&dias=='x')
               System.out.println("Ganara "+horas*12+"€");
           else if(noche=='n'&&domingo=='d')
               System.out.println("Ganara "+horas*(12+(12*0.2))+"€");
    }
      
    }
}
