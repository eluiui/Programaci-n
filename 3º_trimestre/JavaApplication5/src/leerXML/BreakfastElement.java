/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leerXML;

/**
 *
 * @author a22jesusbm
 */
public enum BreakfastElement {
    FOOD("food"), NAME("name"), PRICE("price"), DESCRIPTION("description"), CALORIES("calories");
 
    private String name;
 
    private BreakfastElement(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
}
