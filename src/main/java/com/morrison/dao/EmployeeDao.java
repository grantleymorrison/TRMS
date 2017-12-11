package com.morrison.dao;

import java.util.List;

import com.morrison.beans.Employee;
import com.morrison.beans.EmployeeData;
import com.morrison.beans.ReimbursementRequest;

// TODO: Auto-generated Javadoc
/**
 * The Interface EmployeeDao.
 */
public interface EmployeeDao {
	
	/**
	 * Insert new employee.
	 *
	 * @param e the e
	 */
	public void insertNewEmployee(Employee e);
	
	/**
	 * Insert new employee data.
	 *
	 * @param ed the ed
	 */
	public void insertNewEmployeeData(EmployeeData ed);
	
	/**
	 * Insert new reimbursement.
	 *
	 * @param rr the rr
	 */
	public void insertNewReimbursement(ReimbursementRequest rr);
	
	/**
	 * Select employee by id.
	 *
	 * @param id the id
	 * @return the employee
	 */
	public Employee selectEmployeeById(Integer id);
	
	/**
	 * Select employee data by id.
	 *
	 * @param id the id
	 * @return the employee data
	 */
	public EmployeeData selectEmployeeDataById(Integer id);
	
	/**
	 * Select requests by dept.
	 *
	 * @param dept the dept
	 * @return the list
	 */
	public List<ReimbursementRequest> selectRequestsByDept(String dept);
	
	/**
	 * Select requests by EID.
	 *
	 * @param eid the eid
	 * @return the list
	 */
	public List<ReimbursementRequest> selectRequestsByEID(Integer eid);
	
	/**
	 * Select RR by id.
	 *
	 * @param rid the rid
	 * @return the reimbursement request
	 */
	public ReimbursementRequest selectRRById(Integer rid);
	
	/**
	 * Update employee aid.
	 *
	 * @param e the e
	 */
	public void updateEmployeeAid(Employee e);
	
	/**
	 * Update RR status.
	 *
	 * @param rr the rr
	 */
	public void updateRRStatus(ReimbursementRequest rr);
	
}
