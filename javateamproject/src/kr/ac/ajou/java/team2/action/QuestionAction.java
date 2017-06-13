package kr.ac.ajou.java.team2.action;

public interface QuestionAction {

	
	public boolean checkAnswer(int questionNum,String userAnswer);
	public String putQuestion(int questionNum);
	
}
