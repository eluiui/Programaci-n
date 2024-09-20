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
import java.util.ArrayList;

/**
 *
 * @author a22jesusbm
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
            ArrayList<Nacionalidad> nacionalidades = new ArrayList<Nacionalidad>();
            nacionalidades.add(new Nacionalidad("Japonesa", "Japon"));
            nacionalidades.add(new Nacionalidad("ruso", "Rusia"));
            db.store(new Autor("Yumeko", nacionalidades));
            nacionalidades.clear();
            nacionalidades.add(new Nacionalidad("japonesa", "Japon"));
            db.store(new Autor("Nezuko", nacionalidades));
            db.store(new Autor("Loli", nacionalidades));

            Query query = db.query();
            query.constrain(Autor.class);
            query.descend("nombre").constrain("Nezuko");
            ObjectSet <Autor> resultado = query.execute();
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
