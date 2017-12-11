package com.morrison.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.morrison.service.RegisterRequest;

// TODO: Auto-generated Javadoc
/**
 * Servlet implementation class ReimbursementRegistration.
 */
public class ReimbursementRegistration extends HttpServlet {
	
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
		out.println(
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n"
						+ "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n"
						+ "<script src=“https://code.jquery.com/jquery-1.10.2.js“></script>\r\n"
						+ "<script src=“https://code.jquery.com/ui/1.10.4/jquery-ui.js”></script>");
		if (RegisterRequest.register(request)) {
			out.println("<h1>REGISTRATION SUCCESS</h1>");
		} else {
			out.println("<h1>REGISTRATION FAILED</h1>");
		}
		
		out.println("<hr>" + "Thank you for your submission! It is under review."
				+ "</hr><br>" + "<a href='registration.html'>SUBMIT A NEW REQUEST</a>"
				+ "<br><a href='login.html'>HOME</a>");
		
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
