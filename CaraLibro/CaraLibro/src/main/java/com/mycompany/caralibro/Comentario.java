package com.mycompany.caralibro;

import java.time.LocalDateTime;

public class Comentario {
    
    LocalDateTime fecha;
    Perfil autor;
    String texto;

    //este es el metodo constructor de la clase comentario guarda
    //de cada comentario la fecha en la cual fue creado el texto que 
    //contiene y el autor de dicho comentario en los atributos de la clase
    public Comentario(String texto, Perfil autor){
        this.fecha = LocalDateTime.now();
        this.texto = texto;     
        this.autor = autor;
    }
}
