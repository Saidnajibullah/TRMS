package com.revature.java.najib.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.revature.java.najib.services.*;

public class ApprovalTwoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String col = null;
		String id = request.getParameter("empid");
		String manager = request.getParameter("approve");
		if(manager.equals("supervisor")) {
			col = "supconfirm";
			ApprovalTwoService.approved(id, col);
		}else if(manager.equals("dephead")){
			col = "headconfirm";
			ApprovalTwoService.approved(id, col);
		}else {
			col = "bencoconfirm";
			ApprovalTwoService.approved(id, col);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
		dispatcher.forward(request, response);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    doPost(request, response);
	}


}
