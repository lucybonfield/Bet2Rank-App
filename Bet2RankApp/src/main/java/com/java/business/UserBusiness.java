package com.java.business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.to.User;

public class UserBusiness {
	public static User login(Connection conn, String username, String password) throws SQLException {
		String sql = "SELECT Username, Password FROM users WHERE Username = ? AND Password = ?";
		
		PreparedStatement stm = conn.prepareStatement(sql);
		
		int i = 1;
		stm.setString(i++, username);
		stm.setString(i++, password);
		
		ResultSet rs = stm.executeQuery();
		
		if(rs.next()) {
			User u = new User();
			u.setUsername(rs.getString("Username"));
			u.setPassword(rs.getString("Password"));
			
			return u;
		}
		return null;
	}
	
	public static int register(Connection conn, String username, String email, String password) throws SQLException {
		String sql = "INSERT INTO users(Username, Email, Password) VALUES('"+ username + "','" + email+ "','" + password + "')";
		PreparedStatement stm = conn.prepareStatement(sql);

		int sqlUpdate = stm.executeUpdate(sql);
			
		return sqlUpdate;	
	
	}
	
	public static List<User> getUsersList(Connection conn) throws SQLException {
		String sql = "SELECT Username, SuccessRate FROM users ORDER BY SuccessRate DESC LIMIT 15";
		
		PreparedStatement stm = conn.prepareStatement(sql);
		
		ResultSet rs = stm.executeQuery();
		
		List<User> list = new ArrayList<User>();
		
		while (rs.next()) {
			User u = new User();
			u.setUsername(rs.getString("Username"));
			u.setSuccessRate(rs.getString("SuccessRate"));
			
			list.add(u);
			
		} 
		return list;
	} 
	
	public static boolean isUserExisted(Connection conn, String username) throws SQLException {
		String sql = "SELECT Username FROM users WHERE Username=" + username + "";
		
		PreparedStatement stm = conn.prepareStatement(sql);
		stm.setString(1, username);
		ResultSet rs = stm.executeQuery();
		
		if (rs.next()) {
			return true;
			
		} 
		return false;
	}
	
	public static void deleteUser(Connection conn, String username) throws SQLException {
		String sql = "DELETE FROM users WHERE username= ?";
		System.out.println(sql);
		
		PreparedStatement stm = conn.prepareStatement(sql);
		int i = 1;
		
		stm.setString(i++, username);
		
		stm.executeUpdate();
		stm.close();
	}


}
