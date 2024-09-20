package com.mycompany.calendarioadvento;

public class Calendario {
    
    private final int FILA=6, COLUMNA=4;
    private int[][] matriz = new int[FILA][COLUMNA];

    public Calendario() {
        llenar();
    }

    public Calendario(int[][] matriz) {
        this.matriz = matriz;
    }

    //llena la matriz con valores aleatorios entre 1 y 24
    private void llenar() {
        int valor;
//generamos los numeros de la matriz
        for (int y = 0; y < this.matriz.length; y++) {
            for (int y2 = 0; y2 < this.matriz[y].length; y2++) {
//usamos esta variable para poder idicar si los numeros metidos son validos o no    
                boolean metido = false;
                //cuando el numero metido es igual creamos un valor ramdom               
                while (metido == false) {
                    valor = (int) Math.floor(Math.random() * (24 - 1 + 1) + 1);
//si el numero sirve entonce lo metemos en la matriz                     
                    if (!comprobar(valor)) {
                        this.matriz[y][y2] = valor;
//el numero pasa a ser tru por lo tanto nos sirve
                        metido = true;
                    }
                }
            }
        }
    }

//comprueba si el numero generado aleatoriamente ya esta en la matriz
    private boolean comprobar(int valor) {
        boolean estar = false;
        for (int y = 0; y < this.matriz.length; y++) {
            for (int y2 = 0; y2 < this.matriz[y].length; y2++) {
                if (matriz[y][y2] == valor) {
                    estar = true;
                }
            }
        }
        return estar;
    }

    public void comer(int num){
        for (int y = 0; y < this.matriz.length; y++) {
            for (int y2 = 0; y2 < this.matriz[y].length; y2++) {
               if (this.matriz[y][y2] == num){
                   this.matriz[y][y2] = 0;
               }
                
            }
        }
    } 

    public void llegoNavidad() {
        boolean error = false;
        for (int y = 0; y < this.matriz.length; y++) {
            for (int y2 = 0; y2 < this.matriz[y].length; y2++) {
               if (this.matriz[y][y2] != 0){
                   error = true;
               }
                
            }
        }
        if (error == false){
            System.out.print("Llego la Navidad!!");
        }
        
    }


    public void mostrar() {
        for (int y = 0; y < this.matriz.length; y++) {
            for (int y2 = 0; y2 < this.matriz[y].length; y2++) {
                System.out.print(this.matriz[y][y2] + " ");
            }
            System.out.print("\n");
        }
    }
}
