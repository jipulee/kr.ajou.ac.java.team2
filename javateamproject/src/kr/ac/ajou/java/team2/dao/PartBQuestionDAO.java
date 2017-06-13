package kr.ac.ajou.java.team2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.ac.ajou.java.team2.Model.ChoiceQuestion;
import kr.ac.ajou.java.team2.Model.Question;
import kr.ac.ajou.java.team2.db.DBConnection;

public class PartBQuestionDAO {

	
	public Question getQuestion(Integer choiceQuestionNum) throws SQLException{
		Connection conn = DBConnection.getConnection();
		Question question = null;
		String sql =""+
					"select * from partbquestion " +
					" where questionNum =? ";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setInt(1, choiceQuestionNum);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			question = new ChoiceQuestion();
			question.setQuestionNum(rs.getInt("questionNum"));
			question.setCorrectAnswer(rs.getString("correctAnswer"));
			question.setQuestion(rs.getString("question"));
		}
		return question;
	}
	
}
