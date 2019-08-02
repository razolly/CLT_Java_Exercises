package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {

	void invokeAddEmployee(Employee employee);

	void invokeUpdateEmployee(Employee employee);
	
	Employee invokeGetEmployeeById(int employeeId);
	
	List<Employee> invokeListEmployees();
	
	void invokeRemoveEmployee(int employeeId);
	
}
