/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import visual.VentanaPrincipal;

/**
 *
 * @author jesus
 */
public class SudokuDB {

    static Connection mysqlCon;

    public static boolean conectar() {
        try {
            String mysqlUrl = "jdbc:mysql://localhost/sudoku";
            String usuario = "root";
            String clave = "root";
            mysqlCon = DriverManager.getConnection(mysqlUrl, usuario, clave);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public static boolean mostarGanadores() {
        PreparedStatement select = null;
        ResultSet result = null;
        String mostrarganador = "Select * from sudoku.ganadores";
        try {

            select = mysqlCon.prepareStatement(mostrarganador);
            result = select.executeQuery();

            while (result.next()) {
                VentanaPrincipal.ranking.setText(mostrarganador);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SudokuDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }

    public static boolean mostarJugadores() {
        PreparedStatement select = null;
        ResultSet result = null;
        String mostrarjugador = "Select * from sudoku.jugadores";
        try {

            select = mysqlCon.prepareStatement(mostrarjugador);
            result = select.executeQuery();

            VentanaPrincipal.escoger.removeAllItems();

            while (result.next()) {
                VentanaPrincipal.escoger.addItem(result.getString("nombre"));
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean add() {

        try {
            PreparedStatement insert = null;
            ResultSet result = null;
            String nombre = VentanaPrincipal.nombre.getText();
            PreparedStatement insertStat = mysqlCon.prepareStatement("insert into sudoku.jugadores(nombre) values(?)");
            insertStat.setString(1, nombre);
            insertStat.executeUpdate();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SudokuDB.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
     public static boolean addganadores() {

        try {
            PreparedStatement insert = null;
            ResultSet result = null;
            String nombre = VentanaPrincipal.nombre.getText();
            String tiempo = VentanaPrincipal.labeltimer.getText();
            PreparedStatement insertStat = mysqlCon.prepareStatement("insert into sudoku.ganadores(nombre) values(?)"
            +"insert into sudoku.ganadores(tiempo) values(?)");
            insertStat.setString(1, nombre);
            insertStat.setString(2, tiempo);
            insertStat.executeUpdate();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SudokuDB.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }


}
