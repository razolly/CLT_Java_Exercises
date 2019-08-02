package service;

import model.Employee;

public interface EmployeeService {

	void invokeAddEmployee(Employee employee);

	void invokeUpdateEmployee(Employee employee);
	
	void invokeRemoveEmployee(int employeeId);
	
}
