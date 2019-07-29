package packageC;

import java.util.Scanner;

public class QuizView {

	Scanner sc;

	public QuizView() {
		sc = new Scanner(System.in);
	}

	void displayQuestion(Question question) {
		System.out.println();
		System.out.println(question.getQuestion());
		System.out.println("A: " + question.getOptions().get(0));
		System.out.println("B: " + question.getOptions().get(1));
		System.out.println("C: " + question.getOptions().get(2));
		System.out.println("D: " + question.getOptions().get(3));
	}

	String requestAnswer() {

		String answer = " ";
		boolean isAnswerValid = false;

		while (!isAnswerValid) {
			try {
				System.out.print("\nEnter your choice: ");
				answer = sc.next();
				if (answer.length() > 1) {
					throw new Exception();
				}
				isAnswerValid = true;
			} catch (Exception e) {
				sc.hasNext(); // Clear buffer
				System.out.println("Invalid input!");
				System.out.print("\nEnter your choice: ");
			}
		}

		return answer;
	}

	void displayScore(int score) {
		System.out.println("\nYour score is: " + score + "/5");
	}

	void displayCorrect() {
		System.out.println("Correct!");
	}

	void displayWrong() {
		System.out.println("Incorrect!");
	}
}
