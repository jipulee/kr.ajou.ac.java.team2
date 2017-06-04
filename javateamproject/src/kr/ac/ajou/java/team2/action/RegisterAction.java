package kr.ac.ajou.java.team2.action;

import java.sql.SQLException;

import kr.ac.ajou.java.team2.Model.User;
import kr.ac.ajou.java.team2.dao.UserDAO;

public class RegisterAction {
	
	public void Register(String name ,String password,String realname){

		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setRealname(realname);
		
		UserDAO userDao = new UserDAO();
		try {
			userDao.addUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
