/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.flujocaracteres2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author a22jesusbm
 */
public class Flujocaracteres2 {

    public static void main(String[] args) {
        try {
            TXT txt = new TXT();
            
            
            txt.copiar();
        } catch (IOException ex) {
            Logger.getLogger(Flujocaracteres2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }}

