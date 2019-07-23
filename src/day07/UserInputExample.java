package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput {

	void userAccess() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Enter a character: ");
//		char c = br.readLine().charAt(2);
//		System.out.println(c);
		
		System.out.print("Enter a number: ");
		int number = Integer.parseInt(br.readLine());
		
		System.out.println(number);
	}
}

public class UserInputExample {

	public static void main(String[] args) throws IOException {
		UserInput u = new UserInput();
		u.userAccess();
	}

}
