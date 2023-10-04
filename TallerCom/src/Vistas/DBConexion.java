/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author lilia
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author itz_l
 */
public class DBConexion {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            //JOptionPane.showMessageDialog(null, "Error en el driver" + e);
            System.out.println(e.toString());
        }
    }

    public Connection getConnetion(){
        Connection con = null;
        try {

            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tallercom?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            //JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");

        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Error en conexion" + e);
            System.out.println(e.toString());
        }
        return con;

    }
}