package com.morrison.service;

import javax.servlet.http.HttpServletRequest;

import com.morrison.beans.Employee;
import com.morrison.beans.EmployeeData;
import com.morrison.dao.EmployeeDaoImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class RegisterUser.
 */
public class RegisterUser {
	
	/**
	 * Register.
	 *
	 * @param request the request
	 * @return true, if successful
	 */
	public static boolean register(HttpServletRequest request) {
		Employee e = new Employee(Integer.parseInt(request.getParameter("eid")),
				Integer.parseInt(request.getParameter("reportsto")),
				request.getParameter("dept_name"),
				Integer.parseInt(request.getParameter("rank")));
		
		EmployeeData ed = new EmployeeData(Integer.parseInt(request.getParameter("eid")),
				request.getParameter("first_name"), request.getParameter("last_name"),
				request.getParameter("address"));
		
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		if (edi.selectEmployeeById(e.getEid()) != null) {
			return false;
		}
		
		if (edi.selectEmployeeDataById(ed.getEid()) != null) {
			return false;
		}
		edi.insertNewEmployee(e);
		edi.insertNewEmployeeData(ed);
		return true;
	}
}
