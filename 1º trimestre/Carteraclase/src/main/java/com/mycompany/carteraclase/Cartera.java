package com.mycompany.carteraclase;

public class Cartera {
    private double dinero;
    private boolean tarjeta;

    public void setDinero(double dinero,boolean tarjeta) {
        this.dinero = dinero;
        this.tarjeta = tarjeta;
    }
    

    public String disponible(){
        if (dinero>100){
           return "Tienes efectivo";
        }else if (dinero<100&&tarjeta){
           return "Tienes que ir al cajero";
        }else 
           return "Tiene: "+dinero;
    }
}