package day07;

class Person {
	
	String name;
	
	Person(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class StringClassExample {

	String ref1 = "Python";
	String ref2 = "Python";
	
	String ref3 = new String("Scala");
	String ref4 = new String("Scala");
	
	Person ref5 = new Person("Java");
	Person ref6 = new Person("Java");

//	void scenario1() {
//		if (ref3 == ref4) {
//			System.out.println("Same");
//		} else {
//			System.out.println("Different");
//		}
//	}
	
	void scenario2() {
		if (ref5.equals(ref6)) {
			System.out.println(ref5.hashCode());
			System.out.println(ref6.hashCode());
			System.out.println("Same");
		} else {
			System.out.println(ref5.hashCode());
			System.out.println(ref6.hashCode());
			System.out.println("Different");
		}
	}

	public static void main(String[] args) {
		
		StringClassExample s = new StringClassExample();
		//s.scenario1();
		s.scenario2();
	}

}
