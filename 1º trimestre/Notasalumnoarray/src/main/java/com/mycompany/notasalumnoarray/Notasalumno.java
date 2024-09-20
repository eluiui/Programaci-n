package com.mycompany.notasalumnoarray;

import java.util.Scanner;

public class Notasalumno {
    Scanner scan = new Scanner(System.in);
    private int[] notas = new int[10];
    private String[] nombres =new String[10];

    public Notasalumno() {
        nota();
    }

    private void nota() {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nombre del alumn@: ");
            nombres[i] = new Scanner(System.in).nextLine();
            System.out.print("Nota del alumn@: ");
            notas[i] = new Scanner(System.in).nextInt();
        }

    }
    public String mayor() {
        int mayor = 0;
        int notaMayor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
                mayor = i;
            }
        }
        return nombres[mayor];
    }

    public String menor() {
        int menor = 0;
        int notaMenor = 10;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
                menor = i;
            }
        }
        return nombres[menor];
    }

}
