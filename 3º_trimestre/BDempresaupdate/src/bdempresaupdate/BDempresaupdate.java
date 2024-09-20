/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bdempresaupdate;

import static bdempresaupdate.Conexion.MYSQLPASS;
import static bdempresaupdate.Conexion.MYSQLUSER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author a22jesusbm
 */
public class BDempresaupdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String mysqlUrl = "jdbc:mysql://localhost/empresa";

        Connection mysqlCon = null;

        try {

            String driver = "com.mysql.cj.jdbc.Driver";

            Class.forName(driver).newInstance();

        } catch (Exception e) {

            System.out.println("Failed to load MySQL driver.");

        }

        Statement insertFilm = null;

        String updateString = " UPDATE empresa.empleados set nombre='Jose' where id_empleado=22  ";

        try {

            mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            insertFilm = mysqlCon.createStatement();

            int insertados = insertFilm.executeUpdate(updateString);

            System.out.println("Resultado: " + insertados + " insertado");

        } catch (SQLException e) {

            System.err.println(e.getMessage());

            e = e.getNextException();

        }

    }

}
