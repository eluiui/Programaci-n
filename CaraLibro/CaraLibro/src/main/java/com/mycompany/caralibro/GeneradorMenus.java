package com.mycompany.caralibro;

import java.util.Scanner;

public class GeneradorMenus {

    private Perfil perfilActual;

    // Esto lo que hace es mostrar el menu inicial 
    // en el cual puedes acceder a crearPerfil o iniciarSesion 
    public void mostrarMenuInicial() {
        System.out.println("1- Crear perfil");
        System.out.println("2- Iniciar sesion");
        System.out.println("Tu respuesta: ");
        int opcion = new Scanner(System.in).nextInt();
        if (opcion == 1) {
            crearPerfil();
        } else if (opcion == 2) {
            iniciarSesion();
        } else {
            System.out.println("Escribe una opcion valida");
            mostrarMenuInicial();
        }
    }

    // Esto lo que hace es mostrar el menu principal
    // que contiene el estado y la biografia
    //crea un menu el cual nos darab una serie de 
    //opciones y dependiendo de la opcion que elijamos 
    //llamara a un metodo o a otro
    private void mostrarMenuPrincipal() {
        System.out.println("1- Estado actual");
            System.out.println("2- Tu biografia");
            System.out.println("3- Solicitudes de amistad");
            System.out.println("4- Amigos");
            System.out.println("5- Mensajes");
            System.out.println("6- Cerrar sesion");
            System.out.println("Tu respuesta: ");
            int opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1: {
                    mostrarEstado();
                    break;
                }
                case 2: {
                    mostrarBiografia(perfilActual);
                    break;
                }
                case 3: {
                    mostrarSolicitudes();
                    break;
                }
                case 4: {
                    mostrarAmigos();
                    break;
                }
                case 5: {
                    mostrarMensajes();
                    break;
                }
                case 6: {
                    cerrarSesion();
                    break;
                }
                default: {
                    System.out.println("Escribe una opcion valida");
                    mostrarMenuPrincipal();
                    break;
                }
            }
    }

    // Esto lo que hace es mostrar el estado
    // ademas deja cambiar el estado y volver al menu principal
    // o volver al menu principal sin cambiar el estado
    private void mostrarEstado() {
        System.out.println(perfilActual.estado);
        System.out.println("1- Cambiar estado");
        System.out.println("2- Volver");
        int opcion = new Scanner(System.in).nextInt();
        if (opcion == 1) {
            cambiarEstado();
        } else if (opcion == 2) {
            mostrarMenuPrincipal();
        } else {
            System.out.println("Escribe una opcion valida");
            mostrarEstado();
        }
        
    }

    // Este metodo muestra la biografia la cual contiene las publicaciones relacionadas al
    // perfil
    // con sus comentarios
    // ordenadas por la fecha en la que fueron publicadas de forma que
    // la ultima publicacion subida sera la que salga primera esto lo hacemos
    // recorriendo el array en sentido contrario

    //tambien podremos crear una nueva publicacion y nos pedira ver una publicacion o volver atras
    private void mostrarBiografia(Perfil perfil) {
        System.out.println("Biografia de "+perfil.nombre+": ");
        if (perfil.publicaciones.size() == 0){
            System.out.println("No hay biografia :(");
        }
        for (int i = (perfil.publicaciones.size()-1); i >= 0; i--) {
            System.out.print(i + "- ");
            if (perfil.publicaciones.get(i).autor.equals(perfilActual)) {
                System.out.println("Tu escribiste: ");
            } else {
                System.out.println(perfil.publicaciones.get(i).autor + " escribio: ");
            }
            System.out.println("\nFecha: " + perfil.publicaciones.get(i).fecha.getDayOfMonth()+"/"+perfil.publicaciones.get(i).fecha.getMonth()+"/"+perfil.publicaciones.get(i).fecha.getYear());
            System.out.println(perfil.publicaciones.get(i).texto);
            System.out.println("\tComentarios: ");
            for (int i2 = (perfil.publicaciones.get(i).comentarios.size()-1); i2 >= 0 && perfil.publicaciones.get(i).comentarios.size() != 0; i2--) {
                mostrarComentario(perfil.publicaciones.get(i).comentarios.get(i2));
            }
            mostrarLikes(perfil.publicaciones.get(i));
        }

        System.out.println((perfil.publicaciones.size() + 1) + "- Crear publicacion");
        System.out.println((perfil.publicaciones.size() + 2) + "- Volver");
        System.out.println("Tu respuesta: ");
        int opcion = new Scanner(System.in).nextInt();
        if (opcion < perfil.publicaciones.size()) {
            mostrarPublicacion(perfil.publicaciones.get(opcion), perfil);
        } else if(opcion == (perfil.publicaciones.size() + 1)){
            crearPublicacion(perfil);
        } else if (opcion == (perfil.publicaciones.size() + 2)) {
            mostrarMenuPrincipal();
        } else {
            System.out.println("Escribe una opcion valida");
            mostrarBiografia(perfil);
        }
    }

    // este metodo nos permitira visualizar las publicacones
    // en orden de fecha de publicacion y este mismo nos
    // muestra los likes que tiene y los comentarios que hayan
    // publicado otras personas dentro de nuestra publicacion
    // asi como mostrarnos un menu en el cual nos dan las opciones
    // de(en una publicacion ajena)escribir un comentario dasle un like
    // responder a algo entre otras
    private void mostrarPublicacion(Publicacion publicacion, Perfil perfilBiografia) {
        if (publicacion.autor.equals(perfilActual)) {
            System.out.println("Tu escribiste: ");
        } else {
            System.out.println(publicacion.autor + " escribio: ");
        }
        System.out.println("\nFecha: " + publicacion.fecha.getDayOfMonth()+"/"+publicacion.fecha.getMonth()+"/"+publicacion.fecha.getYear());
        System.out.println(publicacion.texto);
        System.out.println("\tComentarios: ");
        for (int i2 = (publicacion.comentarios.size()-1); i2 >= 0 && publicacion.comentarios.size() != 0; i2--) {
            mostrarComentario(publicacion.comentarios.get(i2));
        }
        mostrarLikes(publicacion);

        System.out.println("1- Escribir comentario");
        System.out.println("2- Like");
        System.out.println("3- Volver");
        System.out.println("Tu respuesta: ");
        int opcion = new Scanner(System.in).nextInt();
        switch (opcion) {
            case 1: {
                escribirComentario(publicacion, perfilActual);
                mostrarPublicacion(publicacion, perfilBiografia);
                break;
            }
            case 2: {
                like(publicacion);
                mostrarPublicacion(publicacion, perfilBiografia);
                break;
            }
            case 3: {
                mostrarBiografia(perfilBiografia);
                break;
            }
            default: {
                System.out.println("Escribe una opcion valida");
                mostrarPublicacion(publicacion, perfilBiografia);
                break;
            }
        }
    }

    // este metodo nos permitira visualizar un comentario anteriormente
    // creado y en este comentario se visualizara el autor
    // la fecha de cracion y el contenido del mismo
    private void mostrarComentario(Comentario comentario) {
        System.out.println("\tFecha: " + comentario.fecha.getDayOfMonth()+"/"+comentario.fecha.getMonth()+"/"+comentario.fecha.getYear() + " " + comentario.autor.nombre + ": " + comentario.texto);
    } 

    //este metodo lee el array de likes de la publicacion recibida y los muestra por orden cronologico
 private void mostrarLikes(Publicacion publicacion) {
        System.out.println("Likes: ");
        for (int i = (publicacion.likes.size()-1); i >= 0 && publicacion.likes.size() != 0; i--) {
            System.out.println(publicacion.likes.get(i).nombre + " ");
        }
    }

    // Muestra todas las solicitudes de amistad
    // y tambien te deja volver al menu principal o elegir una de las solicitudes,
    // al elegirla llama a menu solicitud
    private void mostrarSolicitudes() {
        if (perfilActual.solicitudes.size() != 0){
            System.out.println("Solicitudes: ");
            for (int i = (perfilActual.solicitudes.size()-1); i >= 0; i--) {
                System.out.println(i+"- Tienes una solicitud de: " + perfilActual.solicitudes.get(i).nombre);
            }
        } else{
            System.out.println("No tienes solicitudes de amistad");
        }

        System.out.println((perfilActual.solicitudes.size()+1) + " Añadir amigo");
        System.out.println((perfilActual.solicitudes.size() + 2) + " Volver");
        System.out.println("Tu respuesta: ");
        int opcion = new Scanner(System.in).nextInt();
        if (opcion < perfilActual.solicitudes.size()) {
            menuSolicitud(perfilActual, opcion);
        } else if (opcion == (perfilActual.solicitudes.size() + 1)) {
            enviarSolicitud();
        } else if (opcion == (perfilActual.solicitudes.size() + 2)) {
            mostrarMenuPrincipal();
        } else {
            System.out.println("Elige una opcion valida");
            mostrarSolicitudes();
        }
    }

    // este metodo nos permitira enviarle una solicitud de amistad
    // a un perfil para ello nos pedira por pantalla
    // que escribamos el nombre del perfil al cual
    // le queremos enviar la solicitud de amistad
    private void enviarSolicitud() {
        System.out.println("Escribe el nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        if (CaraLibroDB.buscarPerfil(nombre) != null) {
            if (CaraLibroDB.buscarPerfil(nombre).solicitudes.contains(perfilActual) || CaraLibroDB.buscarPerfil(nombre).amigos.contains(perfilActual) || perfilActual.solicitudes.contains(nombre) || CaraLibroDB.buscarPerfil(nombre) == perfilActual){
                System.out.println("Ya enviaste una solicitud o ya es tu amigo:)");
            } else{
                CaraLibroDB.buscarPerfil(nombre).addSolicitud(perfilActual);
                System.out.println("Solicitud enviada :)");
            }
            mostrarSolicitudes();
        } else {
            System.out.println("El perfil no existe");
            mostrarSolicitudes();
        }
    }

    // Este metodo te pide el perfil y que elijas una opcion para
    // aceptar y rechazar solicitudes ademas de mostrarlas por pantalla
    private void menuSolicitud(Perfil perfil, int opcion) {
        System.out.println(perfil.solicitudes.get(opcion).nombre);
        System.out.println("1- Aceptar solicitud");
        System.out.println("2- Denegar solicitud");
        System.out.println("3- Volver");
        System.out.println("Tu respuesta: ");

        int opcion2 = new Scanner(System.in).nextInt();
        switch (opcion2) {
            case 1: {
                perfil.aceptarSolicitud(perfil.solicitudes.get(opcion));
                mostrarSolicitudes();
                break;
            }
            case 2: {
                perfil.rechazarSolicitud(perfil.solicitudes.get(opcion));
                mostrarSolicitudes();
                break;
            }
            case 3: {
                mostrarSolicitudes();
                break;
            }
            default: {
                System.out.println("Elige una opcion valida");
                menuSolicitud(perfil, opcion);
                break;
            }
        }
    }

    // este metodo nos permitira visualizar nuestra lista de amigos
    // dentro de la cual podremos elegir a un amigo y en este nos
    // llamara al metodo menuamigo o nos da la opcion de volver al
    // menu principal
    private void mostrarAmigos() {
        if (perfilActual.amigos.size() != 0){
            System.out.println("Tus amigos: ");
            for(int i = (perfilActual.amigos.size()-1); i >= 0; i--){
                System.out.println(i + "- " + perfilActual.amigos.get(i).nombre);
                System.out.println(perfilActual.amigos.get(i).estado);
            }
        } else{
            System.out.println("No tienes amigos :(");
        }
        
        System.out.println((perfilActual.amigos.size() + 1) + "- Volver");
        System.out.println("Tu respuesta: ");

        int opcion = new Scanner(System.in).nextInt();
        if (opcion < perfilActual.amigos.size()) {
            menuAmigo(perfilActual, opcion);
        } else if (opcion == (perfilActual.amigos.size() + 1)) {
            mostrarMenuPrincipal();
        } else {
            System.out.println("Elige una opcion valida");
            mostrarAmigos();
        }
    }

    // este metodo creara un menu el cual nos dara a escoger entre
    // diversas opciones que nos permitiran realizar algunas actividades
    // en relacion a un amigo de nuestra lista de amigos
    private void menuAmigo(Perfil perfil, int opcion) {
        System.out.println(perfil.amigos.get(opcion).nombre);
        System.out.println("1- Enviar mensaje");
        System.out.println("2- Ver biografia");
        System.out.println("3- Volver");
        System.out.println("Tu respuesta: ");

        int opcion2 = new Scanner(System.in).nextInt();
        switch (opcion2) {
            case 1: {
                escribirMensaje(perfil, perfil.amigos.get(opcion));
                break;
            }
            case 2: {
                mostrarBiografia(perfil.amigos.get(opcion));
                break;
            }
            case 3: {
                mostrarAmigos();
                break;
            }
            default: {
                System.out.println("Elige una opcion valida");
                menuAmigo(perfil, opcion);
                break;
            }
        }
    }

    // este metodo mediante el uso de un bucle nos permitira visualizar
    // los mensajes que nos hayan envioado y a su vez nos mostrara
    // los mensajes que aun no hemos leido y a la hora de
    // visualizar un mensaje nos creara un menu que nos dara varias
    // opciones y dependiendo de la opcion que elijamos
    // nos enviara atras, nos permitira visualizar los mensajes
    // o nos permitira escribir una respuesta a dicho mensaje
    private void mostrarMensajes() {
        System.out.println("Tus mensajes: ");
        int noLeidos = 0;

        for (int i = 0; i <= (perfilActual.mensajes.size()-1) && perfilActual.mensajes.size() != 0; i++) {
            if (perfilActual.mensajes.get(i).leido == false) {
                noLeidos++;
            }
        }
        
        boolean error = true;
            while (error) {
                if (noLeidos == 0){
                    System.out.println("No tiens mensajes sin leer");
                } else{
                    System.out.println("Tienes " + noLeidos + " mensajes sin leer");
                }
                System.out.println("1- Ver mensajes");
                System.out.println("2- Volver");
                System.out.println("Tu respuesta: ");

                int opcion = new Scanner(System.in).nextInt();
                if (opcion == 1) {
                    error = false;
                    boolean error2 = true;
                    while (error2) {
                        for (int i = (perfilActual.mensajes.size()-1); i >= 0; i--) {
                            System.out.println(i + "- " + perfilActual.mensajes.get(i).remitente.nombre + ": ");
                            System.out.println(perfilActual.mensajes.get(i).texto);
                            System.out.println("Leido: " + perfilActual.mensajes.get(i).leido);
                            System.out.println("Fecha: " + perfilActual.mensajes.get(i).fecha.getDayOfMonth()+"/"+perfilActual.mensajes.get(i).fecha.getMonth()+"/"+perfilActual.mensajes.get(i).fecha.getYear());
                        }
                        System.out.println((perfilActual.mensajes.size() + 1) + "- Volver");
                        System.out.println("Tu respuesta: ");
                        int opcion2 = new Scanner(System.in).nextInt();
                        if (opcion2 < perfilActual.mensajes.size()) {
                            error2 = false;
                            menuMensaje(opcion2);
                        } else if (opcion2 == (perfilActual.mensajes.size() + 1)) {
                            error2 = false;
                            mostrarMensajes();
                        } else {
                            System.out.println("Elige una opcion valida");
                        }
                    }
                } else if (opcion == 2) {
                    error = false;
                    mostrarMenuPrincipal();
                } else {
                    System.out.println("Elige una opcion valida");
                }
            }
    }

    // este metodo nos generara un menu el cual nos permitira
    // realizar diversas acciones para cada mensaje
    private void menuMensaje(int opcion) {
        System.out.println(perfilActual.mensajes.get(opcion).texto);
        System.out.println("1- Marcar como leido");
        System.out.println("2- Eliminar mensaje");
        System.out.println("3- Responder");
        System.out.println("4- Volver");
        System.out.println("Tu respuesta: ");

        int opcion2 = new Scanner(System.in).nextInt();
        switch (opcion2) {
            case 1: {
                leerMensaje(perfilActual.mensajes.get(opcion));
                break;
            }
            case 2: {
                eliminarMensaje(perfilActual, perfilActual.mensajes.get(opcion));
                break;
            }
            case 3: {
                escribirMensaje(perfilActual, perfilActual.mensajes.get(opcion).remitente);
                break;
            }
            case 4: {
                mostrarMensajes();
                break;
            }
            default: {
                System.out.println("Elige una opcion valida");
                menuMensaje(opcion);
                break;
            }
        }
    }

    // este metodo nos permitira volver al menu inicial llamando al
    // metodo mostrar menu inicial
    private void cerrarSesion() {
        mostrarMenuInicial();
    }

    // nos indica en que perfil vamos a crear la publicacion, luego nos pide un texto y si no es igual a nada crea un objeto publicacion y lo añade al array de publicaciones del perfil recibido, luego nos muestra la biografia de ese perfil
    private void crearPublicacion(Perfil perfil){
        System.out.println("Crear publicacion en "+perfil.nombre+": ");
        String texto = new Scanner(System.in).nextLine();
        if (texto != ""){
            perfil.addPublicacion(new Publicacion(perfilActual, texto));
            System.out.println("Publicacion añadida :)");
            mostrarBiografia(perfil);
        } else{
            System.out.println("Escribe algo :)");
            crearPublicacion(perfil);
        }
    }

    // este metodo nos permitira registrar un perfil introduciiendo por
    // pantalla un nombre y una contraseña, y confirma la contraseña escribiendola 2 veces en caso de que ya exista
    // dicho perfil no nos dejara registrarlo
    private void crearPerfil() {
        System.out.println("Registro");
        System.out.println("Nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Contraseña: ");
        String senha = new Scanner(System.in).nextLine();
        System.out.println("Repetir contraseña: ");
        String senha2 = new Scanner(System.in).nextLine();

        if (!senha.equals(senha2)){
            System.out.println("Las contraeñas no conciden :(");
            crearPerfil();
        } else if (CaraLibroDB.buscarPerfil(nombre) == null) {
            CaraLibroDB.addPerfil(new Perfil(nombre, senha));
            iniciarSesion();
        } else {
            System.out.println("Ya existe un perfil con tu nombre, elige otro");
            crearPerfil();
        }
    }

    // este metodo nos permitira iniciar sesion con nuestro perfil
    // añadiendo por pantalla los datos que tenia nuestro
    // perfil anteriormente registrado, una vez hayamos iniciado sesion
    // nos mostrara el menu principaql
    private void iniciarSesion() {
        System.out.println("Inicio de sesion");
        System.out.println("Nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Contraseña: ");
        String senha = new Scanner(System.in).nextLine();
        if (CaraLibroDB.getPerfil(nombre, senha) != null) {
            perfilActual = CaraLibroDB.getPerfil(nombre, senha);
            mostrarMenuPrincipal();
        } else {
            System.out.println("Usuario o contraseña incorrectas");
            iniciarSesion();
        }
    }

    // este metodo nos permitira cambiar el estado
    // en caso de tenes un estado nos mostrara dicho estado
    // en caso de no tener un estado nos pedira que escribamos
    // un estado nuevo
    private void cambiarEstado() {
        System.out.println("Escribe tu nuevo estado: ");
        String estado = new Scanner(System.in).nextLine();
        if (!estado.equals("")) {
            perfilActual.estado = estado;
            mostrarEstado();
        } else {
            System.out.println("Escribe algo");
            cambiarEstado();
        }
    }

    // este metodo nos permitira añadir un comentario a una
    // publicacion anteriormente existente creando un nuevo
    // objeto del array comentarios
    private void escribirComentario(Publicacion publicacion, Perfil perfil) {
        System.out.println("Añadir un comentario a la publicacion de " + publicacion.autor.nombre + ": ");
        String texto = new Scanner(System.in).nextLine();
        publicacion.addComentario(new Comentario(texto, perfil));
    }

    // este metodo nos permitira añadir un like a una publicadion existente
    private void like(Publicacion publicacion) {
        publicacion.addLike(perfilActual);
    }

    // este metodo nos permitira escribir un mensaje a un perfil el
    // cual ira al perfil destinatario y creara un nuevo
    // objeto mensaje
    private void escribirMensaje(Perfil remitente, Perfil destinatario) {
        System.out.println("Escribir mensaje a " + destinatario.nombre + ": ");
        String texto = new Scanner(System.in).nextLine();
        destinatario.addMensaje(new Mensaje(texto, remitente));
        mostrarMenuPrincipal();
    }

    // este metodo nos permitira marcar un mensaje
    // que nos hayan enviado, como leido
    private void leerMensaje(Mensaje mensaje) {
        mensaje.leido = true;
        mostrarMensajes();
    }

    // este metodo nos pide el perfil y el mensaje
    // para borrar el mensaje
    private void eliminarMensaje(Perfil perfil, Mensaje mensaje) {
        perfil.eliminarMensaje(mensaje);
        mostrarMensajes();
    }
}
