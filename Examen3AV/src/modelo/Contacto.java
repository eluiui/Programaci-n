/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author a22jesusbm
 */
public class Contacto {
    
    String nome;
    String telefono;
    boolean particular;

    public Contacto(String nome, String telefono, boolean particular) {
        this.nome = nome;
        this.telefono = telefono;
        this.particular = particular;
    }

    public Contacto() {
    }

    public String getNome() {
        return nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public Boolean getParticular() {
        return particular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setParticular(Boolean particular) {
        this.particular = particular;
    }
    
    
}
