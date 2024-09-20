/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flujocaracteres2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author a22jesusbm
 */
public class TXT {
    
        public void copiar() throws IOException {
        FileReader fluxoEntrada = null;
        FileWriter fluxoSaida = null;

        try {
            fluxoEntrada = new FileReader("Z:\\1º DAM\\Programacion\\2º trimestre\\flujo\\JURASICKAH.txt");
            fluxoSaida = new FileWriter("saidacaracter.txt");
            int c;
            int letra='a';
            while ((c = fluxoEntrada.read()) != -1) {
                if (letra=='z'+1){
                letra='a';
                }
                fluxoSaida.write(c);
                fluxoSaida.write(letra);
                letra++;
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
