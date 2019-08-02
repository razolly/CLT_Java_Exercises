package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection prepareConnection() throws SQLException, ClassNotFoundException{
		String connectionURL = "jdbc:mysql://localhost:3306/clt6";
		
		String uname = "root";
		String pwd = "root";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection ref = (Connection) DriverManager.getConnection(connectionURL,uname,pwd);
		return ref;
	}
	
}
