package com.sidgs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sidgs.bo.CustomerBo;
import com.sidgs.exception.ApplicationException;
import com.sidgs.model.Customer;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String username;
	String password;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	username = request.getParameter("un");
	
	password = request.getParameter("pw");
	ServletConfig config=getServletConfig();
	ServletContext cont = getServletContext();
	System.out.println("config is working" +config.getServletName());
	System.out.println("login controller working");
	System.out.println("init also working" +config.getInitParameterNames());
	System.out.println("context is working" +cont.getServerInfo());
	CustomerBo bo = new CustomerBo();
	Customer cus = null;
	
	try {
		cus = bo.authenticate(username,password);
	} catch (ApplicationException e) {
		// TODO Auto-generated catch block
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		request.setAttribute("message", e.getMessage());
		rd.forward(request, response);
	}
	if(cus != null && cus.isValid()){
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
	else{
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		request.setAttribute("message", "invalid credentials");
		rd.forward(request, response);
	}
		
	}


}
