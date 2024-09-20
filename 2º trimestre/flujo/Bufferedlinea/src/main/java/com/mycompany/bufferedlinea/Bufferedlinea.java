/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bufferedlinea;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a22jesusbm
 */
public class Bufferedlinea {

    public static void main(String[] args) {
        Linea linea = new Linea();
        
        try{
          linea.copiarLinea();
        }catch(IOException ex){
         Logger.getLogger(Bufferedlinea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
