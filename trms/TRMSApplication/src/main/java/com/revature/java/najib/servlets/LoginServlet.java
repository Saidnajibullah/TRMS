package com.revature.java.najib.servlets;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.java.najib.daos.GetIdsDao;
import com.revature.java.najib.pojos.User;
import com.revature.java.najib.services.UserService;
import com.revature.java.najib.services.UserCredentialService;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	
	 public static ResultSet rs = null; 
	 public static ResultSet rs1 = null; 
	 public static ResultSet rs2 = null; 
	
	private UserService userService = new UserCredentialService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String password = req.getParameter("password");
		User user = userService.loginUser(password);
		if (user.getPassword() == null) {
			resp.sendRedirect("loginFailed.html");
		} else {
			HttpSession  session = req.getSession(true);
			session.setAttribute("user", user);
			if(user.getPassword().substring(0, 1).equals("e")) {
				if(user.getUsername().equals(req.getParameter("username")) &&
				user.getPassword().equals(req.getParameter("password"))) {
				
				RequestDispatcher requestDispatcher =
						    req.getRequestDispatcher("home.jsp");	
				 requestDispatcher.forward(req, resp);
				 }else {
					 resp.sendRedirect("loginFailed.html");
				 }
				
			}else {
				if(user.getUsername().equals(req.getParameter("username")) &&
						user.getPassword().equals(req.getParameter("password")) ){
					 rs = GetIdsDao.getEmployeeIds("supconfirm","headconfirm" ,false, false); 
					 rs1 = GetIdsDao.getEmployeeIds("supconfirm","headconfirm", true, false); 
					 rs2 = GetIdsDao.getEmployeeIds("headconfirm", "bencoconfirm", true, false); 
					RequestDispatcher requestDispatcher =
						    req.getRequestDispatcher("admin.jsp");	
				     requestDispatcher.forward(req, resp);
				}else {    
					resp.sendRedirect("loginFailed.html");     
				}
			}
			
			
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("user") != null) {
			resp.sendRedirect("admin.jsp");
			resp.sendRedirect("home.jsp");
			
		}
		else {
			resp.sendRedirect("login.html");
		}
	}
	
	

}
