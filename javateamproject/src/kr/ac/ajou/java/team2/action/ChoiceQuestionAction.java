package kr.ac.ajou.java.team2.action;

import java.sql.SQLException;

import kr.ac.ajou.java.team2.Model.ChoiceQuestion;
import kr.ac.ajou.java.team2.dao.ChoiceQuestionDAO;

public class ChoiceQuestionAction {

	ChoiceQuestionDAO choiceQuestionDAO = new ChoiceQuestionDAO();
	public boolean checkAnswer(int questionNum,String userAns) throws SQLException{
				
			ChoiceQuestion cq = choiceQuestionDAO.getChoiceQuestion(questionNum);
			if(cq.getChoiceQuestionAnswer().equals(userAns)){
				return true;
			}else{
				return false;
			}	
			
	}
	
}
