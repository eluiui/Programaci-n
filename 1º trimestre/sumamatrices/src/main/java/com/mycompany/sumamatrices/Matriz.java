package com.mycompany.sumamatrices;

import java.util.Scanner;

public class Matriz {

    private int[][] matriz = new int[3][3];

    public Matriz() {
        pedirDatos();
    }
    public  Matriz (boolean porDefecto){
        if(porDefecto){
            datos();
        } else{
            pedirDatos();
        }
    }
            
            
    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    private void datos() {
        for (int y = 0; y < this.matriz.length; y++) {
            for (int y2 = 0; y2 < this.matriz[y].length; y2++) {
                this.matriz[y][y2] =y+y2;
            }
        }
    }   

    private void pedirDatos() {
        Scanner scan = new Scanner(System.in);

        for (int y = 0; y < this.matriz.length; y++) {
            for (int y2 = 0; y2 < this.matriz[y].length; y2++) {
                System.out.print((y + 1) + "º" + "Valor de fila " + (y2 + 1) + "ª" + " columna: ");
                this.matriz[y][y2] = scan.nextInt();
            }
            System.out.print("\n");
        }
    }

    public Matriz sumar(Matriz m) {
        int[][] suma = new int[3][3];
        for (int y = 0; y < this.matriz.length; y++) {
            for (int y2 = 0; y2 < this.matriz[y].length; y2++) {
                suma[y][y2] = this.matriz[y][y2] + m.matriz[y][y2];
            }
        }
        return new Matriz(suma);
    }
       public Matriz restar(Matriz m) {
        int[][] resta = new int[3][3];
        for (int y = 0; y < this.matriz.length; y++) {
            for (int y2 = 0; y2 < this.matriz[y].length; y2++) {
                resta[y][y2] = this.matriz[y][y2] - m.matriz[y][y2];
            }
        }
        return new Matriz(resta);
    }

    public void mostrarMatriz() {
        for (int y = 0; y < this.matriz.length; y++) {
            for (int y2 = 0; y2 < this.matriz[y].length; y2++) {
                System.out.print(this.matriz[y][y2] + " ");
            }
            System.out.print("\n");
        }
    }
}
