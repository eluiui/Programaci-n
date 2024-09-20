/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author a22jesusbm
 */
public class Profesor extends Persoa {

    Double nomina;

    public Profesor(Double nomina, String nome, String enderezo, String dni) {
        super(nome, enderezo, dni);
        this.nomina = nomina;
    }

    public Profesor(String nome, String enderezo, String dni) {
        super(nome, enderezo, dni);

    }

    public String getNome() {
        return nome;
    }

    public String getDni() {
        return dni;
    }

    public Double getNomina() {
        return nomina;
    }

    public void setNomina(Double nomina) {
        this.nomina = nomina;
    }

}
