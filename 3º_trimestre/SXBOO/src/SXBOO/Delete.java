/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SXBOO;

import static SXBOO.Principal.listado;
import com.db4o.Db4oEmbedded;

import com.db4o.ObjectContainer;

import com.db4o.ObjectSet;
import java.io.File;

/**
 *
 * @author a22jesusbm
 */
public class Delete {

    

    public void delete() {

        ObjectContainer db = null;

        try {

            new File("Autor.odb").delete();

            db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "Autor.odb");

            ObjectSet<Autor> resultado = db.queryByExample(new Autor("Lincoln", "Iraní"));

            listado(resultado);

            if (resultado.hasNext()) {

                Autor unAutor = resultado.next();

                System.out.println("Recuperado o autor '" + unAutor.getNombre() + "'" + " para cambiar a sua nacionalidad " + unAutor.getNacionalidad());

                unAutor.setNacionalidad("");

                db.store(unAutor);

                resultado = db.queryByExample(new Autor("Lincoln", "Iraní"));

                unAutor = resultado.next();

                System.out.println("Recuperado o autor '" + unAutor.getNombre() + "'" + " despois de cambiar a sua nacionalidade " + unAutor.getNacionalidad());

                db.delete(unAutor);

                resultado = db.queryByExample(new Autor("Lincoln", "Iraní"));

            } else {

                System.out.println("O Autor foi eliminado da base de datos");

            }

        } finally {

            db.close();

        }

    }

}
