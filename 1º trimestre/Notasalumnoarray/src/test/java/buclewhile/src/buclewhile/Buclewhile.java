/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclewhile;

/**
 *
 * @author a22jesusbm
 */
public class Buclewhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=5;
        int factorial=1;
        int y=num;
               
        while (y>=1){
            
           factorial=factorial*y; 
           y--;
        }
       System.out.println(factorial);
    }
    
}
