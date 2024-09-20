/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scanerfichero;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class TXT {

    public void file() throws IOException {
        Scanner scan = new Scanner(System.in);
        Scanner scin = new Scanner(System.in);
        System.out.println("Escribe la ruta");
        File ruta = new File(scin.nextLine());
        System.out.println("Nombre del archibo");
        File f = new File(ruta, scan.nextLine());

        if (ruta.exists() && f.exists()) {
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getParent());
            System.out.println(f.getName());
            System.out.println(ruta.getAbsolutePath());
            System.out.println(ruta.getParent());
            System.out.println(f.length());
        } else if (ruta.exists() && !f.exists()) {
            f.createNewFile();
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getParent());
            System.out.println(f.getName());
            System.out.println(ruta.getAbsolutePath());
            System.out.println(ruta.getParent());
            System.out.println(f.length());
        } else {
            System.out.println("No existe la ruta");
        }
    }
}
