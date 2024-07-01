package com.my_backend.practice.manageFinance;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class DBConnection  {
    private static Connection connection = null;

    private static String host = "mysql-26a10081-eran1205-d4b7.a.aivencloud.com";
    private static String port = "19639";


    public static Connection getConnection() {
        // String url = "jdbc:mysql://" + host + ":" + port + "/" + db;
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                //connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connect to Database successfully");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return connection;
    }

}
