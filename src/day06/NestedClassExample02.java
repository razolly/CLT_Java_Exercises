package day06;

public class NestedClassExample02 {

	class MyInnerClass1 {
		void myMethod1() {
			System.out.println("I am in MyInnerClass1 ==> myMethod1");
		}
//		static void myMethod2() {
//			// Compilation error, we cannot write static method in 
//			// non-static inner class
//		}
	} 
	
	static class MyInnerClass2 {
		void myMethod3() {
			System.out.println("I am in MyInnerClass2 ==> myMethod3");

		}
		static void myMethod4() {
			System.out.println("I am in MyInnerClass2 ==> myMethod4");
		}
	} 
	
	void access() {
		
		class MyInnerClass3 {
			void myMethod5() {
				System.out.println("I am in MyInnerClass3 ==> myMethod5");
			}
//			static void myMethod6() {
//				// Compilation error, we cannot write static method in 
//				// non-static inner class
//			}
		}
		
		new MyInnerClass3().myMethod5();
		
	}
	
	void displayAllMethods() {
		// Display method 1
		new MyInnerClass1().myMethod1();
		
		// Display method 3
		MyInnerClass2 ic = new MyInnerClass2();
		ic.myMethod3();
		
		// Display method 4
		NestedClassExample02.MyInnerClass2.myMethod4();
		
		// Display method 5
		access();
	}
	
	public static void main(String[] args) {

		new NestedClassExample02().displayAllMethods();
		
	}

}
