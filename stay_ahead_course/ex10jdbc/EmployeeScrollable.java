package ex10jdbc;

import java.sql.*;
import oracle.jdbc.*;

public class EmployeeScrollable {

    public static void main(String[] args) {
        try {
            String connString = "jdbc:oracle:thin:@localhost:1521:work";
            String user = "user1";
            String password = "user1";
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = 
                DriverManager.getConnection(connString, user, password);
            Statement stat = 
                conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                     ResultSet.CONCUR_READ_ONLY);

            ResultSet result = stat.executeQuery("SELECT * FROM Employee");

            while (result.next()) {
                StringBuffer rowText = new StringBuffer("");
                rowText.append(result.getString("SURNAME") + "\t");
                rowText.append(result.getString("JOB") + "\t");
                rowText.append(result.getDouble("SALARY") + "\t");
                System.out.println(rowText.toString());
            }

            result.close();
            stat.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
