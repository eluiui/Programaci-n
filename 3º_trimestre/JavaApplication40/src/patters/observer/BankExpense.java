/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patters.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author a22jesusbm
 */
public class BankExpense implements Observer {

    private String type;
    private Double totalCalculated = new Double(0D);
    private final Double rateCoefficient;

    public BankExpense(String type, Double rateCoefficient) {
        this.type = type;
        this.rateCoefficient = rateCoefficient;
    }

    public void update(Observable o, Object value) {
        this.totalCalculated = ((Double) value) * rateCoefficient;
    }

    public Double getTotalCalculated() {
        return totalCalculated;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "BankExpense{"
                + "type='" + type + '\''
                + ", rateCoefficient=" + rateCoefficient
                + ", totalCalculated=" + totalCalculated
                + '}';
    }
}
