package com.revature.java.najib.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.java.najib.services.GetAmountService;

public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    String id = request.getParameter("id");
    int restult = GetAmountService.getTatalAmout(id); 
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().print(restult);;
   
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {  
		doGet(request, response);
	}

}
