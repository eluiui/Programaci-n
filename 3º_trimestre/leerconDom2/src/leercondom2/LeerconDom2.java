/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leercondom2;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author a22jesusbm
 */
public class LeerconDom2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File archivo = new File("..\\leerconDom2\\src\\leercondom2\\Food.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            Document document = documentBuilder.parse(archivo);
            document.getDocumentElement().normalize();
            System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
            NodeList listaComiditas = document.getElementsByTagName("food");
            for (int temp = 0; temp < listaComiditas.getLength(); temp++) {
                Node nodo = listaComiditas.item(temp);
                System.out.println("Elemento:" + nodo.getNodeName());
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodo;
                    System.out.println("Name: " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Price: " + element.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("Description: " + element.getElementsByTagName("description").item(0).getTextContent());
                    System.out.println("Calories: " + element.getElementsByTagName("calories").item(0).getTextContent());
                }
            }
        } catch (IOException | ParserConfigurationException | DOMException | SAXException e) {
        }
        try {
            //fichero origen
            String filePath = "..\\leerconDom2\\src\\leercondom2\\Food.xml";
            File file = new File(filePath);
            
            //factria dom
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            
            //cambio elementos 
            Node food = document.getElementsByTagName("food").item(0);
            Element foodElement = (Element) food;
            Node name = foodElement.getElementsByTagName("name").item(0);
            Node price = foodElement.getElementsByTagName("price").item(0);
            Element nameElement = (Element) name;
            Element priceElement = (Element) price;
            nameElement.setTextContent("tomate");
            priceElement.setTextContent("8.00");
            
            //transformacion
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult reStreamResult = new StreamResult(file);
            transformer.transform(domSource, reStreamResult);
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(domSource, consoleResult);

        } catch (IOException | ParserConfigurationException | TransformerException | DOMException | SAXException e) {
        }
    }

}
