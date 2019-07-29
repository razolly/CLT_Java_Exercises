package packageC;

import java.util.ArrayList;

public class QuestionDaoImpl implements QuestionDao {

	int score;
	
	// Acts as database
	ArrayList<Question> database;
	
	// Initialize database
	public QuestionDaoImpl() {
		
		score = 0;
		database = new ArrayList<Question>();
		
		database.add(new Question("Which of these are selection statements in Java?", 
				"if()", 
				"for()", 
				"continue", 
				"break", 
				"A"));
		database.add(new Question("Which of these jump statements can skip processing the remainder of the code in its body for a particular iteration?", 
				"break", 
				"return", 
				"exit", 
				"continue", 
				"C"));
		database.add(new Question("Which of this statement is incorrect?", 
				"switch statement is more efficient than a set of nested ifs", 
				"two case constants in the same switch can have identical values", 
				"switch statement can only test for equality, whereas if statement can evaluate any type of boolean expression", 
				"it is possible to create a nested switch statements", 
				"B"));
		database.add(new Question("Which of the following is not OOPS concept in Java?", 
				"Inheritance", 
				"Encapsulation", 
				"Polymorphism", 
				"Compilation", 
				"C"));
		database.add(new Question("When does method overloading is determined?", 
				"At run time", 
				"At compile time", 
				"At coding time", 
				"At execution time", 
				"B"));
	}
	
	@Override
	public Question getQuestion(int position) {
		
		return database.get(position);
	}
	
	@Override
	public void addScore() {
		score++;
	}

	@Override
	public int getScore() {
		return score;
	}

}
