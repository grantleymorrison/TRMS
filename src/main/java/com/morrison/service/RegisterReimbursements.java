package com.morrison.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.morrison.beans.Employee;
import com.morrison.beans.ReimbursementRequest;
import com.morrison.dao.EmployeeDaoImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class RegisterReimbursements.
 */
public class RegisterReimbursements {
	
	/**
	 * Gets the by id.
	 *
	 * @param request the request
	 * @return the by id
	 */
	public static Employee getById(HttpServletRequest request) {
		Employee e = new Employee();
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		if (request.getParameter("emp_id") != "") {
			Integer id = (Integer.parseInt(request.getParameter("emp_id")));
			if (id != null) {
				e = edi.selectEmployeeById(id);
			}
		}
		return e;
	}
	
	/**
	 * Register.
	 *
	 * @param request the request
	 * @return the list
	 */
	public static List<ReimbursementRequest> register(HttpServletRequest request) {
		List<ReimbursementRequest> rr = new ArrayList<>();
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		if ((request.getParameter("emp_id") != "")
				&& (request.getParameter("emp_id") != null)) {
			Integer id = (Integer.parseInt(request.getParameter("emp_id")));
			if (id != null) {
				rr = edi.selectRequestsByEID(id);
			}
		}
		return rr;
	}
}
