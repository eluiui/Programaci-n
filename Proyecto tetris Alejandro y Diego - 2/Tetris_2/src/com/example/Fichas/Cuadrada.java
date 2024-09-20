package com.example.Fichas;

import java.awt.Color;


/**
 *
 * @author a20alejandrofs a22diegopc
 */
public class Cuadrada extends Ficha {

    public Cuadrada(Juego juego, Color color) {
        super(juego);
        int xInicialesc0=160;
        int yInicialesc0=40;
        int xInicialesc1=200;
        int yInicialesc1=40;
        int xInicialesc2=160;
        int yInicialesc2=80;
        int xInicialesc3=200;
        int yInicialesc3=80;
        Cuadrado cuadrado0 = new Cuadrado(xInicialesc0, yInicialesc0, color);
        Cuadrado cuadrado1 = new Cuadrado(xInicialesc1, yInicialesc1, color);
        Cuadrado cuadrado2 = new Cuadrado(xInicialesc2, yInicialesc2, color);
        Cuadrado cuadrado3 = new Cuadrado(xInicialesc3, yInicialesc3, color);
        cuadrados.add(cuadrado0);
        cuadrados.add(cuadrado1);
        cuadrados.add(cuadrado2);
        cuadrados.add(cuadrado3);
    }

    public boolean rotar() {
        return true;
    }
}
