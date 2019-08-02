package controller;

import java.sql.SQLException;
import java.util.Scanner;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class EmployeeController {

	EmployeeService service;
	Scanner sc;

	public EmployeeController() {
		initializeComponents();
	}

	public void start() {

		System.out.println("Welcome to Optimum Solutions Admin!");
		System.out.println("Add an employee: ");

		// Get ID
		System.out.print("Enter employee ID: ");
		int employeeId = sc.nextInt();

		// Get Name
		System.out.print("Enter employee name: ");
		String employeeName = sc.nextLine();

		// Get Password
		System.out.print("Enter employee password: ");
		String employeePassword = sc.next();

		// Get Date of Birth
		System.out.print("Enter employee date of birth (DD/MM/YYYY): ");
		String employeeDOB = sc.next();
		
		// Create Employee object and store values
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(employeeName);
		employee.setPassword(employeePassword);
		employee.setDateOfBirth(employeeDOB);
		
		// Pass Employee to service to store in database
		service.addEmployee(employee);

	}

	private void initializeComponents() {

		// Create service
		try {
			service = new EmployeeServiceImpl();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Create scanner
		sc = new Scanner(System.in);
	}

}
