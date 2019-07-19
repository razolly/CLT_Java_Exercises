package day01;

public class Customer {

	int age;
	String nric;
	
	public void customerDetails(int age, String nric) {
		System.out.println(age);
		System.out.println(nric);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer refCustomer = new Customer();
		refCustomer.customerDetails(10,"S9874758G");
	}
	
	

}
