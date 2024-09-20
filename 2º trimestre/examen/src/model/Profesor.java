/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author a22jesusbm
 */
public class Profesor extends Persona{
    double nomina;

    public Profesor(String nombre, String enderezo, String dni, double nomina) {
        super(nombre, enderezo, dni);
        this.nomina = nomina;
    }

    public double getNomina() {
        return nomina;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }
}
