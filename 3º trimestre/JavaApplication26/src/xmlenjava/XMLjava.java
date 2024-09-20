/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xmlenjava;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author a22jesusbm
 */
public class XMLjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException {
        Oyente oyente = new Oyente();
        oyente.startDocument();
        oyente.endDocument();
        oyente.startElement(namespace, sName, qName, atrs);
        oyente.characters(buf, 0, 0);

    }

}
