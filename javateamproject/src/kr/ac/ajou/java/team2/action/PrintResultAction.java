package kr.ac.ajou.java.team2.action;

import java.sql.SQLException;

import kr.ac.ajou.java.team2.Model.User;
import kr.ac.ajou.java.team2.dao.UserDAO;

public class PrintResultAction {
	
	UserDAO userdao = new UserDAO();
	LoginAction la = new LoginAction();
	User user = null;

	public int getScoreA(){
		try {
			user = userdao.getUser(la.getId());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user.getScoreA();
	}
	
	public int getScoreB(){
		try {
			user = userdao.getUser(la.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user.getScoreB();
	}
	
	public int getId(){
		try {
			user = userdao.getUser(la.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user.getId();
	}
	
	public String getName(){
		try {
			user = userdao.getUser(la.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user.getRealname();
	}
	
	
	
	
}
