/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patters.observer;
import java.util.Observable;

/**
 *
 * @author a22jesusbm
 */
public class BankAccount extends Observable {

    private double balance;

    public void addAmount(Double amount) {
        this.balance += amount;
        setChanged();
        notifyObservers(balance);
    }

    public Double getBalance() {
        return balance;
    }

}
