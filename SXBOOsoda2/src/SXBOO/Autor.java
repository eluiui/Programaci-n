/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SXBOO;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22jesusbm
 */
public class Autor {

    String nombre;
    ArrayList<Nacionalidad> nacionalidades = new ArrayList<Nacionalidad>();

    public Autor(String nombre, ArrayList<Nacionalidad> nacionalidades) {
        this.nombre = nombre;
        this.nacionalidades = new ArrayList<Nacionalidad>();
        for (Nacionalidad a : nacionalidades) {
            this.nacionalidades.add(new Nacionalidad(a.getNombre(), a.getPais()));

        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nacionalidad> getNacionalidades() {
        return nacionalidades;
    }

    public String toString() {

        String devolver;

        devolver = this.nombre + "\n";
        Iterator<Nacionalidad> percorrer = nacionalidades.iterator();

        while (percorrer.hasNext()) {

            Nacionalidad elemento = percorrer.next();

            devolver += "\t" + elemento.getNombre() + "\n";

        }
        return devolver;
    }

    

}
