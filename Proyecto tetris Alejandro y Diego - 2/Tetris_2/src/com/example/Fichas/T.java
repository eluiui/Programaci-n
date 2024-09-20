package com.example.Fichas;

import static com.example.Fichas.Juego.LADOCUADRADO;
import java.awt.Color;

/**
 *
 * @author a20alejandrofs a22diegopc
 */
public class T extends Ficha {

    public T(Juego juego, Color color) {
        super(juego);
        int xInicialesc0 = 200;
        int yInicialesc0 = 40;
        int xInicialesc1 = 200;
        int yInicialesc1 = 80;
        int xInicialesc2 = 200;
        int yInicialesc2 = 120;
        int xInicialesc3 = 240;
        int yInicialesc3 = 80;
        cuadrado0 = new Cuadrado(xInicialesc0, yInicialesc0, color);
        cuadrado1 = new Cuadrado(xInicialesc1, yInicialesc1, color);
        cuadrado2 = new Cuadrado(xInicialesc2, yInicialesc2, color);
        cuadrado3 = new Cuadrado(xInicialesc3, yInicialesc3, color);

        cuadrados.add(cuadrado0);
        cuadrados.add(cuadrado1);
        cuadrados.add(cuadrado2);
        cuadrados.add(cuadrado3);
    }

    private boolean allowRotar() {
        for (int i = 0; i < juego.suelo.size(); i++) {
            if ((cuadrado1.x == juego.suelo.get(i).x + LADOCUADRADO
                    || cuadrado1.x == juego.suelo.get(i).x - LADOCUADRADO
                    || cuadrado1.x == juego.suelo.get(i).x - LADOCUADRADO)
                    && juego.suelo.get(i).y == cuadrado1.y) {
                return false;
            }
        }
        return true;
    }

    private boolean allowRotar0() {
        for (int i = 0; i < juego.suelo.size(); i++) {
            if ((cuadrado1.x == juego.suelo.get(i).x)
                    && juego.suelo.get(i).y == cuadrado1.y + LADOCUADRADO) {
                return false;
            }
        }
        return true;
    }
//estos metodos llamados rotacion0 rotacion1 rotacion2 rotacion3 
//mueve los cuadrados de la ficha para que esta rote para ello 
//recibe las nuevas coordenadas del cuadrado mediante sumas y restas
//ademas cada metodo rotacion se usa para una posicion diferente y devuelve
//la siguiente posicion
    private void rotacion0() {
        cuadrado0.y = cuadrado0.y + Juego.LADOCUADRADO;
        cuadrado0.x = cuadrado0.x - Juego.LADOCUADRADO;
        cuadrado0.mover(cuadrado0.x, cuadrado0.y);

        cuadrado2.y = cuadrado2.y - Juego.LADOCUADRADO;
        cuadrado2.x = cuadrado2.x + Juego.LADOCUADRADO;
        cuadrado2.mover(cuadrado2.x, cuadrado2.y);

        cuadrado3.y = cuadrado3.y + Juego.LADOCUADRADO;
        cuadrado3.x = cuadrado3.x - Juego.LADOCUADRADO;
        cuadrado3.mover(cuadrado3.x, cuadrado3.y);
        posicion = 1;

    }
 
     private void rotacion1() {
        cuadrado0.y = cuadrado0.y - Juego.LADOCUADRADO;
        cuadrado0.x = cuadrado0.x + Juego.LADOCUADRADO;
        cuadrado0.mover(cuadrado0.x, cuadrado0.y);

        cuadrado2.y = cuadrado2.y + Juego.LADOCUADRADO;
        cuadrado2.x = cuadrado2.x - Juego.LADOCUADRADO;
        cuadrado2.mover(cuadrado2.x, cuadrado2.y);

        cuadrado3.y = cuadrado3.y - Juego.LADOCUADRADO;
        cuadrado3.x = cuadrado3.x - Juego.LADOCUADRADO;
        cuadrado3.mover(cuadrado3.x, cuadrado3.y);
        posicion = 2;
    }

     private void rotacion2() {
        cuadrado0.y = cuadrado0.y + Juego.LADOCUADRADO;
        cuadrado0.x = cuadrado0.x - Juego.LADOCUADRADO;
        cuadrado0.mover(cuadrado0.x, cuadrado0.y);

        cuadrado2.y = cuadrado2.y - Juego.LADOCUADRADO;
        cuadrado2.x = cuadrado2.x + Juego.LADOCUADRADO;
        cuadrado2.mover(cuadrado2.x, cuadrado2.y);

        cuadrado3.y = cuadrado3.y - Juego.LADOCUADRADO;
        cuadrado3.x = cuadrado3.x + Juego.LADOCUADRADO;
        cuadrado3.mover(cuadrado3.x, cuadrado3.y);
        posicion = 3;
    }

     private void rotacion3() {
        cuadrado0.y = cuadrado0.y - Juego.LADOCUADRADO;
        cuadrado0.x = cuadrado0.x + Juego.LADOCUADRADO;
        cuadrado0.mover(cuadrado0.x, cuadrado0.y);

        cuadrado2.y = cuadrado2.y + Juego.LADOCUADRADO;
        cuadrado2.x = cuadrado2.x - Juego.LADOCUADRADO;
        cuadrado2.mover(cuadrado2.x, cuadrado2.y);

        cuadrado3.y = cuadrado3.y + Juego.LADOCUADRADO;
        cuadrado3.x = cuadrado3.x + Juego.LADOCUADRADO;
        cuadrado3.mover(cuadrado3.x, cuadrado3.y);
        posicion = 0;
    }
//el metodo rotar() rota la ficha para ello comprueba en cada caso 
// si puede rotar con repecto al suelo o los limites del panel con respecto
//a su posicion para elllo utuliza los metodos allowRotar  
//ademas de sus cordenadas con respecto a los limites
//luego rota la ficha utilizando los metodos rotacion dependiendo de la posicion   
    @Override
    public boolean rotar() {
        switch (posicion) {
            case 0 -> {
                if (cuadrado1.x > 0 && allowRotar()) {
                    rotacion0();
                }
            }
            case 1 -> {
                if (allowRotar()) {
                    rotacion1();
                }
            }
            case 2 -> {
                if (cuadrado1.x < juego.XMAX - Juego.LADOCUADRADO && allowRotar()) {
                    rotacion2();
                }
            }
            case 3 -> {
                if (allowRotar0()) {
                    rotacion3();
                }
            }
        }
        return true;
    }
}
