/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hasmap;

/**
 *
 * @author a22jesusbm
 */
public class Hasmap {

    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.añadir(628252647, new Cliente("nif", "Alguien", "www"));
        agenda.añadir(3671, new Cliente("nif2", "Alguien2", "www2"));
        System.out.println(agenda.numeroContactos());
        System.out.println(agenda.buscarPorTelefono(628252647).getNombre());
        agenda.eliminar(628252647);
        System.out.println(agenda.numeroContactos());
    }
}
