package com.mycompany.metodomaior;

import java.util.Scanner;

public class Numero {
    int mayor;

    public int numero(){
      Scanner scan=new Scanner(System.in);  
        
      for (int y=1; y<=10; y++){

        System.out.print("Numero "+y+": ");
        int num =scan.nextInt();
        if (mayor< num){
            mayor=num;
        }
      }
    return mayor;
}
}
    
