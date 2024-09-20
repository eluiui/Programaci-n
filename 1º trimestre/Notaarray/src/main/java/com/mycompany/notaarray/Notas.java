package com.mycompany.notaarray;

import java.util.Scanner;

public class Notas {
    Scanner scan = new Scanner(System.in);
    private int[] notas = new int[10];
    private int media = 0;

    public Notas(){
        setNotas();
    }
    private void setNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Pon tu nota: ");
            notas[i] = scan.nextInt();
        }

    }

    public String calcularMedia() {
        for (int i = 0; i < notas.length; i++){
            this.media = this.media+notas[i];
        }
        return "Esta es tu media: "+String.valueOf(this.media/10);
    }
}
