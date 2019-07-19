package day01;

class StaticNonStaticDemo {
	int variable1 = 50;
	static int variable2 = 60;
	
	void showVariables() {
		// Call variable1 and variable2
		System.out.println(variable1);
		System.out.println(variable2);
	} 
	
	static String reference1 = "Python";
	String reference2 = "Java";
	
	static void showReferences() {
		// Call reference1 and reference2
		System.out.println(StaticNonStaticDemo.reference1);
		
		StaticNonStaticDemo s = new StaticNonStaticDemo();
		System.out.println(s.reference2);
	} 
	
} 

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStaticDemo.showReferences();
		
		new StaticNonStaticDemo().showVariables();
	
	}

}
