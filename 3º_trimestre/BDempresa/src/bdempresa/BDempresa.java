/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bdempresa;


import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author a22jesusbm
 */
public class BDempresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String mysqlUrl = "jdbc:mysql://localhost/empresa";
        String driver = "com.mysql.jdbc.Driver";
        String usuario = "root";
        String clave = "root";

        Connection mysqlCon = DriverManager.getConnection(mysqlUrl, usuario, clave);
        Statement mysqlSelect = (Statement) mysqlCon.createStatement();
        ResultSet mysqlResult;
        mysqlResult = mysqlSelect.executeQuery("SELECT * FROM EMPLEADOS");
        System.out.println("nombre e id del empleado");
        int contador = 0;
        while (mysqlResult.next()) {

            System.out.print(++contador + ": " + mysqlResult.getInt(1));

            System.out.print(", " + mysqlResult.getString(2));

            System.out.println(", " + mysqlResult.getInt("nombre"));

        }

    }
}
