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

		System.out.println("=======================================");
		System.out.println("Welcome to Optimum Solutions Admin!");
		System.out.println("=======================================");
		System.out.println("Select option: ");
		System.out.println("1) Add an employee");
		System.out.println("2) Update an employee");
		System.out.println("3) Get employee by ID");
		System.out.println("4) Delete an employee");
		System.out.print("\nYour choice: ");
		
		int userChoice = sc.nextInt();
		
		switch (userChoice) {
		
		case 1: addEmployee();
			break;
		case 2: updateEmployee();
			break;
		case 3: getEmployeeById();
			break;
		case 4: removeEmployee();
			break;
		default:
			break;
		}

	}

	private void removeEmployee() {
		
		// Get ID
		System.out.print("\nEnter employee ID: ");
		int employeeId = sc.nextInt();
		sc.nextLine();	// Clear buffer
		
		// Pass EmployeeID to service to delete from database
		service.invokeRemoveEmployee(employeeId);
		
	}
	
	private void getEmployeeById() {
		
		// Get ID
		System.out.print("\nEnter employee ID: ");
		int employeeId = sc.nextInt();
		sc.nextLine();	// Clear buffer
		
		// Pass EmployeeID to service to search in database
		service.invokeGetEmployeeById(employeeId);
	}
	
	private void updateEmployee() {
		
		// Get ID
		System.out.print("\nEnter employee ID: ");
		int newEmployeeId = sc.nextInt();
		sc.nextLine();	// Clear buffer
		
		// TODO check if employee exists using getEmployeeById
		
		// Get new Name
		System.out.print("Enter new employee name: ");
		String newEmployeeName = sc.nextLine();

		// Get new Password
		System.out.print("Enter new employee password: ");
		String newEmployeePassword = sc.next();

		// Get new Date of Birth
		System.out.print("Enter new employee date of birth (DD/MM/YYYY): ");
		String newEmployeeDOB = sc.next();
		
		// Create Employee object and store values
		Employee employee = new Employee();
		employee.setEmployeeId(newEmployeeId);
		employee.setEmployeeName(newEmployeeName);
		employee.setPassword(newEmployeePassword);
		employee.setDateOfBirth(newEmployeeDOB);
		
		// Find and update employee 
		service.invokeUpdateEmployee(employee);
	}

	private void addEmployee() {
		
		// Get ID
		System.out.print("\nEnter employee ID: ");
		int employeeId = sc.nextInt();
		sc.nextLine();	// Clear buffer

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
		service.invokeAddEmployee(employee);
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
