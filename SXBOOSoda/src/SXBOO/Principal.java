/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SXBOO;

import java.io.File;

import com.db4o.Db4oEmbedded;

import com.db4o.ObjectContainer;

import com.db4o.ObjectSet;

import com.db4o.query.Query;

/**
 *
 * @author a2jesusbm
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjectContainer db = null;
        try {
            new File("autor.odb").delete();

            db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "autor.odb");

            db.store(new Autor("Peter", "española"));

            db.store(new Autor("Nezuko", "Japonesa"));

            db.store(new Autor("Loli", "Japonesa"));

            Query query = db.query();
            query.constrain(Autor.class);
            ObjectSet<Autor> resultado = query.execute();

            listado(resultado);
            query = db.query();

            query.constrain(Autor.class);

            query.descend("nacionalidad").constrain("española");

            resultado = query.execute();

            if (resultado.hasNext()) {

                Autor unAutor = (Autor) resultado.next();

                db.delete(unAutor);
            }
            listado(resultado);

            query = db.query();

            query.constrain(Autor.class);

            resultado = query.execute();

            listado(resultado);
        } finally {

            db.close();

        }
    }

    public static void listado(ObjectSet<Autor> resultado) {

        System.out.println("Resultados: " + resultado.size());

        while (resultado.hasNext()) {

            System.out.println(resultado.next());

        }

        System.out.println("---------------");

    }
}
