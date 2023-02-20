package com.java.action;

import java.io.IOException;
import java.sql.Connection;

import com.java.business.UserBusiness;
import com.java.util.DBUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Account extends CommonServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    validate(request, response);
    
    request.setAttribute("HOME", " active");
    request.getRequestDispatcher("/home/index.jsp").forward(request, response);
    
    String action = request.getParameter("action");
    String msg = "";
    String err = "";
   
    }
}