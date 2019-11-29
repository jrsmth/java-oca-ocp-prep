package ex10jdbc;

import java.sql.*;
import oracle.jdbc.OracleDriver;

public class OrdersPrepared {
    public static void main(String[] args) {
        try {
            String connString = "jdbc:oracle:thin:@localhost:1521:work";
            String user = "user1";
            String password = "user1";
            DriverManager.registerDriver(new OracleDriver());
            Connection conn = 
                DriverManager.getConnection(connString, user, password);
                
            PreparedStatement prep = conn.prepareStatement(
                                        "insert into orders " +
                                        "values (?,?,?,?,?)" );
            prep.setInt(1,1051);
            prep.setString(2,"HD12");
            prep.setInt(3,1822);
            prep.setDate(4,null);
            prep.setInt(5,50);
            prep.executeUpdate();
           
            prep.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

