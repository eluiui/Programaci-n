/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xmlenjava;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author a22jesusbm
 */
public class Oyente extends DefaultHandler {

    public Oyente() {

    }

    public void startDocument() throws SAXException {
        System.out.println("Comienzo del documento");
    }

    public void endDocument() throws SAXException {
        System.out.println("Final del documento");
    }

    public void startElement(String namespace, String sName,
            String qName, Attributes atrs) throws SAXException {
        System.out.println("Elemento: " + qName);
        if (atrs != null) {
            for (int i = 0; i < atrs.getLength(); i++) {
                System.out.println("Atributo: " + atrs.getQName(i)
                        + " = " + atrs.getValue(i));
            }
        }
    }

    public void characters(char buf[], int offset, int len) {
        String aux = new String(buf, offset, len);
        System.out.println("Texto: " + aux);
    }

}
