package database;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection2 {

	public static Connection myConnection() {
		
		Connection con = null;
		FileReader reader = null;
		Properties prop = new Properties();		// To hold properties from text file
		
		try {
			reader = new FileReader("db.properties");
			
			// Load JDBC related properties in above file
			prop.load(reader);
			
			// Load the driver class
			Class.forName(prop.getProperty("db_driver_class"));		// This key can be anything
			
			// Create the connection
			con = DriverManager.getConnection(
					prop.getProperty("db_url"),
					prop.getProperty("db_username"),
					prop.getProperty("db_password"));
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			System.out.println("DB Connection Error!");
		}
		
		return con;
		
	}
	
}
