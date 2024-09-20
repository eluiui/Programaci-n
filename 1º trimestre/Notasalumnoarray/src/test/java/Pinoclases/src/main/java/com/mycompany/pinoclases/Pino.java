package com.mycompany.pinoclases;

public class Pino {

    private int altura;

    public void setAltura(int altura) {
        this.altura = altura;

    }

    public int getAltura() {
        return this.altura;
    }

    public void cortar(int cortar) {
        this.altura = this.altura - cortar;
    }
}
