/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bdempresadelete;

import static bdempresadelete.Conexion.MYSQLPASS;
import static bdempresadelete.Conexion.MYSQLUSER;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author a22jesusbm
 */
public class BDempresadelete {

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

        Statement deleteEmp = null;

        String insertString = "DELETE FROM empresa.empleados WHERE id_empleado=22";

        try {

            mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            deleteEmp = mysqlCon.createStatement();

            int eliminados = deleteEmp.executeUpdate(insertString);

            System.out.println("Resultado: " + eliminados + " eliminado");

        } catch (SQLException e) {

            System.err.println(e.getMessage());

            e = e.getNextException();

        }

    }

}
    



