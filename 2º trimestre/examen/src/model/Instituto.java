/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22jesusbm
 */
public class Instituto {

    ArrayList<Profesor> profesores = new ArrayList<>();
    ArrayList<Alumno> alumnos = new ArrayList<>();

    //Añade el profesor recibido a el array de profesores, luego escribe su nombre y dni en el archivo Profesores.txt, si esto lanza una excepcion lo registra en el archivo Excepcion.txt, y si esto falla nos avisa por terminal.
    public void añadirProfesor(Profesor prof) {
        profesores.add(prof);

        BufferedWriter out;
        try {
            out = new BufferedWriter(new FileWriter("Profesores.txt"));
            out.write(prof.nombre + " " + prof.dni + "\n");
        } catch (IOException ex) {
            try {
                out = new BufferedWriter(new FileWriter("Excepcion.txt"));
                out.write("a excepcion " + ex.getMessage() + " produciuse");
            } catch (IOException ex1) {
                System.out.println("No se pudo escribir el archivo Excepcion.txt");
            }
        }
    }

        private Alumno alumnoGuardado() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis;
        fis = new FileInputStream("Alumnos.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Alumno alumno = (Alumno) ois.readObject();
        ois.close();
        return alumno;
    }

    public Profesor buscarProfesor(String dni) {
        return null;
    }

    public double calcularTotalNomina() {
        Iterator<Profesor> iter = profesores.iterator();

        double total = 0;

        while (iter.hasNext()) {
            Profesor profesor = iter.next();
            total += profesor.nomina;
        }
        return total * 12;
    }
}
