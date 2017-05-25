/**
 * 
 */
package kr.ac.ajou.java.team2;

/**
 * @author Khalil
 *
 */

public class ChoiceQuestion {
	
	private String[] rigthAnswer = {"aaa","bbb","ccc"};
	private String[] questions = {"aaa","bbb","ccc"};
	private String[][] wrongAnswer = {{"zzz","xxx","ccc"},{"vvv","bbb","nnn"},{"mmm","qqq","eee"}};
	private String[] userAnswer;
	
	public String getQuestion(int questionAdress){
		
		return questions[questionAdress];
		
	}
	
	/*
	public String[] getAnswer(int questionAdress){
		String[] answer;
		
		return 
	}
*/
}
