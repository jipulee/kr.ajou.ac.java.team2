package kr.ac.ajou.java.team2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.ac.ajou.java.team2.Model.User;
import kr.ac.ajou.java.team2.db.DBConnection;

public class ScoreDAO {

	public void updateUser(int score,int id) throws SQLException{
		Connection conn = DBConnection.getConnection();
		String sql =""+
					" update  user "+
					" set score=? "+
					" where id = ? ";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setInt(1,score);
		ptmt.setInt(2, id);
		ptmt.execute();
		
		
	}
}
