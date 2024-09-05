package com.mycompany.caralibro;

import java.util.ArrayList;
import java.util.List;

public final class CaraLibroDB {

    static List<Perfil> perfiles = new ArrayList<Perfil>();

//este metodo nos permitira ver los datos que contiene un perfil 
    public static Perfil getPerfil(String nombre, String senha){
        Perfil perfil = null;
        for(int i = 0; i < perfiles.size(); i++){
            if (perfiles.get(i).nombre.equals(nombre) && perfiles.get(i).senha.equals(senha)){
                perfil = perfiles.get(i);
            }
        
        }
        return perfil;
    }
    
//este metodo nos permitira buscar un perfil ya existente 
//en la base de datos 
    public static Perfil buscarPerfil(String nombre){
        Perfil perfil = null;
        for(int i = 0; i < perfiles.size(); i++){
            if (perfiles.get(i).nombre.equals(nombre)){
                perfil = perfiles.get(i);
            }
        
        }
        return perfil;
    }

//esto sobrecarga el constructor 
    public static Perfil addPerfil(Perfil perfil){
        perfiles.add(perfil);
        return perfil;
    }
}