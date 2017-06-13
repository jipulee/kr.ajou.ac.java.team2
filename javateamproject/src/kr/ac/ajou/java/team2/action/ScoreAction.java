package kr.ac.ajou.java.team2.action;

import java.sql.SQLException;

import kr.ac.ajou.java.team2.dao.ScoreDAO;

public class ScoreAction{
	
	ScoreDAO scoreDAO = new ScoreDAO();
	LoginAction la = new LoginAction();

	public int scoreCalculation(int part,boolean boo[]){
		int score = 0;
		if(part==1){
			for(int i = 0;i<boo.length;i++){
				if(boo[i]==true){
					score +=3;
				}
			}
		}else{
			for(int i = 0;i<boo.length;i++){
				if(boo[i]==true){
					score +=4;
				}
			}
		}
		
		return score;
	}
	
	public void saveScoreA(int score) throws SQLException{
		
		scoreDAO.updateUser(score ,la.getId());
		
	}
	
	public void saveScoreB(int score) throws SQLException{
		
		scoreDAO.updateUserB(score ,la.getId());
		
	}
}
