package day04;


abstract class Oracle {
	abstract void driverConnection();
}

abstract class Microsoft {
	abstract void getSoftware();
}

class MyClass{

	void display(){
		Oracle oracleRef = new Oracle() {
			@Override
			void driverConnection() {
				System.out.println("Oracle driver connected");
			}
		};
		
		oracleRef.driverConnection();
		
		Microsoft microsoftRef = new Microsoft() {
			@Override
			void getSoftware() {
				System.out.println("Microsoft software detected");
			}
		};
		
		microsoftRef.getSoftware();
	}
}

public class AbstractClassExample02 {

	public static void main(String[] args) {

		new MyClass().display();
	}

}
