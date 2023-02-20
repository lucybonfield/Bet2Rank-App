package com.java.action;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

import com.java.business.UserBusiness;
import com.java.to.User;
import com.java.util.DBUtil;


public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			Connection conn = DBUtil.getConnection();
			User u = UserBusiness.login(conn, username, password);
			if (u != null) {
				request.getSession().setAttribute("CURRENT_USER", u);
				conn.close();
				response.sendRedirect("/Bet2RankApp/Leaderboard?action=list");
			} else {
				request.setAttribute("err", "Wrong username or password.");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			request.setAttribute("err", "System error:" + e.getMessage());
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
	}

}
