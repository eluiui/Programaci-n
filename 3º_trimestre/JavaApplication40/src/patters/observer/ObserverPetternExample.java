/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patters.observer;

/**
 *
 * @author a22jesusbm
 */
public class ObserverPetternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount bankAccount = new BankAccount();

        // Observer class
        BankExpense bankExpense1 = new BankExpense("commission", 0.11d);
        BankExpense bankExpense2 = new BankExpense("expense", 0.22d);
        BankExpense bankExpense3 = new BankExpense("compensation", 0.33d);

        // Add Observer into Observable
        bankAccount.addObserver(bankExpense1);

        bankAccount.addObserver(bankExpense2);

        bankAccount.addObserver(bankExpense3);

        //ver si cambia
        System.out.println(bankExpense1.toString());
        System.out.println(bankExpense2.toString());
        System.out.println(bankExpense3.toString());

        // Change Observable state
        bankAccount.addAmount(1000d);

        // Observer was notified
        System.out.println(bankExpense1.toString());
        System.out.println(bankExpense2.toString());
        System.out.println(bankExpense3.toString());

    }

}
