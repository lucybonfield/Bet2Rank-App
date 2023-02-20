package com.java.action;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import com.java.business.UserBusiness;
import com.java.to.User;
import com.java.util.DBUtil;

public class Leaderboard extends CommonServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		validate(request, response);
		
		String action = request.getParameter("action");
		
		try {
			Connection conn = DBUtil.getConnection();

			if(action.equals("list")) {
				List<User> list = UserBusiness.getUsersList(conn);
				String msg = "no data";
				
				request.setAttribute("list", list);
				request.setAttribute("LB", " active");
				request.getRequestDispatcher("/user/user.jsp").forward(request, response);
			}
		} catch (Exception e) {
			request.setAttribute("ERROR", "System error: " + e.getMessage());
			request.getRequestDispatcher("/user/error.jsp").forward(request, response);
		}
	}

}
