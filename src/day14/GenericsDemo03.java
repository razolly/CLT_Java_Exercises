package day14;

class GenericA<T> {

	T object;

}

class GenericB {

	Object object;

	public GenericB(Object object) {
		this.object = object;
	}
	
}

public class GenericsDemo03 {

	public static void main(String[] args) {
		
		GenericB obj = new GenericB(1);
		
		// Have to downcast
		Integer i = (Integer) obj.object;

	}

}
