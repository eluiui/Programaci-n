/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bufferedlinea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author a22jesusbm
 */
public class Linea {

    public void copiarLinea() throws IOException {
        BufferedReader flujoEntrada = null;
        PrintWriter flujoSalida = null;
        try {
            flujoEntrada = new BufferedReader(new FileReader("Z:\\1º DAM\\Programacion\\2º trimestre\\flujo\\ola.txt"));
            flujoSalida = new PrintWriter(new FileWriter("Olacaracteres.txt"));
            String text;
            while ((text = flujoEntrada.readLine()) != null) {
                flujoSalida.println(text);
            }
        } finally {
            if (flujoEntrada!=null){
                flujoEntrada.close();
            }
            if (flujoSalida !=null){
                flujoSalida.close();
            }
        }
    }

}
