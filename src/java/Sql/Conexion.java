/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgar.haro
 */
public class Conexion {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            String driverClassName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverClassName);
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "master", "master");

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
