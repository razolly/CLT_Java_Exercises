package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import database.DBConnection;
import model.Employee;
import java.sql.Connection;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	DBConnection db;
	Statement st;	// PreparedStatement has better performance
	Connection con;
	
	public EmployeeDAOImpl() throws ClassNotFoundException, SQLException {
		
		// Get singleton for connecting to database
		db = DBConnection.getInstance();	
		
		// Create connection to database
		con = db.prepareConnection();	
		// TODO close the connection
		
		// createEmployeeTable();	Table only needs to be created once
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
		// Create SQL statement to delete database
		String sql = "DELETE FROM employees WHERE employeeId = " + employeeId;
		try {
			// Execute SQL statement
			st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Employee " + employeeId + " removed!");
		} catch (SQLException e) {
			System.out.println("Failed to remove Employee " + employeeId);
		}	
	}
	
	private void createEmployeeTable() {
		
		try {
			System.out.println("Creating Employee Table");
			st = con.createStatement();
			String sql = "CREATE TABLE employees" + 
						"(employeeId INTEGER not NULL, " + 
						"employeeName VARCHAR(35), " + 
						"password VARCHAR(25), " + 
						"dateOfBirth VARCHAR(15), " + 
						"PRIMARY KEY (employeeId))";
			st.executeUpdate(sql); 	// Execute SQL statement
			System.out.println("Employee Table Created!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
