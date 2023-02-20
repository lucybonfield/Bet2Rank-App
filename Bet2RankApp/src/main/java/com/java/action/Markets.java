package com.java.action;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Markets extends CommonServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    validate(request, response);
	    
	    request.setAttribute("MKS", " active");
	    request.getRequestDispatcher("/home/markets.jsp").forward(request, response);
	    
	    String action = request.getParameter("action");
	    String msg = "";
	    String err = "";
	    

	
	}

}
