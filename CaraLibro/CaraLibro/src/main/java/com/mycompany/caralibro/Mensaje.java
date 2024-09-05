package com.mycompany.caralibro;

import java.time.LocalDateTime;

public class Mensaje {  
    LocalDateTime fecha;    
    String texto;
    boolean leido = false;
    Perfil remitente;

//este es el metodo constructor de la clase mensaje y guarda
//de cada mensaje la fecha en la cual fue creado el texto que contiene 
// y el creador de dicho mensaje
    public Mensaje(String texto, Perfil remitente){
        this.fecha = LocalDateTime.now();
        this.texto = texto;
        this.remitente = remitente;
    }
}
