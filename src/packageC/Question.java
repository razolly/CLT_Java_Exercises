package packageC;

import java.util.ArrayList;

public class Question {

	String question;
	ArrayList<String> options;
	String answer;
	
	public Question(String question, 
			String optionA,
			String optionB,
			String optionC,
			String optionD,
			String answer) {
		this.question = question;
		
		options = new ArrayList<String>();
		options.add(optionA);
		options.add(optionB);
		options.add(optionC);
		options.add(optionD);
		
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public ArrayList<String> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
