/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import modelo.ListinTelefonico;
import modelo.Contacto;
import modelo.AccesoBD;

/**
 *
 * @author a22jesusbm
 */
public class Controlador {

    public void almacenarContacto(String nome, String telefono, boolean particular, ListinTelefonico listin) {

        Contacto contacto1 = new Contacto();
        AccesoBD acceso = new AccesoBD();

        acceso.insertDB(contacto1);
    }

    public ListinTelefonico crearListin() {
        return new ListinTelefonico();
    }

    public void engadirContacto(Contacto contact, ListinTelefonico listin) {
        listin.engadirContacto(contact);
    }

    public void gardarEnDisco(ListinTelefonico listin) throws FileNotFoundException, IOException {
        File f = new File("GardarListin.txt");
        ObjectOutputStream fEscritura = new ObjectOutputStream(new FileOutputStream(f));
        fEscritura.writeObject(listin);
    }

   /* public ListinTelefonico cargarListin(File f){
        
        
    }*/
    public int ordenar(int a, int b, int c, int d) throws ArrayIndexOutOfBoundsException {
        int tmp;
        int[] array_estático = new int[4];

        array_estático[0] = a;
        array_estático[1] = b;
        array_estático[2] = c;
        array_estático[3] = d;

        for (int i = 0; i < array_estático.length; i++) {

                for (int n = i + 1; n < array_estático.length; n++) {

                    if (array_estático[i] > array_estático[n]) {

                        tmp = array_estático[i];
                        array_estático[i] = array_estático[n];
                        array_estático[n] = tmp;
                    }
                }
                System.out.println(array_estático[i]);
            }
        

        return 0;
    }
    
}
