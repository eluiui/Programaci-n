












package com.mycompany.clasenota;

import java.util.ArrayList;
import java.util.Scanner;

public class Nota {

    ArrayList<Integer> nota = new ArrayList<>();

    public Nota() {
        getNotas();
    }

    private void getNotas() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("nota " + i + ":");
            nota.add(scan.nextInt());
        }
    }

    public float calcularMedia() {
        float media = 0;
        for (int i = 0; i < 10; i++) {
            media = media + nota.get(i);
        }
        return media / 10;
    }
}
