package day03;

class MyGenericClass {
	void genericMethod(Object o) {
		System.out.println(o);
	}
}

public class WrapperClassExample {

	public static void main(String[] args) {
		
		MyGenericClass c = new MyGenericClass();
		
		int numberVariable = 20;
		Integer numberRef = numberVariable;
		
		c.genericMethod(numberRef);
		
		String reference = "Java";
		c.genericMethod(reference);
		
		Person refPerson = new Person();
		c.genericMethod(refPerson);
		
		Long refLong = (long) 50000;
		c.genericMethod(refLong);

	}

}
