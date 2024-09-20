/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.primosmenores;

/**
 *
 * @author a22jesusbm
 */
public class Primosmenores {

    public static void main(String[] args) {
        for( int y=1,num=10;y<=num;y++){
            boolean primo=true;
            for(int y2=2;y2<y&&primo;y2++){
                if (y%y2==0){
                    primo=false;
                }
            }
            if (primo){
                 System.out.print(y+" ");
        }   
            }
    }
}
