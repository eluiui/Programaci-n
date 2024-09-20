/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22jesusbm
 */
public class Instituto {

    ArrayList<Profesor> guardar = new ArrayList<Profesor>();

    public void engadirProfesor(Profesor prof) throws IOException {

        guardar.add(prof);
       

        FileWriter fichero = null;
        FileWriter fichero1 = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("Profesores.txt");
            pw = new PrintWriter(fichero);

            pw.println(prof.getNome());
            pw.println(prof.getDni());

        } catch (IOException io) {
            fichero1 = new FileWriter("Excepcion.txt");
            pw = new PrintWriter(fichero1);

            pw.println("a excepcio " + io + " produciuse");

        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
    }

    public void buscarProfesor(String dni) {

    }

    public void calcularTotalNominas() {
        

        Iterator<Profesor> it = guardar.iterator();
        

        while (it.hasNext()) {
            Profesor item = it.next();
            System.out.println("Nomina anual Profesor: " + 12*(item.getNomina()));
            
        }

    }

}
