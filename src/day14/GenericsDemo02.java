package day14;

import java.util.ArrayList;

class IntegerGroup {

	int[] arrayOfIntegers;

	public IntegerGroup(int[] arrayOfIntegers) {
		this.arrayOfIntegers = arrayOfIntegers;
	}

}

class StringGroup {

	String[] arrayOfStrings;

	public StringGroup(String[] arrayOfStrings) {
		this.arrayOfStrings = arrayOfStrings;
	}
}

class BooleanGroup {

	boolean[] arrayOfBoolean;

	public BooleanGroup(boolean[] arrayOfBoolean) {
		this.arrayOfBoolean = arrayOfBoolean;
	}
}

class UserGroup {

	User[] arrayOfUsers;

	public UserGroup(User[] arrayOfUsers) {
		this.arrayOfUsers = arrayOfUsers;
	}
}

class Group<T> {

	T[] arrayOfAnyType;

	public Group(T[] arrayOfAnyType) {
		this.arrayOfAnyType = arrayOfAnyType;
	}

}

public class GenericsDemo02 {

	public static void main(String[] args) {

//		// Create a group of integers
//		int someIntArray[] = {1,2,3};
//
//		// Create a group of Strings
//		String someStringArray[] = {"AAA", "BBB", "CCC"};
//		
//		// Create a group of booleans
//		boolean someBooleanArray[] = {true, true, false};
//		
//		// Create a group of Users
//		User u1 = new User("Alex", 10);
//		User u2 = new User("Barry", 20);
//		User u3 = new User("Charlie", 30);
//		User someUserGroup[] = {u1, u2, u3};
//		
//		IntegerGroup g1 = new IntegerGroup(someIntArray);
//		StringGroup  g2 = new StringGroup(someStringArray);
//		BooleanGroup g3 = new BooleanGroup(someBooleanArray);
//		UserGroup    g4 = new UserGroup(someUserGroup);

		// Create an array of integers
		Integer[] someIntArray = { 1, 2, 3 };

		// Create an array of Strings
		String someStringArray[] = { "AAA", "BBB", "CCC" };

		// Create an array of booleans
		Boolean[] someBooleanArray = { true, true, false };

		// Create an array of Users
		User u1 = new User("Alex", 10);
		User u2 = new User("Barry", 20);
		User u3 = new User("Charlie", 30);
		User someUserArray[] = { u1, u2, u3 };
		
//		Group g1 = new Group<Integer>(someIntArray); 
//		Group g2 = new Group<String>(someStringArray); 
//		Group g3 = new Group<Boolean>(someBooleanArray); 
//		Group g4 = new Group<User>(someUserArray); 
		
		ArrayList g1 = new ArrayList<Integer>();
		ArrayList g2 = new ArrayList<String>();
		ArrayList g3 = new ArrayList<Boolean>();
		ArrayList g4 = new ArrayList<User>();

	}

}
















