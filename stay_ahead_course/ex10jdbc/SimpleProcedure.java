package ex10jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.*;

public class SimpleProcedure {

    public static void main(String[] args) throws Exception {
        DriverManager.registerDriver(new OracleDriver());
        Connection conn = 
            DriverManager.getConnection("jdbc:oracle:thin:@room2-00:1521:orcl",
            		"user1","user1");
        conn.setAutoCommit(false);
        Statement stat = conn.createStatement();
        String query = "select surname,salary from employee where job = 'Chairman'";
        ResultSet result = stat.executeQuery(query);
        while (result.next())
            System.out.println(result.getString("surname") + "\t" + 
            		result.getString("salary"));
        //stat.executeUpdate("begin update_employee; end;");
        CallableStatement cs = conn.prepareCall("{ call update_employee }");
        cs.executeUpdate();
        result = stat.executeQuery(query);        
        while (result.next())
            System.out.println(result.getString("surname") + "\t" + 
            		result.getString("salary"));        
        conn.commit();
        stat.close();
        conn.close();
    }
}




