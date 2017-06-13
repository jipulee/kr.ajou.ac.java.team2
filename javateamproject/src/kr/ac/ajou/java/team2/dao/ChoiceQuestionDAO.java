package kr.ac.ajou.java.team2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.ac.ajou.java.team2.Model.ChoiceQuestion;
import kr.ac.ajou.java.team2.Model.Question;
import kr.ac.ajou.java.team2.Model.User;
import kr.ac.ajou.java.team2.db.DBConnection;

public class ChoiceQuestionDAO {

	public ChoiceQuestion getChoiceQuestion(Integer choiceQuestionNum) throws SQLException{
		Connection conn = DBConnection.getConnection();
		ChoiceQuestion choiceQuestion = null;
		String sql =""+
					"select * from choicequestion " +
					" where questionNum =? ";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setInt(1, choiceQuestionNum);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			choiceQuestion = new ChoiceQuestion();
			choiceQuestion.setQuestionNum(rs.getInt("questionNum"));
			choiceQuestion.setCorrectAnswer(rs.getString("correctAnswer"));
			choiceQuestion.setAnwerA(rs.getString("answerA"));
			choiceQuestion.setAnswerB(rs.getString("answerB"));
			choiceQuestion.setAnswerC(rs.getString("answerC"));
			choiceQuestion.setAnswerD(rs.getString("answerD"));
			choiceQuestion.setQuestion(rs.getString("question"));
		}
		
		return choiceQuestion;
	}
	
	
}
