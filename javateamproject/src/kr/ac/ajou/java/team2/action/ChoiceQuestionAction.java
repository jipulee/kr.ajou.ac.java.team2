package kr.ac.ajou.java.team2.action;

import java.sql.SQLException;

import kr.ac.ajou.java.team2.Model.ChoiceQuestion;
import kr.ac.ajou.java.team2.dao.ChoiceQuestionDAO;
import kr.ac.ajou.java.team2.dao.ScoreDAO;

public class ChoiceQuestionAction implements QuestionAction{
	ChoiceQuestionDAO cqdao=new ChoiceQuestionDAO();
	ChoiceQuestion cq;
	
	@Override
	public String putQuestion(int questionNum){
		String question = "";
		try {
			 cq= cqdao.getChoiceQuestion(questionNum);
			 question = cq.getQuestion();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return question;
		
	}
	
	public String putAnwerA(int questionNum){
		String answerA = "";
		try {
			 cq= cqdao.getChoiceQuestion(questionNum);
			 answerA= cq.getAnwerA();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return answerA;
		

	}
	
	public String putAnswerB(int questionNum){
		
		String answerB= "";
		try {
			 cq= cqdao.getChoiceQuestion(questionNum);
			 answerB= cq.getAnswerB();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return answerB;
	}
	public String putAnwerC(int questionNum){
		
		String answerC = "";
		try {
			 cq= cqdao.getChoiceQuestion(questionNum);
			 answerC= cq.getAnswerC();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return answerC;
	}
	
	public String putAnwerD(int questionNum){
	
		String answerD= "";
		try {
			 cq= cqdao.getChoiceQuestion(questionNum);
			 answerD= cq.getAnswerD();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return answerD;
	}
	

	@Override
	public boolean checkAnswer(int questionNum, String userAnswer) {
		boolean rightOrNot=true;
		try {
			cq = cqdao.getChoiceQuestion(questionNum);
			if(cq.getCorrectAnswer().equals(userAnswer)){
				rightOrNot = true;
			}else{
				rightOrNot=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rightOrNot;
	}
	

	
}
