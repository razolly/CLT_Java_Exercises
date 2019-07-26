package day10;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

	Dog dog;
	
	// @Test
	public void testFail() {

		// Immediately fail the test case
		fail("Not yet implemented");
	}

	/*
	 * This is run before all test cases Should be used to 
	 * initialize your test objects
	 */
	@Before 
	public void setUp() {
		
		System.out.println("This is run before the test cases!");
		dog = new Dog("Jim", "Bulldog");
	}

	@Test
	public void testDogName() {

		// Run the method you want to test
		Dog aDog = new Dog("Henry", "Golden Retriever");

		// Assert that the name is equal
		// 1st arg: Error message
		// 2nd arg: Expected value
		// 3rd arg: Actual value
		assertEquals("Error in creating a dog", "Henry", aDog.getName());
	}

	@Test
	public void testDogFeeding() {

		dog.setWeight(10);
		dog.eat();
		
		assertEquals("Error: Wrong weight!", 15, dog.getWeight());
	}

	@After
	public void tearDown() {
		
		System.out.println("This is run after all the test cases!");
	}

}










