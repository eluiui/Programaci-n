/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sumamultiplos5negativo;

/**
 *
 * @author a22jesusbm
 */
public class Sumamultiplos5negativo {

    public static void main(String[] args) {
       int numero=-1;
       int numero2=10;
       int suma=0;
       int y=numero;
       int y2=numero2;
       
       if (numero>0&&numero2>0) {
         if (numero<=numero2){
            while (y<numero2){
                if (y%5==0){
                suma=suma+y;
           }
                y++;
           }
           System.out.println(suma);
       }else {
           while (y2<numero2){
                if (y2%5==0){
                suma=suma+y2;
           }
                y2++;
           }
       System.out.println(suma);  
       }
       
       
    } else{
           System.out.print("Los numeros tienen que ser positivos");
       }
}}
