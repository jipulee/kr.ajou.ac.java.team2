package kr.ac.ajou.java.team2.action;

import java.sql.SQLException;
import java.util.List;

import kr.ac.ajou.java.team2.Model.User;
import kr.ac.ajou.java.team2.dao.UserDAO;

public class RegisterAction {
	
	UserDAO userDao = new UserDAO();
	
	public void Register(String name ,String password,String realname){

		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setRealname(realname);
	
		try {
			userDao.addUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public int checkUserName(String userName,String password,String realname){
		int a =3;
		List<User> users = null;
		try {
			users = userDao.queryUser();
			}
		 catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		if(userName.equals("")||password.equals("")||realname.equals("")){
			return a=1;
		}else{
			
			for (int i = 0; i < users.size(); i++) {
				if(users.get(i).getName().equals(userName)){	
					return a=2;
				}
			}
			
			return a;
		}
	}	
}
