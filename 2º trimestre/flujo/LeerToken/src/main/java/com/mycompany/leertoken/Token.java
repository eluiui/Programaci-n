/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leertoken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Token {
    String rutaArchivo;
    String token = "p";
    
    private void pedirArchivo(){
        System.out.print("Escribe la ruta: ");
        rutaArchivo = new Scanner(System.in).nextLine();
    }
    
    public void archivo(){
        pedirArchivo();
        try {
            mostrarArchivo();
        } catch (FileNotFoundException ex) {
            System.out.println("No existe el archivo");
        }
    }
    
    private void mostrarArchivo() throws FileNotFoundException{
        System.out.println("El limitador es "+token);
        Scanner scan = new Scanner(new BufferedReader(new FileReader(rutaArchivo)));
        scan.useDelimiter(token);
        while(scan.hasNext()){
                System.out.println(scan.next());
        }
    }
    
}
