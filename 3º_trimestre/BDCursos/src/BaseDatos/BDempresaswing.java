/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import static BaseDatos.Conexion.MYSQLPASS;
import static BaseDatos.Conexion.MYSQLUSER;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class BDempresaswing {

    public void delete() {

        String mysqlUrl = "jdbc:mysql://localhost/empresa";

        Connection mysqlCon = null;

        try {

            String driver = "com.mysql.jdbc.Driver";

            Class.forName(driver).newInstance();

        } catch (Exception e) {

            System.out.println("Non se atopou o driver MySQL.");

        }

        PreparedStatement deleteDep = null;

        PreparedStatement selectDep = null;

        ResultSet mysqlResult = null;

        String deleteString = "DELETE FROM empresa.departamentos WHERE titulo LIKE ?";

        String selectString = "SELECT * FROM empresa.departamentos";

        int eliminados = 0;

        String input = null;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Título a eliminar (sair para rematar)");

        input = entrada.nextLine();

        try {

            mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            deleteDep  = mysqlCon.prepareStatement(deleteString);

            selectDep  = mysqlCon.prepareStatement(selectString);

            while (!input.equals("sair")) {

                deleteDep .setString(1, input);

                eliminados = deleteDep .executeUpdate(); 

                System.out.println("Elimináronse " + eliminados + " filas");

                mysqlResult = selectDep.executeQuery();

                while (mysqlResult.next()) {

                    System.out.println(mysqlResult.getString(2));

                }

                System.out.println("Departamento a eliminar");

                input = entrada.nextLine();

            }

        } catch (SQLException e) {

            while (e != null) {

                System.err.println("SQLState: " + e.getSQLState());

                System.err.println(" Code: " + e.getErrorCode());

                System.err.println(" Message:");

                System.err.println(e.getMessage());

                e = e.getNextException();

            }

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
