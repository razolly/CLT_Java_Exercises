package day03;

class Bank {
	
	Bank(String location) {
		System.out.println("Default constructor of Bank " + location);
	}
}

class DigitalBank extends Bank {
	
	DigitalBank(String location, int officeNo) {
		super(location);
		System.out.println("Default constructor of Digital " + location + 
				" " + officeNo);
	}
	
}

class ChildClassOfDigitalBank extends DigitalBank {
	
	ChildClassOfDigitalBank(String location, int officeNo, boolean isRetail) {
		super(location, officeNo);
		System.out.println("Default constructor of Child " + location +
				" " + officeNo);
		if(isRetail) {
			System.out.println("This is a retail bank");
		} else {
			System.out.println("This is not a retail bank");
		}
	}
}

public class InheritanceExample03 {

	public static void main(String[] args) {
		new ChildClassOfDigitalBank("UOB", 100000, true);
			
	}

}
