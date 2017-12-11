package com.morrison.service;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import com.morrison.beans.ReimbursementRequest;
import com.morrison.dao.EmployeeDaoImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class RegisterRequest.
 */
public class RegisterRequest {
	
	/**
	 * Register.
	 *
	 * @param request the request
	 * @return true, if successful
	 */
	public static boolean register(HttpServletRequest request) {
		ReimbursementRequest rr = new ReimbursementRequest(
				Integer.parseInt(request.getParameter("emp_id")),
				Double.parseDouble(request.getParameter("cost")),
				request.getParameter("event_type"),
				LocalDate.parse(request.getParameter("date")),
				request.getParameter("location"), request.getParameter("dept_name"),
				LocalDate.parse(request.getParameter("startdate")),
				LocalDate.parse(request.getParameter("enddate")));
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		
		edi.insertNewReimbursement(rr);
		return true;
	}
}
