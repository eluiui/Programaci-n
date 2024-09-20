/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author a22jesusbm
 */
public class Alumno extends Persona {
    String expedienteAcademico;
    public Alumno(String nombre, String enderezo, String dni, String expedienteAcademico) {
        super(nombre, enderezo, dni);
        this.expedienteAcademico=expedienteAcademico;
    }

    public String getExpedienteAcademico() {
        return expedienteAcademico;
    }

    public void setExpedienteAcademico(String expedienteAcademico) {
        this.expedienteAcademico = expedienteAcademico;
    }
    
  
    
}
