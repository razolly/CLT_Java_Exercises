package packageB;

import packageA.MyClassA;

public class MyClassC extends MyClassA{

	void accessMyClassA() {

		MyClassA a = new MyClassA();

//		System.out.println(a.number1); // can't because private && diff package
//		System.out.println(a.number2); // can't because default && diff package
		System.out.println(super.number3);   // can because protected && child class
		System.out.println(a.number4); // can because public
	}
}
