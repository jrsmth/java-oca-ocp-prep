package ex10jdbc;

import java.sql.*;
import oracle.jdbc.OracleDriver;

public class DBMetadata {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:work";
            String user = "user1";
            String password = "user1";
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url, user, password);
            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("DB name is: " + meta.getDatabaseProductName());
            System.out.println("DB supports stored procedures? " + 
                               meta.supportsStoredProcedures());
            System.out.println("DB driver is :" + meta.getDriverName());
            System.out.println("DB driver version is :" + 
                               meta.getDriverVersion());
            conn.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
