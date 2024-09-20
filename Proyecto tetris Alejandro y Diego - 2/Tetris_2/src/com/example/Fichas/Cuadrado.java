    package com.example.Fichas;

import java.awt.Color;
import javax.swing.BorderFactory;

import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author a20alejandrofs a22diegopc
 */
public class Cuadrado {

    public int y, x;
    public Color relleno;
    public JLabel labelCuadrado = new JLabel();

    public Cuadrado(int x, int y, Color relleno) {
        this.y = y;
        this.x = x;
        this.relleno = relleno;
        mover(x, y);
        this.labelCuadrado.setBackground(relleno);
        this.labelCuadrado.setSize(Juego.LADOCUADRADO, Juego.LADOCUADRADO);
        this.labelCuadrado.setOpaque(true);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        this.labelCuadrado.setBorder(border);
    }
//en este metodo cambia la x e y del cuadrado al mover
    public boolean mover(int x, int y) {
        labelCuadrado.setLocation(x, y);
        return true;
    }
//este metodo retorna las coordenadas del cuadrado
    public String getCordenadas() {
        return y + "-" + x;
    }
}
