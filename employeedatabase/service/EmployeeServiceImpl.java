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
	public void invokeAddEmployee(Employee employee) {
		
		dao.addEmployee(employee);
	}

	@Override
	public void invokeUpdateEmployee(Employee employee) {
		
		dao.updateEmployee(employee);
	}
	
	@Override
	public void invokeRemoveEmployee(int employeeId) {

		dao.removeEmployee(employeeId);
	}

}
