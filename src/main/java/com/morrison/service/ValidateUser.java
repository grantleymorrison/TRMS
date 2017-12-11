package com.morrison.service;

import javax.servlet.http.HttpServletRequest;

import com.morrison.beans.Employee;
import com.morrison.dao.EmployeeDaoImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class ValidateUser.
 */
public class ValidateUser {
	
	/**
	 * Validate.
	 *
	 * @param request the request
	 * @return the int
	 */
	public static int validate(HttpServletRequest request) {
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		if (request.getParameter("eid") == "") {
			return -1;
		}
		Integer eid = Integer.parseInt(request.getParameter("eid"));
		Employee curr = edi.selectEmployeeById(eid);
		if (curr != null) {
			return curr.getRank();
		}
		return -1;
	}
}
