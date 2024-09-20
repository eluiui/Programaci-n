/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.flujocaracteres;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a22jesusbm
 */
public class Flujocaracteres {

    public static void main(String[] args) {
        TXT txt = new TXT();

        try {
            txt.copiar();
        } catch (IOException ex) {
            Logger.getLogger(Flujocaracteres.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
