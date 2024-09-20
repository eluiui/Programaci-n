/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Films;

import java.io.File;

import com.db4o.Db4oEmbedded;

import com.db4o.ObjectContainer;

import com.db4o.ObjectSet;



/**
 *
 * @author a22jesusbm
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new File("Autor.odb").delete();

        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "Autor.odb");

        ObjectSet<Autor> resultado = null;

        try {

            db.store(new Autor( "Gandhi", "epañola"));

            db.store(new Autor( "Lincoln", "Iraní"));

            resultado = db.queryByExample(new Autor("algo1", "algo2"));

        } finally {

            listado(resultado);

            db.close();

        }

    }

    public static void listado(ObjectSet<Autor> resultado) {

        System.out.println("Resultados: " + resultado.size());

        while (resultado.hasNext()) {

            System.out.println(resultado.next());

        }

    }

}
