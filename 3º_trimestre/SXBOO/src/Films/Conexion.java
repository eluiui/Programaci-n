/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Films;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author a22jesusbm
 */
public class Conexion {

    public void conexion() {
        try {
            String mysqlUrl = "jdbc:mysql://192.168.8.6/empresa";
            String usuario = "root1";
            String clave = "root";
            Connection con = DriverManager.getConnection(mysqlUrl, usuario, clave);
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("select * from empleados");
            while (result.next()) {
                System.out.println(result.getString("nombre"));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
