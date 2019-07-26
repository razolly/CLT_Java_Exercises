package day10;

class User extends Throwable {
	
	String name;

	public User(String name) {
		this.name = name;
	}

	static void validateAge(int age) {
		if (age < 18) {
			User user = new User("John");
			try {
				throw user;
			} catch (User e) {	// You can use the members of thrown User 
				System.out.println(e.name + " cant be less than 18!");
			} finally {
				System.out.println("Closing file...");
			}
		}
	}

}

public class ThrowExample {

	public static void main(String[] args) {

		User.validateAge(11);
	}

}
