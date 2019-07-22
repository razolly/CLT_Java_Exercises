package day06;

class Single {
	static Single instance;
	
	private Single() {
		System.out.println("Singleton created!");
	}
	
	static Single getSingleton() {
		if(instance == null) {
			instance = new Single();
		}
		return instance;
	}
}

public class Singletonne {

	public static void main(String[] args) {
		Single.getSingleton();
	}

}
