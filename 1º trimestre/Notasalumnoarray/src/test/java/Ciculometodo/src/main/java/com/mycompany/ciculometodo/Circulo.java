package com.mycompany.ciculometodo;

public class Circulo {

    // atributos
    private int radio;

    // metodos
    public Circulo(int radio){
        this.radio = radio;

    public int getRadio() {
        return this.radio;
    }

    public void agrandar() {
        radio = radio * 2;
    }
}
