package com.mycompany.cadena;

public class Cadena {
private String cadena;
private String cadena2;
private String cadena3;
public Cadena(String cadena,String cadena2,String cadena3){
    this.cadena=cadena;
    this.cadena2=cadena2;
    this.cadena3=cadena3;
}
public String mayor (String cadena,String cadena2,String cadena3){
   if (cadena.length()>cadena2.length()&&cadena.length()>cadena3.length())
      return "La cadena "+cadena+" es la mas larga con "+cadena.length()+" caracteres";
   else if (cadena2.length()>cadena.length()&&cadena2.length()>cadena3.length())
      return "La cadena "+cadena2+" es la mas larga con "+cadena2.length()+" caracteres";
   else 
      return "La cadena "+cadena3+" es la mas larga con "+cadena3.length()+" caracteres";
    }

}
