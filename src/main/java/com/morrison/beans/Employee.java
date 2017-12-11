package com.morrison.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class Employee.
 *
 * @author Grantley Morrison
 *         This class is used to represent Employee data from the TRMS database
 */
public class Employee {
	
	/** The eid. */
	private Integer	eid;
	
	/** The reportsto. */
	private Integer	reportsto;
	
	/** The dept name. */
	private String		dept_name;
	
	/** The rank. */
	private Integer	rank;
	
	/** The aid. */
	private Double		aid;
	
	/**
	 * Instantiates a new employee.
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new employee.
	 *
	 * @param eid the eid
	 * @param reportsto the reportsto
	 * @param dept_name the dept name
	 * @param rank the rank
	 */
	public Employee( Integer eid , Integer reportsto , String dept_name , Integer rank ) {
		this.eid = eid;
		this.reportsto = reportsto;
		this.dept_name = dept_name;
		this.rank = rank;
		aid = 0.0;
	}
	
	/**
	 * Instantiates a new employee.
	 *
	 * @param eid the eid
	 * @param reportsto the reportsto
	 * @param dept_name the dept name
	 * @param rank the rank
	 * @param aid the aid
	 */
	public Employee( Integer eid , Integer reportsto , String dept_name , Integer rank ,
			Double aid ) {
		this.eid = eid;
		this.reportsto = reportsto;
		this.dept_name = dept_name;
		this.rank = rank;
		this.aid = aid;
	}
	
	/**
	 * Adds the aid.
	 *
	 * @param aid the aid
	 */
	public void addAid(Double aid) {
		Double newAid = this.aid + aid;
		if (newAid > 1000.0) {
			newAid = 1000.0;
		} else if (newAid < this.aid) {
			newAid = this.aid;
		} else if (newAid < 0.0) {
			newAid = 0.0;
		}
		this.aid = newAid;
	}
	
	/**
	 * Gets the aid.
	 *
	 * @return the aid
	 */
	public Double getAid() {
		return aid;
	}
	
	/**
	 * Gets the dept name.
	 *
	 * @return the dept name
	 */
	public String getDept_name() {
		return dept_name;
	}
	
	/**
	 * Gets the eid.
	 *
	 * @return the eid
	 */
	public Integer getEid() {
		return eid;
	}
	
	/**
	 * Gets the rank.
	 *
	 * @return the rank
	 */
	public Integer getRank() {
		return rank;
	}
	
	/**
	 * Gets the reportsto.
	 *
	 * @return the reportsto
	 */
	public Integer getReportsto() {
		return reportsto;
	}
	
	/**
	 * Sets the dept name.
	 *
	 * @param dept_name the new dept name
	 */
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	/**
	 * Sets the eid.
	 *
	 * @param eid the new eid
	 */
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	
	/**
	 * Sets the rank.
	 *
	 * @param rank the new rank
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	
	/**
	 * Sets the reportsto.
	 *
	 * @param reportsto the new reportsto
	 */
	public void setReportsto(Integer reportsto) {
		this.reportsto = reportsto;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", reportsto=" + reportsto + ", dept_name="
				+ dept_name + ", rank=" + rank + "]";
	}
	
}
