/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mtb;

/**
 *
 * @author a22jesusbm
 */
public class NewClass {
    
    public int velocidad;

    public NewClass() {
    }

    public void frenar(int decremento) {
        //aplicar freno
        velocidad -= decremento;
    }

    public void acelerar(int incremento) {
        //acelerar
        velocidad += incremento;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
}
