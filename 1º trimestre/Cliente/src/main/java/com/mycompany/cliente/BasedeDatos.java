package com.mycompany.cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class BasedeDatos {

    ArrayList<Cliente> datos = new ArrayList<>();

    public BasedeDatos() {
        altaCliente();
        mostrarCliente();
    }

    public void altaCliente() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nif: ");
        String nif = scan.nextLine();
        System.out.println("Nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Apellidos");
        String apellidos = scan.nextLine();

        Cliente cliente = new Cliente(nif, nombre, apellidos);
        datos.add(cliente);
    }

    public void bajaCliente(String nif) {
        for (int y = 0; y < datos.size(); y++) {
            if (datos.get(y).getNif().equals(nif) == true) {
                datos.remove(y);
            }
        }
    }

    public void numeroClientes() {
        System.out.println(datos.size());
    }

    public void mostrarCliente() {
        for (int y = 0; y < datos.size(); y++) {
            System.out.println(datos.get(y).getNif());
        }
    }
}
