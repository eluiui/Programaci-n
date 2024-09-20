package com.example.Fichas;

import static com.example.Fichas.Juego.LADOCUADRADO;
import java.awt.Color;

/**
 *
 * @author a20alejandrofs a22diegopc
 */
public class Barra extends Ficha {
    private static final int YINCIALC3 = 160;
    private static final int XINICIALC3 = 160;
    private static final int YINICIALC2 = 120;
    private static final int XINICIALC2 = 160;
    private static final int XINICIALC1 = 160;
    private static final int YINICIALC1 = 80;
    private static final int YINICIALC0 = 40;
    private static final int XINICIALC0 = 160;

    public Barra(Juego juego, Color color) {
        super(juego);
        cuadrado0 = new Cuadrado(XINICIALC0, YINICIALC0, color);
        cuadrado1 = new Cuadrado(XINICIALC1, YINICIALC1, color);
        cuadrado2 = new Cuadrado(XINICIALC2, YINICIALC2, color);
        cuadrado3 = new Cuadrado(XINICIALC3, YINCIALC3, color);

        cuadrados.add(cuadrado0);
        cuadrados.add(cuadrado1);
        cuadrados.add(cuadrado2);
        cuadrados.add(cuadrado3);
    }

    private boolean allowRotar() {
        for (int i = 0; i < juego.suelo.size(); i++) {
            if ((cuadrado1.x == juego.suelo.get(i).x + LADOCUADRADO
                    || cuadrado1.x == juego.suelo.get(i).x - LADOCUADRADO
                    || cuadrado1.x == juego.suelo.get(i).x - LADOCUADRADO * 2)
                    && juego.suelo.get(i).y == cuadrado1.y) {
                return false;
            }
        }
        return true;
    }

    private boolean allowRotar0() {
        for (int i = 0; i < juego.suelo.size(); i++) {
            if ((cuadrado1.y == juego.suelo.get(i).y - LADOCUADRADO
                    || cuadrado1.y == juego.suelo.get(i).y - LADOCUADRADO * 2)
                    && cuadrado1.x == juego.suelo.get(i).x) {
                return false;
            }
        }
        return true;
    }
//estos metodos llamados rotacion0 rotacion1 
//mueve los cuadrados de la ficha para que esta rote para ello 
//recibe las nuevas coordenadas del cuadrado mediante sumas y restas
//ademas cada metodo rotacion se usa para una posicion diferente y devuelve
//la siguiente posicion
    private void rotacion0() {
        cuadrado0.y = cuadrado0.y + Juego.LADOCUADRADO;
        cuadrado0.x = cuadrado0.x - Juego.LADOCUADRADO;
        cuadrado0.mover(cuadrado0.x, cuadrado0.y);

        cuadrado3.y = cuadrado3.y - Juego.LADOCUADRADO * 2;
        cuadrado3.x = cuadrado3.x + Juego.LADOCUADRADO * 2;
        cuadrado3.mover(cuadrado3.x, cuadrado3.y);

        cuadrado2.y = cuadrado2.y - Juego.LADOCUADRADO;
        cuadrado2.x = cuadrado2.x + Juego.LADOCUADRADO;
        cuadrado2.mover(cuadrado2.x, cuadrado2.y);
        posicion = 1;
    }

    private void rotacion1() {
        cuadrado0.y = cuadrado0.y - Juego.LADOCUADRADO;
        cuadrado0.x = cuadrado0.x + Juego.LADOCUADRADO;
        cuadrado0.mover(cuadrado0.x, cuadrado0.y);

        cuadrado3.y = cuadrado3.y + Juego.LADOCUADRADO * 2;
        cuadrado3.x = cuadrado3.x - Juego.LADOCUADRADO * 2;
        cuadrado3.mover(cuadrado3.x, cuadrado3.y);

        cuadrado2.y = cuadrado2.y + Juego.LADOCUADRADO;
        cuadrado2.x = cuadrado2.x - Juego.LADOCUADRADO;
        cuadrado2.mover(cuadrado2.x, cuadrado2.y);
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
                if (allowRotar() && cuadrado1.x > 0 && cuadrado1.x < juego.XMAX - (Juego.LADOCUADRADO * 2)) {
                    rotacion0();
                }
            }
            case 1 -> {
                if (allowRotar0()) {
                    rotacion1();
                }
            }
        }
        return true;
    }

}
