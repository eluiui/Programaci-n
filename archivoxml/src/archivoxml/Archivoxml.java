/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivoxml;

import java.io.File;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author a22jesusbm
 */
public class Archivoxml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TransformerException, ParserConfigurationException {

        //Crea un archivo xml. Forma DOM
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element root = document.createElement("correos");
        Element elemento0 = document.createElement("correo");
        root.appendChild(elemento0);
        Element elemento1 = document.createElement("fechaenvio");
        Element elemento2 = document.createElement("emisor");
        Element elemento3 = document.createElement("correoemisor");
        Element elemento4 = document.createElement("correoreceptor");
        Element elemento5 = document.createElement("mensaje");
        Element elemento6 = document.createElement("numero_archivos");
        Element elemento7 = document.createElement("nombre_archivos");
        elemento1.setTextContent("20-02-23");
        elemento2.setTextContent("jose");
        elemento3.setTextContent("josito132@gmail.com");
        elemento4.setTextContent("luisitocomunica@gmail.com");
        elemento5.setTextContent("Me compre el rewind por tan solo 5 pesos");
        elemento6.setTextContent("1");
        elemento7.setTextContent("Derechos del rewind 2022");
        elemento0.appendChild(elemento1);
        elemento0.appendChild(elemento2);
        elemento0.appendChild(elemento3);
        elemento0.appendChild(elemento4);
        elemento0.appendChild(elemento5);
        elemento0.appendChild(elemento6);
        elemento0.appendChild(elemento7);
        document.appendChild(root);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(writer));
        System.out.println(writer.toString());
        transformer.transform(new DOMSource(document), new StreamResult(new File("correos.xml")));
    }

}
