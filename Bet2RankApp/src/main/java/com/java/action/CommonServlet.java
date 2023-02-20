package com.java.action;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CommonServlet extends HttpServlet {

	protected void validate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("CURRENT_USER") == null) {
			request.setAttribute("err", "You need to be logged in to access this page.");
			request.getRequestDispatcher("/login.jsp").forward(request, response);			
		}
	}

}
