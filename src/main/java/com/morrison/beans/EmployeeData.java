package com.morrison.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeData.
 */
public class EmployeeData {
	
	/** The eid. */
	private Integer	eid;
	
	/** The first name. */
	private String		first_name;
	
	/** The last name. */
	private String		last_name;
	
	/** The address. */
	private String		address;
	
	/**
	 * Instantiates a new employee data.
	 *
	 * @param eid the eid
	 * @param first_name the first name
	 * @param last_name the last name
	 * @param address the address
	 */
	public EmployeeData( Integer eid , String first_name , String last_name ,
			String address ) {
		this.eid = eid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
	}
	
	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
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
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirst_name() {
		return first_name;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLast_name() {
		return last_name;
	}
	
	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
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
	 * Sets the first name.
	 *
	 * @param first_name the new first name
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param last_name the new last name
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeData [eid=" + eid + ", first_name=" + first_name + ", last_name="
				+ last_name + ", address=" + address + "]";
	}
	
}