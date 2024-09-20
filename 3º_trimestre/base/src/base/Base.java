package base;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author a22jesusbm
 */
public class Base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        Statement delete = null;

        Statement select = null;

        ResultSet mysqlResult = null;

        String deleteString = "DELETE FROM empresa.empleados WHERE ID_EMPLEADO LIKE 1";

        String selectString = "SELECT * FROM empresa.empleados";

        int eliminados = 0;

        String input = null;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Título a eliminar (sair para rematar)");

        input = entrada.nextLine();
    }
    

}
