package sudoku;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author a22jesusbm
 */
import visual.VentanaPrincipal;

public class Cronometro implements Runnable {

    public static int onoff = 0;
    Thread timer;
    public boolean cronometroactivo;
    public boolean pausar;

    public void run() {
        Integer minutos = 0, segundos = 0, milesimas = 0;
        //min es minutos, seg es segundos y mil es milesimas de segundo
        String min = "", seg = "";
        try {

            while (pausar) {
                //Mientras cronometroActivo sea verdadero entonces seguira
                //aumentando el tiempo
                while (cronometroactivo) {
                    Thread.sleep(4);
                    //Incrementamos 4 milesimas de segundo
                    milesimas += 4;
                    //Cuando llega a 1000 osea 1 segundo aumenta 1 segundo
                    //y las milesimas de segundo de nuevo a 0
                    if (milesimas == 1000) {
                        milesimas = 0;
                        segundos += 1;
                        //Si los segundos llegan a 60 entonces aumenta 1 los minutos
                        //y los segundos vuelven a 0
                        if (segundos == 60) {
                            segundos = 0;
                            minutos++;
                        }
                    }

                    //Esto solamente es estetica para que siempre este en formato
                    //00:00:000
                    if (minutos < 10) {
                        min = "0" + minutos;
                    } else {
                        min = minutos.toString();
                    }
                    if (segundos < 10) {
                        seg = "0" + segundos;
                    } else {
                        seg = segundos.toString();
                    }

                    //Colocamos en la etiqueta la informacion
                    VentanaPrincipal.labeltimer.setText(min + ":" + seg);
                    /*while(pausar){
                        tiempo.setText( min + ":" + seg + ":" + mil );
                    }*/
                }
                VentanaPrincipal.labeltimer.setText(min + ":" + seg);
            }
        } catch (Exception e) {
            System.out.println("Ya valió :P, error en el run");
        }
        //Cuando se reincie se coloca nuevamente en 00:00:000
        VentanaPrincipal.labeltimer.setText("00:00");
    }

    
    public void iniciarCronometropause() {
        cronometroactivo = true;
        pausar = true;
        timer.resume();
    }

    public void iniciarCronometro() {
        cronometroactivo = true;
        pausar = true;
        timer = new Thread(this);
        timer.start();
    }

    //Esto es para parar el cronometro
    public void pararCronometro() {
        cronometroactivo = false;
        pausar = true;
    }

    public void reiniciarCronometro() {
        cronometroactivo = false;
        pausar = false;
    }


   
}
