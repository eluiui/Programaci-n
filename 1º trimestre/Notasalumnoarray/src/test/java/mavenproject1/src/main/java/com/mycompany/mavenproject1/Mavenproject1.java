/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author a22jesusbm
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int total=150000;
        int resto=total%3600;
        int resto2=resto/60;
        int segundos= resto2/60;
        int minutos=resto/60;
        int horas=total/3600;   
        System.out.println("segundos:"+ segundos);
        System.out.println("minutos:"+ minutos);
        System.out.println("horas:"+horas);
    }
}
