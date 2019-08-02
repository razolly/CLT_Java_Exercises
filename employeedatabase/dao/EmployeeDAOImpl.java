package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;
import model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	DBConnection db;
	PreparedStatement ps;	
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
		
		try {
			
			String sql = "INSERT INTO employees VALUES (?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, employee.getEmployeeId());
			ps.setString(2, employee.getEmployeeName());
			ps.setString(3, employee.getPassword());
			ps.setString(4, employee.getDateOfBirth());
			
			// Execute SQL statement
			ps.executeUpdate();
			System.out.println(employee.getEmployeeName() + " inserted!");
			
		} catch (SQLException e) {
			System.out.println(employee.getEmployeeName() + " failed to insert!");
		}	
	}

	@Override
	public void updateEmployee(Employee employee) {
		
		try {
			// Create SQL statement to update employee
			String sql = "UPDATE employees SET employeeName = ?, password = ?, dateOfBirth = ? WHERE employeeId = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1,employee.getEmployeeName());
			ps.setString(2, employee.getPassword());
			ps.setString(3, employee.getDateOfBirth());
			ps.setInt(4, employee.getEmployeeId());
		
			// Execute SQL statement
			ps.executeUpdate();
			System.out.println("Employee " + employee.getEmployeeName() + " updated!");
			
		} catch (SQLException e) {
			System.out.println("Failed to update Employee " + employee.getEmployeeName());
		}	
		
	}

	@Override
	public List<Employee> listEmployee() {
		
		try {
			// Retrieve data from table
			ps = con.prepareStatement("SELECT * FROM employees");
			
			ResultSet rs = ps.executeQuery();	// Execute SQL statement
			
			// List to hold Employees
			List<Employee> listOfEmployee = new ArrayList<Employee>();
			rs.next();	// Position cursor to first row of ResultSet before reading
			
			// Extract values from result set and store in List
			while (rs.next()) {
				Employee e = new Employee();	
				e.setEmployeeId(rs.getInt("employeeId"));
				e.setEmployeeName(rs.getString("employeeName"));
				e.setPassword(rs.getString("password"));
				e.setDateOfBirth(rs.getString("dateOfBirth"));
				listOfEmployee.add(e);
			}
			
			// Return the Employee List
			return listOfEmployee;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// If not found, return null
		return null;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		
		try {
			// Retrieve data from table
			String sql = "SELECT * FROM employees WHERE employeeId = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, employeeId);
			
			ResultSet rs = ps.executeQuery();	// Execute SQL statement
			
			// Extract values from result set and store in a Employee object
			Employee employee = new Employee();
			rs.next();	// Position cursor to first row of ResultSet before reading
			employee.setEmployeeId(employeeId);
			employee.setEmployeeName(rs.getString("employeeName"));
			employee.setPassword(rs.getString("password"));
			employee.setDateOfBirth(rs.getString("dateOfBirth"));
			
			// Return the Employee object
			return employee;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// If not found, return null
		return null;
	}

	@Override
	public void removeEmployee(int employeeId) {
		
		try {
			// Create SQL statement to delete employee
			String sql = "DELETE FROM employees WHERE employeeId = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, employeeId);
		
			// Execute SQL statement
			ps.executeUpdate();
			System.out.println("Employee " + employeeId + " removed!");
			
		} catch (SQLException e) {
			System.out.println("Failed to remove Employee " + employeeId);
		}	
	}
	
	private void createEmployeeTable() {
		
		try {
			System.out.println("Creating Employee Table");
			String sql = "CREATE TABLE employees" + 
						"(employeeId INTEGER not NULL, " + 
						"employeeName VARCHAR(35), " + 
						"password VARCHAR(25), " + 
						"dateOfBirth VARCHAR(15), " + 
						"PRIMARY KEY (employeeId))";
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Employee Table Created!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
