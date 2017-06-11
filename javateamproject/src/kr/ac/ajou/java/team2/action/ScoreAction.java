package kr.ac.ajou.java.team2.action;

import java.sql.SQLException;

import kr.ac.ajou.java.team2.dao.ScoreDAO;

public class ScoreAction{
	
	ScoreDAO scoreDAO = new ScoreDAO();
	LoginAction la = new LoginAction();

	public int scoreCalculation(boolean boo[]){
		int score = 0;
		for(int i = 0;i<boo.length;i++){
			if(boo[i]==true){
				score +=5;
			}
		}
		
		return score;
	}
	
	public void saveScore(int score) throws SQLException{
		
		scoreDAO.updateUser(score ,la.getId());
		
	}
}
