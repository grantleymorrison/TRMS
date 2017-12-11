package com.morrison.service;

import javax.servlet.http.HttpServletRequest;

import com.morrison.beans.Employee;
import com.morrison.beans.ReimbursementRequest;
import com.morrison.dao.EmployeeDaoImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class ApproveStatusBenco.
 */
public class ApproveStatusBenco {
	
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
			Integer eid = curr.getEMP_ID();
			Employee e = edi.selectEmployeeById(eid);
			if (curr.updateStatus(3)) {
				e.addAid(curr.coveredCost());
				edi.updateRRStatus(curr);
				edi.updateEmployeeAid(e);
				
			}
			return true;
		} else {
			System.out.println("Curr is null");
			return false;
		}
	}
}
