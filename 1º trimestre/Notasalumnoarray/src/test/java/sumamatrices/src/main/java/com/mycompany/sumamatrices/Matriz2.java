package com.mycompany.sumamatrices;

import java.util.Scanner;

public class Matriz2 {
    private int[][] matriz = new int[3][3];

    public Matriz2(){
        datos();
    }

    public Matriz2(int[][] matriz){
        this.matriz = matriz;
    }

    private void datos(){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < this.matriz.length; i++){
            for(int i2 = 0; i2 < this.matriz[i].length; i2++){
                System.out.print("Valor de fila "+(i+1)+" columna "+(i2+1)+": ");
                this.matriz [i] [i2] = scan.nextInt();
            }
            System.out.print("\n");
        }
    }

    public Matriz2 sumar(Matriz2 m){
        int[][] suma = new int[3][3];
        for(int i = 0; i < this.matriz.length; i++){
            for(int i2 = 0; i2 < this.matriz[i].length; i2++){
                suma[i][i2] = this.matriz [i][i2] + m.matriz[i][i2];
            }
        }
        return new Matriz2(suma);
    }

    public void mostrarMatriz(Matriz2 m){
        for(int i = 0; i < m.matriz.length; i++){
            for(int i2 = 0; i2 < m.matriz[i].length; i2++){
                System.out.print(m.matriz[i][i2]+" ");
            }
            System.out.print("\n");
        }
    }

}
