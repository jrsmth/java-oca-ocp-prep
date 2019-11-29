package ex10jdbc;
import java.sql.*;

public class TestProcedure extends Object {
	
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection c1 = DriverManager.getConnection("jdbc:oracle:oci8:datalab/belgium@work");
		System.out.println("Connection established");
		CallableStatement cs1 = c1.prepareCall("{ call testProcedure(?) }");  
		cs1.registerOutParameter(1, Types.VARCHAR);
		cs1.setString(1,"testing");
		cs1.execute();
		System.out.println("Out argument is "+cs1.getString(1));
  		cs1.close();
		c1.close();
	}
}