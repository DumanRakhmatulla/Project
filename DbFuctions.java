package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static java.lang.Class.forName;

public class DbFuctions {
    public static Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn = null;
        try {
            forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/" + dbname, user, pass);
            if (conn != null) {
                System.out.println("Connectio" +
                        "n Established");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
//    public void createTable(Connection conn, String table_name) {
//        Statement statement;
//        try {
//            String query = "create table " + table_name + "(id serial, name varchar(200), address varchar(200), primary key(id));";
//            statement = conn.createStatement();
//            statement.executeUpdate(query);
//            System.out.println("Table Created");
//        }catch (Exception e) {
//            System.out.println(e);
//        }
//    }

