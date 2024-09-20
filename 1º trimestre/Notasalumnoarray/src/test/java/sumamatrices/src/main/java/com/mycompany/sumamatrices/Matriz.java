package com.mycompany.sumamatrices;

import java.util.Scanner;

public class Matriz {
    private int[][] matriz = new int[3][3];

    public Matriz(){
        this.matriz = datos();
    }

    private int[][] datos(){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < this.matriz.length; i++){
            for(int i2 = 0; i2 < this.matriz[i].length; i2++){
                System.out.print("Valor de fila "+(i+1)+" columna "+(i2+1)+": ");
                this.matriz [i] [i2] = scan.nextInt();
            }
            System.out.print("\n");
        }
        return this.matriz;
    }

    public int[][] sumar(){
        int[][] matriz2 = datos();
        int[][] suma = new int[3][3];

        for(int i = 0; i < this.matriz.length; i++){
            for(int i2 = 0; i2 < this.matriz[i].length; i2++){
                suma[i][i2] = this.matriz [i][i2] + matriz2[i][i2];
            }
        }
        return suma;
    }

    public void mostrarMatriz(int[][] m){
        System.out.println("Resultado suma: ");

        for(int i = 0; i < m.length; i++){
            for(int i2 = 0; i2 < m[i].length; i2++){
                System.out.print(m[i][i2]+" ");
            }
            System.out.print("\n");
        }
    }
}
