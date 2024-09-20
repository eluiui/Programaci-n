/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bdempresainsert;

import static bdempresainsert.Conexion.MYSQLPASS;
import static bdempresainsert.Conexion.MYSQLUSER;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author a22jesusbm
 */
public class BDempresaInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        String mysqlUrl = "jdbc:mysql://localhost/empresa";

        Connection mysqlCon = null;

        try {

            String driver = "com.mysql.cj.jdbc.Driver";

            Class.forName(driver).newInstance();

        } catch (Exception e) {

            System.out.println("Failed to load MySQL driver.");

        }

        Statement insertFilm = null;

        String insertString = "INSERT INTO empresa.empleados VALUES (022, '111111131', '123456567893111', 'Modificado', 'AVDA DE ARTEIXO 123', 1200, 'V', '2017-12-04', 02, NULL)";

        try {

            mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            insertFilm = mysqlCon.createStatement();

            int insertados = insertFilm.executeUpdate(insertString);

            System.out.println("Resultado: " + insertados + " insertado");

        } catch (SQLException e) {

            System.err.println(e.getMessage());

            e = e.getNextException();

        }

    }

}
