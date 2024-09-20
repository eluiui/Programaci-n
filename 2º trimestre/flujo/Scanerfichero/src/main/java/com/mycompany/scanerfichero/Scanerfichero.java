/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.scanerfichero;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a22jesusbm
 */
public class Scanerfichero {

    public static void main(String[] args) {
        TXT txt = new TXT();

        try {
            txt.file();
        } catch (IOException ex) {
            Logger.getLogger(Scanerfichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
