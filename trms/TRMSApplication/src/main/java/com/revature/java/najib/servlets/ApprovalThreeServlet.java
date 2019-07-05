package com.revature.java.najib.servlets;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.java.najib.services.ApprovalProcessiongService;

public class ApprovalThreeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static ResultSet rs2 = null;
	
	ApprovalProcessiongService aps2 = new ApprovalProcessiongService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String id = request.getParameter("id"); 
		if(id != null) {
			rs2 = aps2.processApplicationData2(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("employeeone.jsp");
			dispatcher.forward(request, response);
		}else {
			response.setStatus(401);
			response.getWriter().write("Page not found!");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
