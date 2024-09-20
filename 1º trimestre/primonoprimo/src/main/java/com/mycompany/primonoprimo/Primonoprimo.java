/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.primonoprimo;

/**
 *
 * @author a22jesusbm
 */
public class Primonoprimo {

    public static void main(String[] args) {
        boolean primo=true;
        int y=-1;
        for (int cont=2;cont<y&&primo;cont++) {
            if (y%cont==0){
                primo=false;
            }
            if (primo) {
                System.out.println(y+"es primo");
    }
            else {
             System.out.println(y+"no es primo");
    }
}
 }}