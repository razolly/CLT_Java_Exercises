package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Singleton
 */
public class DBConnection {

	private static DBConnection instance = null;

	private DBConnection() {

	}

	/*
	 * If this Singleton has not been created, 
	 * create it then return it else, just return it
	 */
	public static DBConnection getInstance() {
		if (instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}

	public static Connection prepareConnection() throws SQLException, ClassNotFoundException {
		String connectionURL = "jdbc:mysql://localhost:3306/clt6";

		String uname = "root";
		String pwd = "root";

		Class.forName("com.mysql.jdbc.Driver");

		Connection ref = (Connection) DriverManager.getConnection(connectionURL, uname, pwd);
		return ref;
	}

}
