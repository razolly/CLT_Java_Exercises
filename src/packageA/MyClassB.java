package packageA;

public class MyClassB {

	void accessMyClassA() {
		
		MyClassA a = new MyClassA();
		
		//System.out.println(a.number1); // can't because private
		System.out.println(a.number2); // can because default 
		System.out.println(a.number3); // can because protected
		System.out.println(a.number4); // can because public
	}

}
