package com.example.Fichas;

import com.example.VentanaPrincipal;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a20alejandrofs a22diegopc
 */
public class Juego {

    Timer timer;
    public static int LADOCUADRADO = 40, XMAX = 400, YMAX = 800;
    boolean pausa;
    int numLineas;
    private TimerTask timerTask;
    private Ficha fichaActual;
    private JPanel panelJuego;
    private VentanaPrincipal ventanaPrincipal;
    public ArrayList<Cuadrado> suelo = new ArrayList<>();

   
    public Juego(JPanel panelJuego, VentanaPrincipal ventanaPrincipal) {
        this.panelJuego = panelJuego;
        this.ventanaPrincipal = ventanaPrincipal;
     
        generarSuelo();
        generarFicha();
        iniciarTimer();
    }

   
//
    public void pausa() {
        try {
            timer.wait();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
//en este metodo borraremos el panel del juego y posteriormente actualizaremos
    //dicho panel
    public void limpiarPanel() {
        panelJuego.removeAll();
        actualizarPanel();
    }
//en este metodo si la ficha existe y nos deja moverla ademas de que el timer no 
//no este pausado moveremos la ficha y actualizareos el panel
    public void moverFichaDerecha() {
        if (fichaActual != null && allowMoverDerecha()) {
            fichaActual.moverDerecha();
            actualizarPanel();
        }
    }

    public Cuadrado getCuadradoDerecha() {
        Cuadrado cuadrado = fichaActual.cuadrados.get(0);
        for (int i = 0; i < fichaActual.cuadrados.size(); i++) {
            if (fichaActual.cuadrados.get(i).x > cuadrado.x) {
                cuadrado = fichaActual.cuadrados.get(i);
            }
        }
        return cuadrado;
    }

    public Cuadrado getCuadradoIzquierda() {
        Cuadrado cuadrado = fichaActual.cuadrados.get(0);
        for (int i = 0; i < fichaActual.cuadrados.size(); i++) {
            if (fichaActual.cuadrados.get(i).x < cuadrado.x) {
                cuadrado = fichaActual.cuadrados.get(i);
            }
        }
        return cuadrado;
    }

    public void moverFichaIzquierda() {
        if (fichaActual != null && allowMoverIzquierda()) {
            fichaActual.moverIzquierda();
            actualizarPanel();
        }
    }

    private boolean allowMoverDerecha() {
        Cuadrado cuadradoDerecha = getCuadradoDerecha();
        if (cuadradoDerecha.x + LADOCUADRADO == XMAX) {
            return false;
        }

        for (int i = 0; i < fichaActual.cuadrados.size(); i++) {
            for (int i2 = 0; i2 < suelo.size(); i2++) {
                if (fichaActual.cuadrados.get(i).x + LADOCUADRADO == suelo.get(i2).x && fichaActual.cuadrados.get(i).y == suelo.get(i2).y) {
                    return false;
                }

            }
        }
        return true;
    }

    private boolean allowMoverIzquierda() {
        Cuadrado cuadradoIzquierda = getCuadradoIzquierda();
        if (cuadradoIzquierda.x == 0) {
            return false;
        }

        for (int i = 0; i < fichaActual.cuadrados.size(); i++) {
            for (int i2 = 0; i2 < suelo.size(); i2++) {
                if (fichaActual.cuadrados.get(i).x - LADOCUADRADO == suelo.get(i2).x && fichaActual.cuadrados.get(i).y == suelo.get(i2).y) {
                    return false;
                }

            }
        }
        return true;
    }

    public void rotarFicha() {
        fichaActual.rotar();
        actualizarPanel();
    }

    public void moverFichaAbajo() {
        boolean choca = chocaFichaSuelo();
        if (fichaActual != null && !choca) {
            fichaActual.moverAbajo();
            actualizarPanel();
        } else if (choca) {
            addFichaSuelo();
        }
    }

    private Color generarColorRandom() {
        int color = (int) (Math.random() * 6 + 1);
        switch (color) {
            case 1 -> {
                return Color.GREEN;
            }
            case 2 -> {
                return Color.PINK;
            }
            case 3 -> {
                return Color.ORANGE;
            }
            case 4 -> {
                return Color.GRAY;
            }
            case 5 -> {
                return Color.BLUE;
            }
        }
        return Color.CYAN;
    }

    private Ficha generarTipoFicha() {
        int tipoFicha = (int) (Math.random() * 5 + 1);
        Ficha ficha = new Cuadrada(this, generarColorRandom());
        switch (tipoFicha) {
            case 1: {
                ficha = new L(this, generarColorRandom());
                break;
            }
            case 2: {
                ficha = new T(this, generarColorRandom());
                break;
            }
            case 3: {
                ficha = new Barra(this, generarColorRandom());
                break;
            }
            case 4: {
                ficha = new LInvertida(this, generarColorRandom());
                break;
            }
        }
        return ficha;
    }

    public void generarFicha() {
        fichaActual = generarTipoFicha();
        Iterator<Cuadrado> iter = fichaActual.cuadrados.iterator();
        while (iter.hasNext()) {
            Cuadrado cuadrado = iter.next();
            panelJuego.add(cuadrado.labelCuadrado);
        }
        actualizarPanel();
        if (chocaFichaSuelo()){
            ventanaPrincipal.mostrarPerder();
        }
    }

    private void iniciarTimer() {
        timer = new Timer("Timer");
        timerTask = new TimerTask() {
            public void run() {
                moverFichaAbajo();
                actualizarPanel();
            }
        };
        timer.scheduleAtFixedRate(timerTask, 1000L, 1000L);
    }

    private void actualizarPanel() {
        panelJuego.repaint();
    }

    private void generarSuelo() {
        suelo.clear();
        for (int i = 0; i < XMAX; i = i + LADOCUADRADO) {
            Cuadrado cuadrado = new Cuadrado(i, YMAX, Color.lightGray);
            suelo.add(cuadrado);
            panelJuego.add(cuadrado.labelCuadrado);
        }

    }

    public void addFichaSuelo() {
        Iterator<Cuadrado> iterFicha = fichaActual.cuadrados.iterator();

        while (iterFicha.hasNext()) {
            Cuadrado cuadrado = iterFicha.next();
            panelJuego.remove(cuadrado.labelCuadrado);

            Cuadrado nuevoCuadrado = new Cuadrado(cuadrado.x, cuadrado.y, Color.magenta);
            suelo.add(nuevoCuadrado);
            panelJuego.add(nuevoCuadrado.labelCuadrado);
        }
        actualizarPanel();
        borrarLineaCompleta();
        generarFicha();

    }

    public void borrarLineaCompleta() {
        List<Integer> lineasCompletas = new ArrayList<>();
        
        for (int i = 0; i < suelo.size(); i++){
            int numeroCuadrados = 0;
            for(int i2 = 0; i2 < suelo.size(); i2++){
                if (suelo.get(i).y == suelo.get(i2).y){
                    numeroCuadrados++;
                }
                if (numeroCuadrados == 10 && !lineasCompletas.contains(suelo.get(i).y)){
                    lineasCompletas.add(suelo.get(i).y);
                }
            }
        }
        
        
        for(int i = 0; i < lineasCompletas.size(); i++){
            if (lineasCompletas.get(i) != YMAX){
                borrarLinea(lineasCompletas.get(i));
            }
        }
    }

    private void borrarLinea(int y) {
        int contador = 0, contador2 = 0;
        List tmp = new ArrayList<>();
        Iterator<Cuadrado> iterSuelo = suelo.iterator();
        while(iterSuelo.hasNext()){
            Cuadrado cuadrado = iterSuelo.next();
            if (cuadrado.y == y){
                tmp.add(cuadrado);
            }
            
        }
        
        Iterator<Cuadrado> iterTmp = tmp.iterator();
        while(iterTmp.hasNext()){
            Cuadrado cuadrado = iterTmp.next();
            suelo.remove(cuadrado);
            panelJuego.remove(cuadrado.labelCuadrado);
        }
        bajarTodo(y);
        actualizarPanel();
    }

    private void bajarTodo(int y) {
        for (int i = 0; i < suelo.size(); i++) {
            if (suelo.get(i).y < y) {
                suelo.get(i).y = suelo.get(i).y + LADOCUADRADO;
                suelo.get(i).mover(suelo.get(i).x, suelo.get(i).y);
            }
        }
        borrarLineaCompleta();
    }

    public boolean chocaFichaSuelo() {
        for (int i = 0; i < suelo.size(); i++) {
            for (int i2 = 0; i2 < fichaActual.cuadrados.size(); i2++) {
                if (suelo.get(i).x == fichaActual.cuadrados.get(i2).x
                        && suelo.get(i).y == fichaActual.cuadrados.get(i2).y + LADOCUADRADO) {
                    return true;
                }
            }
        }

        return false;
    }

}
