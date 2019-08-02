package service;

import java.sql.SQLException;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO dao;
	
	public EmployeeServiceImpl() throws ClassNotFoundException, SQLException {
		
		// Create dao
		dao = new EmployeeDAOImpl();
	}
	
	@Override
	public void addEmployee(Employee employee) {
		
		dao.addEmployee(employee);
	}

}
