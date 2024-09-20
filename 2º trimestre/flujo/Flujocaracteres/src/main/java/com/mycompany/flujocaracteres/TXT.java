package com.mycompany.flujocaracteres;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TXT {

    public void copiar() throws IOException {
        FileReader fluxoEntrada = null;
        FileWriter fluxoSaida = null;

        try {
            fluxoEntrada = new FileReader("Z:\\1º DAM\\Programacion\\2º trimestre\\flujo\\JURASICKAH.txt");
            fluxoSaida = new FileWriter("saidacaracter.txt");
            int c;
            while ((c = fluxoEntrada.read()) != -1) {
                fluxoSaida.write(c);
            }
        } finally {
            if (fluxoEntrada != null) {
                fluxoEntrada.close();
            }
            if (fluxoSaida != null) {
                fluxoSaida.close();
            }

        }
    }
}
