package com.mycompany.metodomediana;

import java.util.Arrays;
import java.util.Scanner;

public class Estadistica {

    private int Valores;

    public int mediana() {

        int[] numeros = new int[Valores];

        boolean error = true;
        while (error) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Cantidad de valores: ");
            Valores = scan.nextInt();
            
            if (Valores % 2 != 0) {
                error = false;
            } else {
                System.out.println("No se pueden introducir numeros pares\n");
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + i + ": ");
            numeros[i] = new Scanner(System.in).nextInt();
        }

        Arrays.sort(numeros);
        return numeros[numeros.length / 2];

    }
}
