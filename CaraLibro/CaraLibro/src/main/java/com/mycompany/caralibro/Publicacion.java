package com.mycompany.caralibro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {

    LocalDateTime fecha;
    String texto;
    Perfil autor;
    List<Comentario> comentarios = new ArrayList<Comentario>();
    List<Perfil> likes = new ArrayList<Perfil>();

//este es el metodo constructor de la clase publicacion y guarda
//de cada publicacion la fecha en la cual subida el texto que contiene 
// y el autor de dicha publicacion
    public Publicacion(Perfil autor, String texto) {
        this.fecha = LocalDateTime.now();
        this.texto = texto;
        this.autor = autor;
    }

    //este metodo nos permitira añadir un like a una publicacion
    //mediante el array anteriormente creado
    public void addLike(Perfil perfil) {
        if (!likes.contains(perfil)) {
            likes.add(perfil);
        }
    }

//este metodo nos permitira añadir comentarios a una publicacion 
//mediante el array anteriormente creado
    public void addComentario(Comentario comentario) {
        comentarios.add(comentario);
    }
}
