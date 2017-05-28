package kr.ac.ajou.java.team2.action;

import java.util.List;

import kr.ac.ajou.java.team2.Model.User;
import kr.ac.ajou.java.team2.dao.UserDAO;

public class LoginAction {
	
	
	public boolean checkUser(String name ,String password) throws Exception{
		
		UserDAO userdao = new UserDAO();
		List<User> users = userdao.queryUser();
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getName().equals(name)&&users.get(i).getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}
	
}
