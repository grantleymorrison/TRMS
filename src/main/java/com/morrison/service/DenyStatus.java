package com.morrison.service;

import javax.servlet.http.HttpServletRequest;

import com.morrison.beans.ReimbursementRequest;
import com.morrison.dao.EmployeeDaoImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class DenyStatus.
 */
public class DenyStatus {
	
	/**
	 * Validate.
	 *
	 * @param request the request
	 * @return true, if successful
	 */
	public static boolean validate(HttpServletRequest request) {
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		Integer rid = Integer.parseInt(request.getParameter("rid"));
		ReimbursementRequest curr = edi.selectRRById(rid);
		
		if (curr != null) {
			if (curr.updateStatus(0)) {
				edi.updateRRStatus(curr);
			}
			return true;
		} else {
			System.out.println("Curr is null");
			return false;
		}
	}
}
