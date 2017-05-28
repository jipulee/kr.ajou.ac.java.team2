package kr.ac.ajou.java.team2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	private static final String URL="jdbc:mysql://127.0.0.1:3306/javatest";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static Connection conn = null;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn  = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection(){
		return conn;
	}
	
//	public void DataBaseConncetion(){
//		
//
//		
//		Statement stmt = conn.createStatement();
//		ResultSet nameRs= stmt.executeQuery("select name from user");
//		ResultSet passwordRs= stmt.executeQuery("select password from user");
//		
//	}
	

}
