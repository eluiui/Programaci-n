package com.example.Fichas;


import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a20alejandrofs a22diegopc
 */
public abstract class Ficha {

    Cuadrado cuadrado0, cuadrado1, cuadrado2, cuadrado3;

    public Ficha(Juego juego) {
        this.juego = juego;
    }

    Juego juego;
    public ArrayList<Cuadrado> cuadrados = new ArrayList<>();
    int posicion = 0;
//este metodo suma  el valor de un lado del cuadrado 
//a todos los los cuadrados(a la x) de la ficha para que se mueva hacia la derecha 
    public boolean moverDerecha() {
        Iterator<Cuadrado> iter = cuadrados.iterator();
        while (iter.hasNext()) {
            Cuadrado cuadrado = iter.next();
            cuadrado.x = cuadrado.x + Juego.LADOCUADRADO;
            cuadrado.mover(cuadrado.x, cuadrado.y);
        }
        return true;
    }
//este metodo resta el valor de un lado del cuadrado 
//a todos los los cuadrados(a la x) de la ficha para que se mueva hacia la izaquierda
    public boolean moverIzquierda() {
        Iterator<Cuadrado> iter = cuadrados.iterator();
        while (iter.hasNext()) {
            Cuadrado cuadrado = iter.next();
            cuadrado.x = cuadrado.x - Juego.LADOCUADRADO;
            cuadrado.mover(cuadrado.x, cuadrado.y);
        }
        return true;
    }
//este metodo suma  el valor de un lado del cuadrado 
//a todos los los cuadrados(a la y) de la ficha para que se mueva hacia abajo 
    public boolean moverAbajo() {
        Iterator<Cuadrado> iter = cuadrados.iterator();
        while (iter.hasNext()) {
            Cuadrado cuadrado = iter.next();
            cuadrado.y = cuadrado.y + Juego.LADOCUADRADO;
            cuadrado.mover(cuadrado.x, cuadrado.y);
        }
        return true;
    }
//este metodo recorre el array del suelo y luego el array de la ficha y 
//si choca con el suelo une los cuadrados de la ficha al array del suelo
    public boolean chocaSuelo() {
        for (int i = 0; i < juego.suelo.size(); i++) { 
            for (int i2 = 0; i2 < cuadrados.size(); i2++) {
                if (cuadrados.get(i2).x + juego.LADOCUADRADO == juego.suelo.get(i).x
                        && juego.suelo.get(i).y == cuadrados.get(i2).y) {
                    System.out.println(cuadrados.get(i2).x - juego.LADOCUADRADO + " " + juego.suelo.get(i).x);
                    return true;
                }
            }
        }

        return false;
    }

    public abstract boolean rotar();
}
