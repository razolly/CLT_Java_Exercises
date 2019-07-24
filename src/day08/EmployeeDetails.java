package day08;

public class EmployeeDetails implements MyPrototype {

	int empId;
	String empName;
	String designation;

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public MyPrototype clone() throws CloneNotSupportedException {
		System.out.println("Cloning...");
		return (MyPrototype) super.clone();
	}
	
	void showRecord() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Designation: " + designation);
	}

}
