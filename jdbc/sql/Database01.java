package sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Call your prepareConnection() from MyConnection class
		Connection con = MyConnection.prepareConnection();

		
		// Execute a query
		System.out.println("Creating Table");
		Statement st = con.createStatement();

		
		// Create Table
		String sql = "CREATE TABLE students" + 
					"(mobile INTEGER not NULL, " + 
					"name VARCHAR(25), " + 
					"email VARCHAR(35), " + 
					"PRIMARY KEY (mobile))";
		st.executeUpdate(sql); 	// Execute SQL statement
		System.out.println("Table Created!");
		
		
//		// Insert Record
//		String sql2 = "INSERT INTO students " +
//					"VALUES (666666, 'Yugal', 'yugal@gmail.com')";
//		st.executeUpdate(sql2);	// Execute SQL statement
//		System.out.println("Data inserted!");
//		
//		
//		// Edit a record
//		String sql = "UPDATE students " +
//					"SET name = 'vikas' WHERE mobile in (666666)";
//		st.execute(sql);	// Execute SQL statement
//		System.out.println("Record edited!");
//		
//		
//		// Delete a record
//		String sql = "DELETE FROM students " +
//					"WHERE mobile = 666666";
//		st.execute(sql);	// Execute SQL statement
//		System.out.println("Record deleted!");
//		
//		
//		// Retrieve data from table
//		String sql = "SELECT mobile, name, email FROM students";
//		ResultSet rs = st.executeQuery(sql);	// Execute SQL statement
//		
//		
//		// Extract data from result set
//		System.out.println("\n\n");
//		System.out.println("Mobile\t\tName\t\tEmail");
		
		
		

	}

}

























