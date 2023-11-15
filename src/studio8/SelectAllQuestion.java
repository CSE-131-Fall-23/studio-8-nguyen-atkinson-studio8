package studio8;

public class SelectAllQuestion extends MultipleChoiceQuestion {

	public SelectAllQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points, choices);

	}

	public int checkAnswer(String givenAnswer) {
		//FIXME Should return partial credit (if earned)!
		int points = 0;
		if(givenAnswer.length() > this.getAnswer().length()) {
		for(int i = 0; i< givenAnswer.length(); i++) {
			for(int j = 0; j<getAnswer().length(); j++) {
				char ans = getAnswer().charAt(j);
				if(givenAnswer.indexOf(ans) < 0) {
					points = points -1;
					}
				else {
					points = 
				}
			}
		}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		String[] choices = {"instance variables", "git", "methods", "eclipse"};
		Question selectAll = new SelectAllQuestion("Select all of the following that can be found within a class:", "13", 6, choices);
		selectAll.displayPrompt();
		System.out.println(selectAll.checkAnswer("hi")); //no credit
		System.out.println(selectAll.checkAnswer("13")); //full credit
		System.out.println(selectAll.checkAnswer("31")); //full credit
		System.out.println(selectAll.checkAnswer("1")); //3 points
		System.out.println(selectAll.checkAnswer("3")); //3 points
		System.out.println(selectAll.checkAnswer("23")); //2 points
		System.out.println(selectAll.checkAnswer("34")); //2 points
		System.out.println(selectAll.checkAnswer("4")); //1 point
		System.out.println(selectAll.checkAnswer("124")); //1 point
		System.out.println(selectAll.checkAnswer("24")); //0 points
		
	}
}
