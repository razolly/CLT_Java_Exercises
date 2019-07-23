package day03;

class Visa {
	
	void ageLimit() {
		System.out.println("Age should not be less than 18");
	}
	
	int ageLimit(int maxAge) {
		return maxAge;
	}
	
	void displayCardNo(String cardNo) {
		System.out.println("Card number is " + cardNo);
	} 
}

class CitiBank extends Visa {
	
	@Override
	int ageLimit(int maxAge) {
		return maxAge;
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		
		CitiBank cb = new CitiBank();
		cb.displayCardNo("122 220 441");
	}

}
