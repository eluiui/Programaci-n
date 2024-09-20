/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taroth;

import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Taroth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año;
        int mes;
        int dia;
        int temp;
        int resul=0;
        boolean correcto = true;
        
        System.out.println("Año");
        Scanner inNum1 = new Scanner(System.in);
        año = inNum1.nextInt();
        
        System.out.println("Mes");
        Scanner inNum2 = new Scanner(System.in);
        mes = inNum2.nextInt();
        
        System.out.println("Dia");
        Scanner inNum3 = new Scanner(System.in);
        dia = inNum3.nextInt();
        
        boolean bis = año%4==0;
        
        if (mes>12||dia>31)
            correcto = false;
        switch (mes){
            case 4,6,9,11:
            if (dia>30)
                correcto = false;
            break;
            case 2:
                if (bis&&dia>29||!bis&&dia>28)
                correcto = false;
            break;
        }
        if (!correcto)
            System.out.println("Fecha incorrecta!");
        else{
            temp = año+mes+dia;
            while (temp>0){
                resul = (temp%10)+resul;
                temp = temp/10;
                if (temp==0&&resul>=10){
                    temp = resul;
                    resul = 0;
                }
            }
            System.out.println("El valor del tarot para "+año+"/"+mes+"/"+dia+" es "+resul);
        } 
    }
}