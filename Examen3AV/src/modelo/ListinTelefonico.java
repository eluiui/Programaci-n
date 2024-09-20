/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22jesusbm
 */
public class ListinTelefonico {

    ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    Iterator<Contacto> iter = contactos.iterator();

    public void engadirContacto(Contacto contact) {
        contactos.add(contact);
    }

    public void eliminarContacto(String telefono) {

        Contacto contacto = iter.next();

        while (iter.hasNext()) {
            if (iter.next().getTelefono().equals(telefono)) {
                contactos.remove(contacto);
            }
        }
    }
}
