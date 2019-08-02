package service;

import model.Employee;

public interface EmployeeService {

	void invokeAddEmployee(Employee employee);

	void invokeUpdateEmployee(Employee employee);
	
	Employee invokeGetEmployeeById(int employeeId);
	
	void invokeRemoveEmployee(int employeeId);
	
}
