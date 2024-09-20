package com.mycompany.metodomediana;

import java.util.Arrays;
import java.util.Scanner;

public class Numeros {

    private int Valores;

    public int mediana() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cantidad de valores: ");
        Valores = scan.nextInt();

        int[] numeros = new int[Valores];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + i +": ");
            numeros[i] = new Scanner(System.in).nextInt();
        }
        Arrays.sort(numeros);

        return numeros[numeros.length / 2];
    }
}
