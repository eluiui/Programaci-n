/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xmlenjava;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author a22jesusbm
 */
public class Factoria {

    File libro = new File("libros.xml");

    SAXParserFactory factory;
    SAXParser parser;
    DefaultHandler oyente = new Oyente();

    public Factoria() {
        this.factory = SAXParserFactory.newInstance();
    }
    
    
    

}
