package com.revature.java.najib.servlets;

import com.revature.java.najib.pojos.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.MultipartConfig;
import com.revature.java.najib.services.ApplicationService;


import javax.servlet.http.Part;

@MultipartConfig(maxFileSize = 169999999)
public class ApplicationServlet extends HttpServlet {

	List<String> items = new ArrayList<String>();
	ApplicationService appservice = new ApplicationService();
	Application application = new Application();
	
	
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Enumeration<String> e = request.getParameterNames();
		while(e.hasMoreElements()) {
			String item = (String) e.nextElement();
			items.add(request.getParameter(item));
		} 
		Part f1 = request.getPart("first");
		Part f2 = request.getPart("second");
		 
		int success = appservice.processApplication(application, items, f1, f2);  
		if(success > 0) {
		
		  HttpSession session = request.getSession(true);
		  session.setAttribute("success", success);
		   RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		   dispatcher.forward(request, response);
		}
		else {
			response.setStatus(401);
			response.getWriter().write("Falied to submit");
			response.getWriter().write("Please try it again");
		}
		
	}
	
	   

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	 
	      
	

}
