/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leerXML;
import java.io.IOException;
import java.util.List;
 
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 
import org.xml.sax.SAXException;
 
/**
 *
 * @author a22jesusbm
 */
public class BreakfastParser  {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        Oyente handler = new Oyente();
        saxParser.parse("..\\JavaApplication5\\src\\leerXML\\Food.xml", handler);
        List<Food> list = handler.getBreakfast();
        for (Food food : list) {
            System.out.println("Name: " + food.getName());
            System.out.println("Description: " + food.getDescription());
            System.out.println("Price: " + food.getPrice());
            System.out.println("Calories: " + food.getCalories());
            System.out.println("-------------------------------");
        }
    }
}