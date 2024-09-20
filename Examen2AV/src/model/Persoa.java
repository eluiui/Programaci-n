/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author a22jesusbm
 */
public class Persoa {
    
    String nome;
    String enderezo;
    String dni;

    public Persoa(String nome, String enderezo, String dni) {
        this.nome = nome;
        this.enderezo = enderezo;
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public String getEnderezo() {
        return enderezo;
    }

    public String getDni() {
        return dni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnderezo(String enderezo) {
        this.enderezo = enderezo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
   
}
