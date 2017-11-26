package com.sidgs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sidgs.bo.CustomerBo;
import com.sidgs.exception.ApplicationException;
import com.sidgs.model.Customer;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private String email;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		name = request.getParameter("name");
		password = request.getParameter("pw");
		email = request.getParameter("mail");
		System.out.println("register is working");
		Customer customer = new Customer();
		customer.setName(name);
		customer.setPassword(password);
		customer.setEmail(email);
		CustomerBo bo = new CustomerBo();
		try {
			if (bo.addCustomer(customer)) {
				RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
				rd.forward(request, response);
			}
			else{
				RequestDispatcher rd = request.getRequestDispatcher("SignUp.jsp");
				rd.forward(request, response);
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			
			RequestDispatcher rd = request.getRequestDispatcher("SignUp.jsp");
			request.setAttribute("message", e.getMessage());
			rd.forward(request, response);
			
		}

	}

}
