package com.mycompany.clasepersona;

import java.util.Scanner;

public class Persona {
    Scanner scan=new Scanner(System.in);
    private String nombre;
    private int año;

    public Persona() {
        setDatos();
    }
    
    private void setDatos(){
        System.out.print("Escribe tu nombre: ");
        nombre = scan.nextLine();
        System.out.print("Escribe tu año de nacimiento: ");
        año = scan.nextInt();
    }
public String futuro(){
   
    return "Hola "+nombre+", en el año 2030 tendras "+(2030-año);
}
}


