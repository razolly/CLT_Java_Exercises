package packageC;

public class QuizController {

	QuizView view;
	QuestionDao dao;

	public QuizController() {
		view = new QuizView();
		dao = new QuestionDaoImpl();
	}

	void start() {

		Question currentQuestion;

		for (int index = 0; index < 5; index++) {
			
			// Get question according to loop index
			currentQuestion = dao.getQuestion(index);

			// Display question
			view.displayQuestion(currentQuestion);
			
			// Get users answer
			String userChoice = view.requestAnswer();
			System.out.println();

			// Check if answer was correct
			if (checkIfAnswerCorrect(currentQuestion, userChoice)) {
				view.displayCorrect();
				dao.addScore();
			} else {
				view.displayWrong();
			}
		}
		
		// Display score
		view.displayScore(dao.getScore());
	}

	boolean checkIfAnswerCorrect(Question question, String choice) {
		
		if (choice.equals(question.getAnswer())) {
			return true;
		} else {
			return false;
		}
	}
}
