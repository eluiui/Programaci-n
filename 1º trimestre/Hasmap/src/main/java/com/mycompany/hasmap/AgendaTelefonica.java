package com.mycompany.hasmap;

import java.util.HashMap;

public class AgendaTelefonica {
    HashMap <Integer, Cliente> agenda = new HashMap<>();

    public void añadir(int tel, Cliente cli){
        agenda.put(tel, cli);
    }

    public void eliminar (int tel){
        agenda.remove(tel);
    }

    public Cliente buscarPorTelefono(int tel){
        return agenda.get(tel);
    }

    public int numeroContactos(){
        return agenda.size();
    }
}
