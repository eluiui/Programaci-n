/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuartodehotel;

/**
 *
 * @author a22jesusbm
 */
public class Cuartodehotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean paro=false;
       boolean universitario=true;
       boolean numerosa=true;
       boolean jubilado=false;
       int edad=27;
       if (edad<30)
           if (universitario&&paro)
               System.out.println("Entonces paga 35");
           else if (universitario||paro)
               System.out.println("Entonces paga 40");
           else
               System.out.println("Entonces paga 50");
       else if (edad>55)
           if (jubilado||paro)
               System.out.println("Entonces paga 45");
           else 
               System.out.println("Entonces paga 60");
       else
           if (numerosa)
               System.out.println("Entonces paga 65");
           else
               System.out.println("Entonces paga 75");
    }
    
}
