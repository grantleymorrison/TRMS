package com.morrison.dao;

import static com.morrison.util.CloseStreams.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.morrison.beans.Employee;
import com.morrison.beans.EmployeeData;
import com.morrison.beans.ReimbursementRequest;
import com.morrison.util.ConnectionUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeDaoImpl.
 */
public class EmployeeDaoImpl implements EmployeeDao {
	
	/* (non-Javadoc)
	 * @see com.morrison.dao.EmployeeDao#insertNewEmployee(com.morrison.beans.Employee)
	 */
	@Override
	public void insertNewEmployee(Employee e) {
		PreparedStatement ps = null;
		String sql = "INSERT INTO gtfx.Employee (eid,reportsto,dept_name,rank)"
				+ "VALUES(?,?,?,?)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.err.println("Error: OJDBC driver not found.");
		}
		try (Connection conn = ConnectionUtil.getConnection()) {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, e.getEid());
			ps.setInt(2, e.getReportsto());
			ps.setString(3, e.getDept_name());
			ps.setInt(4, e.getRank());
			int affected = ps.executeUpdate();
			System.out.println(affected + " ROWS INSERTED");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	/* (non-Javadoc)
	 * @see com.morrison.dao.EmployeeDao#insertNewEmployeeData(com.morrison.beans.EmployeeData)
	 */
	@Override
	public void insertNewEmployeeData(EmployeeData ed) {
		PreparedStatement ps = null;
		String sql = "INSERT INTO gtfx.EmployeeData (eid,first_name,last_name,address)"
				+ "VALUES(?,?,?,?)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.err.println("Error: OJDBC driver not found.");
		}
		try (Connection conn = ConnectionUtil.getConnection()) {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, ed.getEid());
			ps.setString(2, ed.getFirst_name());
			ps.setString(3, ed.getLast_name());
			ps.setString(4, ed.getAddress());
			int affected = ps.executeUpdate();
			System.out.println(affected + " ROWS INSERTED");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			close(ps);
		}
		
	}
	
	/* (non-Javadoc)
	 * @see com.morrison.dao.EmployeeDao#insertNewReimbursement(com.morrison.beans.ReimbursementRequest)
	 */
	@Override
	public void insertNewReimbursement(ReimbursementRequest rr) {
		PreparedStatement ps = null;
		String sql = "INSERT INTO gtfx.Reimbursement_Request (emp_id, reimburse_cost,reimburse_event_type,reimburse_date,reimburse_location, dept_name, timeoff_start,timeoff_end)"
				+ "VALUES(?,?,?,?,?,?,?,?)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.err.println("Error: OJDBC driver not found.");
		}
		try (Connection conn = ConnectionUtil.getConnection()) {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, rr.getEMP_ID());
			ps.setDouble(2, rr.getREIMBURSE_COST());
			ps.setString(3, rr.getREIMBURSE_EVENT_TYPE());
			ps.setDate(4, Date.valueOf(rr.getREIMBURSE_DATE()));
			ps.setString(5, rr.getREIMBURSE_LOCATION());
			ps.setString(6, rr.getDEPT_NAME());
			ps.setDate(7, Date.valueOf(rr.getTIMEOFF_START()));
			ps.setDate(8, Date.valueOf(rr.getTIMEOFF_END()));
			int affected = ps.executeUpdate();
			System.out.println(affected + " ROWS INSERTED");
		} catch (SQLException e1) {
			System.err.println("Error: Problem with Reimbursement Request insert");
			e1.printStackTrace();
		}
		
	}
	
	/* (non-Javadoc)
	 * @see com.morrison.dao.EmployeeDao#selectEmployeeById(java.lang.Integer)
	 */
	@Override
	public Employee selectEmployeeById(Integer id) {
		Employee e = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM GTFX.EMPLOYEE WHERE eid = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.err.println("Error: OJDBC driver not found.");
		}
		try (Connection conn = ConnectionUtil.getConnection()) {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				e = new Employee(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
						rs.getDouble(5));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}
	
	/* (non-Javadoc)
	 * @see com.morrison.dao.EmployeeDao#selectEmployeeDataById(java.lang.Integer)
	 */
	@Override
	public EmployeeData selectEmployeeDataById(Integer id) {
		EmployeeData ed = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM GTFX.EMPLOYEEDATA WHERE eid = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.err.println("Error: OJDBC driver not found.");
		}
		try (Connection conn = ConnectionUtil.getConnection()) {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				ed = new EmployeeData(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return ed;
	}
	
	/* (non-Javadoc)
	 * @see com.morrison.dao.EmployeeDao#selectRequestsByDept(java.lang.String)
	 */
	@Override
	public List<ReimbursementRequest> selectRequestsByDept(String dept) {
		List<ReimbursementRequest> lrr = new ArrayList<>();
		ReimbursementRequest rr = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String deptName = dept.trim().toUpperCase();
		String sql = "SELECT * FROM GTFX.REIMBURSEMENT_REQUEST WHERE dept_name = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.err.println("Error: OJDBC driver not found.");
		}
		try (Connection conn = ConnectionUtil.getConnection()) {
			ps = conn.prepareStatement(sql);
			ps.setString(1, deptName);
			rs = ps.executeQuery();
			while (rs.next()) {
				rr = new ReimbursementRequest(rs.getInt(1), rs.getInt(2), rs.getDouble(3),
						rs.getString(4), rs.getString(5), rs.getString(6),
						LocalDate.parse(rs.getString(7).substring(0, 10).trim()),
						rs.getString(8), rs.getString(9),
						LocalDate.parse(rs.getString(10).substring(0, 10).trim()),
						LocalDate.parse(rs.getString(11).substring(0, 10).trim()));
				lrr.add(rr);
			}
			
			if (lrr.isEmpty()) {
				return null;
			}
			
		} catch (SQLException e1) {
			System.err.println(
					"Error: Problem with Connection/Selection of Reimbursement Requests");
			e1.printStackTrace();
		}
		return lrr;
	}
	
	/* (non-Javadoc)
	 * @see com.morrison.dao.EmployeeDao#selectRequestsByEID(java.lang.Integer)
	 */
	@Override
	public List<ReimbursementRequest> selectRequestsByEID(Integer eid) {
		List<ReimbursementRequest> lrr = new ArrayList<>();
		ReimbursementRequest rr = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM GTFX.REIMBURSEMENT_REQUEST WHERE emp_id = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.err.println("Error: OJDBC driver not found.");
		}
		try (Connection conn = ConnectionUtil.getConnection()) {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, eid);
			rs = ps.executeQuery();
			while (rs.next()) {
				rr = new ReimbursementRequest(rs.getInt(1), rs.getInt(2), rs.getDouble(3),
						rs.getString(4), rs.getString(5), rs.getString(6),
						LocalDate.parse(rs.getString(7).substring(0, 10).trim()),
						rs.getString(8), rs.getString(9),
						LocalDate.parse(rs.getString(10).substring(0, 10).trim()),
						LocalDate.parse(rs.getString(11).substring(0, 10).trim()));
				lrr.add(rr);
			}
			
			if (lrr.isEmpty()) {
				return null;
			}
			
		} catch (SQLException e1) {
			System.err.println(
					"Error: Problem with Connection/Selection of Reimbursement Requests");
			e1.printStackTrace();
		}
		return lrr;
	}
	
	/* (non-Javadoc)
	 * @see com.morrison.dao.EmployeeDao#selectRRById(java.lang.Integer)
	 */
	@Override
	public ReimbursementRequest selectRRById(Integer rid) {
		ReimbursementRequest rr = new ReimbursementRequest();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM GTFX.REIMBURSEMENT_REQUEST WHERE reimburse_id = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.err.println("Error: OJDBC driver not found.");
		}
		try (Connection conn = ConnectionUtil.getConnection()) {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, rid);
			rs = ps.executeQuery();
			while (rs.next()) {
				rr = new ReimbursementRequest(rs.getInt(1), rs.getInt(2), rs.getDouble(3),
						rs.getString(4), rs.getString(5), rs.getString(6),
						LocalDate.parse(rs.getString(7).substring(0, 10).trim()),
						rs.getString(8), rs.getString(9),
						LocalDate.parse(rs.getString(10).substring(0, 10).trim()),
						LocalDate.parse(rs.getString(11).substring(0, 10).trim()));
			}
			
		} catch (SQLException e1) {
			System.err.println(
					"Error: Problem with Connection/Selection of Reimbursement Requests");
			e1.printStackTrace();
		}
		return rr;
	}
	
	/* (non-Javadoc)
	 * @see com.morrison.dao.EmployeeDao#updateEmployeeAid(com.morrison.beans.Employee)
	 */
	@Override
	public void updateEmployeeAid(Employee e) {
		PreparedStatement ps = null;
		String sql = "UPDATE gtfx.EMPLOYEE" + " SET AID = ? WHERE eid = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.err.println("Error: OJDBC driver not found.");
		}
		try (Connection conn = ConnectionUtil.getConnection()) {
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, e.getAid());
			ps.setInt(2, e.getEid());
			int affected = ps.executeUpdate();
			System.out.println(affected + " ROW(S) UPDATED");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see com.morrison.dao.EmployeeDao#updateRRStatus(com.morrison.beans.ReimbursementRequest)
	 */
	@Override
	public void updateRRStatus(ReimbursementRequest rr) {
		PreparedStatement ps = null;
		Integer rid = rr.getREIMBURSE_ID();
		String status = rr.getReimburse_status();
		String sql = "UPDATE gtfx.REIMBURSEMENT_REQUEST SET REIMBURSE_STATUS = ? WHERE REIMBURSE_ID = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.err.println("Error: OJDBC driver not found.");
		}
		try (Connection conn = ConnectionUtil.getConnection()) {
			ps = conn.prepareStatement(sql);
			ps.setString(1, status);
			ps.setInt(2, rid);
			int affected = ps.executeUpdate();
			System.out.println(affected + " ROW(S) UPDATED");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
