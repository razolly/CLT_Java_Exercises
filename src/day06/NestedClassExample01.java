package day06;


class JPMorgan {

	void adminAccess() {	// // non-static inner class
		
		class AdminJPMC {
			void display() {
				System.out.println("I am the Admin display method!");
			}
		}
		
		new AdminJPMC().display();
	}
	
	static void adminAccess2() {	// static inner class
		
		class FinanceJPMC {
			void display() {
				System.out.println("I am the Finance display method!");
			}
		}
		
		new FinanceJPMC().display();
	}
	
}

public class NestedClassExample01 {

	public static void main(String[] args) {

		new JPMorgan().adminAccess();
		
		JPMorgan.adminAccess2();
		
	}

}
