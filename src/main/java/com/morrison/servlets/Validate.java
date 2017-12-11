package com.morrison.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.morrison.service.ValidateUser;

// TODO: Auto-generated Javadoc
/**
 * Servlet implementation class Validate.
 */
public class Validate extends HttpServlet {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Integer rank = ValidateUser.validate(request);
		
		switch (rank) {
			case 0:
				response.sendRedirect("employee.html");
				break;
			case 1:
				response.sendRedirect("supervisor.html");
				break;
			case 2:
				response.sendRedirect("dephead.html");
				break;
			case 3:
				response.sendRedirect("benco.html");
				break;
			default:
				out.println("<h3>Invalid ID: Access cannot be granted<h3>");
				response.sendRedirect("login.html");
		}
	}
	
	/**
	 * Do post.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
