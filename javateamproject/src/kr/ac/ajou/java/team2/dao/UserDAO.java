package kr.ac.ajou.java.team2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.ac.ajou.java.team2.Model.User;
import kr.ac.ajou.java.team2.db.DBConnection;

public class UserDAO {

	public void addUser(){
		
		
		
	}
	
	public void updateUser(){
		
		
	}
	
	public void delUser(){
		
		
	}
	
	public List<User> queryUser() throws Exception{
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery("select name,password from user");
		
		List<User> users = new ArrayList<User>();
		User user = null;
		
		while(rs.next()){
			user = new User();
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));	
			
			users.add(user);	
		}
		return users;
	}
	
}
