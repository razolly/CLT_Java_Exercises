package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import database.DBConnection;
import model.Employee;
import java.sql.Connection;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	DBConnection db;
	Statement st;
	Connection con;
	
	public EmployeeDAOImpl() throws ClassNotFoundException, SQLException {
		
		// Get singleton for connecting to database
		db = DBConnection.getInstance();	
		
		// Create connection to database
		con = db.prepareConnection();	
		
//		// Creating an Employee table
//		System.out.println("Creating Employee Table");
//		st = con.createStatement();
//		String sql = "CREATE TABLE employees" + 
//					"(employeeId INTEGER not NULL, " + 
//					"employeeName VARCHAR(35), " + 
//					"password VARCHAR(25), " + 
//					"dateOfBirth VARCHAR(15), " + 
//					"PRIMARY KEY (employeeId))";
//		st.executeUpdate(sql); 	// Execute SQL statement
//		System.out.println("Employee Table Created!");
	}

	@Override
	public void addEmployee(Employee employee) {
		
		// Extract values from Employee object
		int employeeId = employee.getEmployeeId();
		String employeeName = employee.getEmployeeName();
		String password = employee.getPassword();
		String dateOfBirth = employee.getDateOfBirth();
		
		// Create SQL statement to insert into database
		String sql = "INSERT INTO employees " +
					"VALUES (" + employeeId 
					+ ", '" + employeeName 
					+ "', '" + password 
					+ "', '" + dateOfBirth
					+ "')";
		try {
			// Execute SQL statement
			st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println(employeeName + " inserted!");
		} catch (SQLException e) {
			System.out.println(employeeName + " failed to insert!");
		}	
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEmployee(int employeeId) {
		// TODO Auto-generated method stub

	}

}
