package kr.ac.ajou.java.team2.action;

import java.sql.SQLException;

import kr.ac.ajou.java.team2.Model.Question;
import kr.ac.ajou.java.team2.dao.PartBQuestionDAO;

public class PartBQuestionAction implements QuestionAction {
	
	PartBQuestionDAO qdao = new PartBQuestionDAO();
	Question q = null;

	
	@Override
	public boolean checkAnswer(int questionNum, String userAnswer) {
		try {
			q = qdao.getQuestion(questionNum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(q.getCorrectAnswer().equals(userAnswer)){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public String putQuestion(int questionNum) {
		String question = "";
		try {
			q = qdao.getQuestion(questionNum);
			question = q.getQuestion();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return question;
	}

}
