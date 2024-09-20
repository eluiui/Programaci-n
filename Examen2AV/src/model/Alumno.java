/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author a22jesusbm
 */
public class Alumno extends Persoa {

    String expedienteAcademico;

    public Alumno(String expedienteAcademico, String nome, String enderezo, String dni) {
        super(nome, enderezo, dni);
        this.expedienteAcademico = expedienteAcademico;
    }

    public Alumno(String nome, String enderezo, String dni) {
        super(nome, enderezo, dni);

    }

    public String getExpedienteAcademico() {
        return expedienteAcademico;
    }

    public void setExpedienteAcademico(String expedienteAcademico) {
        this.expedienteAcademico = expedienteAcademico;
    }

}
