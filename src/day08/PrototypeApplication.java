package day08;

import java.util.Scanner;

public class PrototypeApplication {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID: ");
		int employeeId = sc.nextInt();
		
		System.out.print("Enter Employee Name: ");
		String employeeName = sc.next();
		
		System.out.print("Enter Employee Designation: ");
		String employeeDesignation = sc.next();
		
		// Create Employee 1 with given detail
		EmployeeDetails empDetail1 = new EmployeeDetails();
		empDetail1.setEmpId(employeeId);
		empDetail1.setEmpName(employeeName);
		empDetail1.setDesignation(employeeDesignation);
		empDetail1.showRecord();
		
		// Create Employee 2 by cloning Employee 1
		EmployeeDetails empDetail2 = (EmployeeDetails) empDetail1.clone();
		empDetail2.showRecord();
	}

}
