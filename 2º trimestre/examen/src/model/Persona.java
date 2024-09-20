/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author a22jesusbm
 */
public class Persona implements Serializable{

    String nombre;
    String enderezo;
    String dni;
//este es el metodo constructor de persona

    public Persona(String nombre,String enderezo,String dni) {
        this.nombre = nombre;
        this.enderezo = enderezo;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(String enderezo) {
        this.enderezo = enderezo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
