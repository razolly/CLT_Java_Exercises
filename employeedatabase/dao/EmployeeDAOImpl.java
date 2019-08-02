package dao;

import java.sql.SQLException;
import java.util.List;

import database.DBConnection;
import model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	DBConnection db;
	
	public EmployeeDAOImpl() throws ClassNotFoundException, SQLException {
		db = DBConnection.getInstance();
		db.prepareConnection();
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub

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
