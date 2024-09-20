/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xmlenjava;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author a22jesusbm
 */
public class Lectura {

    File libro = new File("libros.xml");

    SAXParserFactory factory;
    SAXParser parser;
    DefaultHandler oyente = new Oyente();

    public Lectura() throws SAXException, IOException {
        this.factory = SAXParserFactory.newInstance();
        parser.parse(libro, oyente);

    }
    
    
    

}
