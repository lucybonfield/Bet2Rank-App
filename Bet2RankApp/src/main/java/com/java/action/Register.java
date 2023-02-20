package com.java.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.java.business.UserBusiness;
import com.java.to.User;
import com.java.util.DBUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Connection conn = DBUtil.getConnection();
			int u = UserBusiness.register(conn, username, email, password);
			if(u > 0) {			
				response.sendRedirect("login.jsp");
			} else {
				response.sendRedirect("/Bet2RankApp/register.jsp");
				System.out.println(username + password);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
