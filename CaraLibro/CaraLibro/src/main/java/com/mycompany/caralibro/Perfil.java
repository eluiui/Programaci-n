package com.mycompany.caralibro;

import java.util.ArrayList;
import java.util.List;

public class Perfil {

    String nombre, senha, estado = "Ola boas, estou a usar o caralibro";
    List<Perfil> amigos = new ArrayList<Perfil>();
    List<Perfil> solicitudes = new ArrayList<Perfil>();
    List<Publicacion> publicaciones = new ArrayList<Publicacion>();
    List<Mensaje> mensajes = new ArrayList<Mensaje>();
    
//este es el metodo constructor de la clase perfil y guarda
//de cada perfil el nombre y la contraseña de dicho perfil
    public Perfil(String nombre, String senha) {
        this.nombre = nombre;
        this.senha = senha;
    }

//este metodo nos permitira enviar solicitudes de 
//amistad a otro usuario mediante el array anteriormente creado
    public void addSolicitud(Perfil perfil) {
        solicitudes.add(perfil);
    }
//este metodo nos permitira aceptar solicitudes de amistad 
// eliminando dicha solicitud y añadiento a dicho amigo a 
//nuestra lista de amigos
    public void aceptarSolicitud(Perfil perfil) {
        amigos.add(perfil);
        perfil.amigos.add(this);
        solicitudes.remove(perfil);
        System.out.println("Solicitud aceptada :)");
    }
//este metodo nos permitira rechazar solicitudes de amistad 
// eliminando dicha solicitud
    public void rechazarSolicitud(Perfil perfil) {
        solicitudes.remove(perfil);
        System.out.println("Solicitud rechazada :(");
    }
//este metodo nos permitira añadir publicaciones a nuestro perfil
//mediante el array anteriormente creado
    public void addPublicacion(Publicacion publicacion) {

        publicaciones.add(publicacion);
    }
//este metodo nos permitira crear un nuevo mensaje
    public void addMensaje(Mensaje mensaje) {
        mensajes.add(mensaje);
        System.out.println("Mensaje enviado :)");
    }
//este metodo nos permitira eliminar un mensaje que nos hayan enviado
//anteriormente
    public void eliminarMensaje(Mensaje mensaje) {
        mensajes.remove(mensaje);
        System.out.println("Mensaje borrado:)");
    }
}
