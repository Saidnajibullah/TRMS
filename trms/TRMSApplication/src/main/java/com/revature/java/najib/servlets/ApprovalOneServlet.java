package com.revature.java.najib.servlets;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.java.najib.services.ApprovalProcessiongService;

public class ApprovalOneServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
    public static ResultSet rs3 = null;
	
	ApprovalProcessiongService aps3 = new ApprovalProcessiongService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String id = request.getParameter("id"); 
		if(id != null) {
			rs3 = aps3.processApplicationData3(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("employeetwo.jsp");
			dispatcher.forward(request, response);
		}else {
			response.setStatus(401);
			response.getWriter().write("Page not found!");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
