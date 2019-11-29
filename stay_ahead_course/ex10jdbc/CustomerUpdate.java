package ex10jdbc;

import java.sql.*;
import oracle.jdbc.OracleDriver;

public class CustomerUpdate {
    public static void main(String[] args) {
        try {
            String connString = "jdbc:oracle:thin:@localhost:1521:work";
            String user = "user1";
            String password = "user1";
            DriverManager.registerDriver(new OracleDriver());
            Connection conn = 
                DriverManager.getConnection(connString, user, password);
                
            conn.setAutoCommit(false);
            Statement stat = conn.createStatement();
            
            stat.executeUpdate("update customer set town = 'Brighton' " +
                                "where surname = 'Smith'");
            conn.commit();
            
            ResultSet result = stat.executeQuery("select surname,town " +
                                                "from customer" +
                                                "where surname = 'Smith'");
            while (result.next())
                System.out.println(result.getString("surname") + "\t" + 
                                   result.getString("town"));
            result.close();
            stat.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
