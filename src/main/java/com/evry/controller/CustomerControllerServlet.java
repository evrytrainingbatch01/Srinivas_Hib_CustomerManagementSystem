package com.evry.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.evry.dao.CustomerDAO;

/**
 * Servlet implementation class CustomerControllerServlet
 */

@WebServlet("/CustomerControllerServlet")
public class CustomerControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        String age = request.getParameter("age");
        String email = request.getParameter("email");
        String Address = request.getParameter("Address");
        String mobileno = request.getParameter("mobileno");
 
        HttpSession session = request.getSession(true);
        try {
            CustomerDAO custDao = new CustomerDAO();
            custDao.addCustomerDetails(username, password, age, email, Address, mobileno);
            response.sendRedirect("Login.jsp");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
    
	
	}

}
