/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author a22jesusbm
 */
public class AccesoBD {

    Connection mysqlCon = null;
    Statement insertContacto = null;

    public void conexionBD() {
        try {
            String mysqlUrl = "jdbc:mysql://localhost/BD1";

            String usuario = "root";

            String clave = "root";

            Connection con = DriverManager.getConnection(mysqlUrl, usuario, clave);

            if (con != null) {
                System.out.println("Conexion correcta");
            }

        } catch (Exception e) {

            e.printStackTrace();

            return;

        }

    }

    public void insertDB(Contacto contact) {

        String insertString;

        String mysqlUrl = "jdbc:mysql://localhost/BD1";

        String usuario = "root";

        String clave = "root";

        insertString = "INSERT INTO bd2.contactos VALUES ('" + contact.getNome()
                + "','" + contact.getTelefono() + "'," + contact.getParticular()+")";
        try {

            mysqlCon = DriverManager.getConnection(mysqlUrl, usuario, clave);

            insertContacto = mysqlCon.createStatement();

            int inseridos = insertContacto.executeUpdate(insertString);
            
            System.out.println("Resultado: " + inseridos + " inserido");

        } catch (Exception e) {

            e.printStackTrace();

            return;

        } finally {

            if (mysqlCon != null) {

                try {
                    mysqlCon.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
