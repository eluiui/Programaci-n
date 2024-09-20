/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modificamultiplos;

/**
 *
 * @author a22jesusbm
 */
public class Modificamultiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero=1;
       int numero2=10;
       int suma=0;
       int y=1;
       
       if (numero<numero2){
           while (y<numero2){
                if (y%5==0){
                suma=suma+y;
           }
                y++;
           }
           System.out.println(suma);
       }else {
       System.out.println("error");
       }
           
       
       
           
    }
    
}
