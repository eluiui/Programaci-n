package com.mycompany.flujo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TXT {

    FileInputStream entrada = null;
    FileOutputStream salida = null;

    public void copiar() throws IOException {
        try {
            entrada = new FileInputStream("Z:\1º DAM\\Programacion\\2º trimestre\\flujo\\JURASICKAH.txt");
            salida = new FileOutputStream("copiaJURASICKAH.txt");
            int c;
            while ((c = entrada.read()) != -1) {
                salida.write(c);
            }
        } finally {
            if (entrada != null) {
                entrada.close();
            }
            if (salida != null) {
            }
        }
    }
}
