package com.morrison.beans;

import java.time.LocalDate;

// TODO: Auto-generated Javadoc
/**
 * The Class ReimbursementRequest.
 */
public class ReimbursementRequest {
	
	/** The reimburse id. */
	private Integer	REIMBURSE_ID;
	
	/** The emp id. */
	private Integer	EMP_ID;
	
	/** The reimburse cost. */
	private Double		REIMBURSE_COST;
	
	/** The reimburse event type. */
	private String		REIMBURSE_EVENT_TYPE;
	
	/** The reimburse date. */
	private LocalDate	REIMBURSE_DATE;
	
	/** The reimburse location. */
	private String		REIMBURSE_LOCATION;
	
	/** The reimburse status. */
	private String		reimburse_status;
	
	/** The reimburse timestamp. */
	private String		reimburse_timestamp;
	
	/** The pending. */
	private Double		pending	= 0.0;
	
	/** The dept name. */
	private String		DEPT_NAME;
	
	/** The timeoff start. */
	private LocalDate	TIMEOFF_START;
	
	/** The timeoff end. */
	private LocalDate	TIMEOFF_END;
	
	/**
	 * Instantiates a new reimbursement request.
	 *
	 * @param EMP_ID the emp id
	 * @param REIMBURSE_COST the reimburse cost
	 * @param REIMBURSE_EVENT_TYPE the reimburse event type
	 * @param REIMBURSE_DATE the reimburse date
	 * @param REIMBURSE_LOCATION the reimburse location
	 * @param DEPT_NAME the dept name
	 * @param tIMEOFF_START the t IMEOF F START
	 * @param tIMEOFF_END the t IMEOF F END
	 */
	public ReimbursementRequest( Integer EMP_ID , Double REIMBURSE_COST ,
			String REIMBURSE_EVENT_TYPE , LocalDate REIMBURSE_DATE ,
			String REIMBURSE_LOCATION , String DEPT_NAME , LocalDate tIMEOFF_START ,
			LocalDate tIMEOFF_END ) {
		this.EMP_ID = EMP_ID;
		this.REIMBURSE_COST = REIMBURSE_COST;
		this.REIMBURSE_EVENT_TYPE = REIMBURSE_EVENT_TYPE;
		this.REIMBURSE_DATE = (REIMBURSE_DATE);
		this.REIMBURSE_LOCATION = REIMBURSE_LOCATION;
		this.DEPT_NAME = DEPT_NAME;
		TIMEOFF_START = tIMEOFF_START;
		TIMEOFF_END = tIMEOFF_END;
	}
	
	/**
	 * Instantiates a new reimbursement request.
	 *
	 * @param eMP_ID the e M P ID
	 * @param rEIMBURSE_COST the r EIMBURS E COST
	 * @param rEIMBURSE_EVENT_TYPE the r EIMBURS E EVEN T TYPE
	 * @param rEIMBURSE_DATE the r EIMBURS E DATE
	 * @param rEIMBURSE_LOCATION the r EIMBURS E LOCATION
	 * @param reimburse_status the reimburse status
	 * @param reimburse_timestamp the reimburse timestamp
	 * @param dEPT_NAME the d EP T NAME
	 * @param tIMEOFF_START the t IMEOF F START
	 * @param tIMEOFF_END the t IMEOF F END
	 */
	public ReimbursementRequest( Integer eMP_ID , Double rEIMBURSE_COST ,
			String rEIMBURSE_EVENT_TYPE , LocalDate rEIMBURSE_DATE ,
			String rEIMBURSE_LOCATION , String reimburse_status ,
			String reimburse_timestamp , String dEPT_NAME , LocalDate tIMEOFF_START ,
			LocalDate tIMEOFF_END ) {
		EMP_ID = eMP_ID;
		REIMBURSE_COST = rEIMBURSE_COST;
		REIMBURSE_EVENT_TYPE = rEIMBURSE_EVENT_TYPE;
		REIMBURSE_DATE = rEIMBURSE_DATE;
		REIMBURSE_LOCATION = rEIMBURSE_LOCATION;
		this.reimburse_status = reimburse_status;
		this.reimburse_timestamp = reimburse_timestamp;
		DEPT_NAME = dEPT_NAME;
		TIMEOFF_START = tIMEOFF_START;
		TIMEOFF_END = tIMEOFF_END;
	}
	
	/**
	 * Instantiates a new reimbursement request.
	 *
	 * @param EMP_ID the emp id
	 * @param REIMBURSE_COST the reimburse cost
	 * @param REIMBURSE_EVENT_TYPE the reimburse event type
	 * @param REIMBURSE_DATE the reimburse date
	 * @param REIMBURSE_LOCATION the reimburse location
	 * @param DEPT_NAME the dept name
	 * @param tIMEOFF_START the t IMEOF F START
	 * @param tIMEOFF_END the t IMEOF F END
	 */
	public ReimbursementRequest( Integer EMP_ID , Double REIMBURSE_COST ,
			String REIMBURSE_EVENT_TYPE , String REIMBURSE_DATE , String REIMBURSE_LOCATION ,
			String DEPT_NAME , String tIMEOFF_START , String tIMEOFF_END ) {
		this.EMP_ID = EMP_ID;
		this.REIMBURSE_COST = REIMBURSE_COST;
		this.REIMBURSE_EVENT_TYPE = REIMBURSE_EVENT_TYPE;
		this.REIMBURSE_DATE = LocalDate.parse(REIMBURSE_DATE);
		this.REIMBURSE_LOCATION = REIMBURSE_LOCATION;
		this.DEPT_NAME = DEPT_NAME;
		TIMEOFF_START = LocalDate.parse(tIMEOFF_START);
		TIMEOFF_END = LocalDate.parse(tIMEOFF_END);
	}
	
	/**
	 * Instantiates a new reimbursement request.
	 *
	 * @param rEIMBURSE_ID the r EIMBURS E ID
	 * @param eMP_ID the e M P ID
	 * @param rEIMBURSE_COST the r EIMBURS E COST
	 * @param rEIMBURSE_EVENT_TYPE the r EIMBURS E EVEN T TYPE
	 * @param rEIMBURSE_DATE the r EIMBURS E DATE
	 * @param rEIMBURSE_LOCATION the r EIMBURS E LOCATION
	 * @param reimburse_status the reimburse status
	 * @param reimburse_timestamp the reimburse timestamp
	 * @param pending the pending
	 * @param dEPT_NAME the d EP T NAME
	 * @param tIMEOFF_START the t IMEOF F START
	 * @param tIMEOFF_END the t IMEOF F END
	 */
	public ReimbursementRequest( Integer rEIMBURSE_ID , Integer eMP_ID ,
			Double rEIMBURSE_COST , String rEIMBURSE_EVENT_TYPE , LocalDate rEIMBURSE_DATE ,
			String rEIMBURSE_LOCATION , String reimburse_status ,
			String reimburse_timestamp , Double pending , String dEPT_NAME ,
			LocalDate tIMEOFF_START , LocalDate tIMEOFF_END ) {
		REIMBURSE_ID = rEIMBURSE_ID;
		EMP_ID = eMP_ID;
		REIMBURSE_COST = rEIMBURSE_COST;
		REIMBURSE_EVENT_TYPE = rEIMBURSE_EVENT_TYPE;
		REIMBURSE_DATE = rEIMBURSE_DATE;
		REIMBURSE_LOCATION = rEIMBURSE_LOCATION;
		this.reimburse_status = reimburse_status;
		this.reimburse_timestamp = reimburse_timestamp;
		this.pending = pending;
		DEPT_NAME = dEPT_NAME;
		TIMEOFF_START = tIMEOFF_START;
		TIMEOFF_END = tIMEOFF_END;
	}
	
	/**
	 * Instantiates a new reimbursement request.
	 *
	 * @param REIMBURSE_ID the reimburse id
	 * @param EMP_ID the emp id
	 * @param REIMBURSE_COST the reimburse cost
	 * @param REIMBURSE_EVENT_TYPE the reimburse event type
	 * @param REIMBURSE_STATUS the reimburse status
	 * @param REIMBURSE_TIMESTAMP the reimburse timestamp
	 * @param REIMBURSE_DATE the reimburse date
	 * @param REIMBURSE_LOCATION the reimburse location
	 * @param DEPT_NAME the dept name
	 * @param TIMEOFF_START the timeoff start
	 * @param TIMEOFF_END the timeoff end
	 */
	public ReimbursementRequest( Integer REIMBURSE_ID , Integer EMP_ID ,
			Double REIMBURSE_COST , String REIMBURSE_EVENT_TYPE , String REIMBURSE_STATUS ,
			String REIMBURSE_TIMESTAMP , LocalDate REIMBURSE_DATE ,
			String REIMBURSE_LOCATION , String DEPT_NAME , LocalDate TIMEOFF_START ,
			LocalDate TIMEOFF_END ) {
		this.REIMBURSE_ID = REIMBURSE_ID;
		this.EMP_ID = EMP_ID;
		this.REIMBURSE_COST = REIMBURSE_COST;
		this.REIMBURSE_EVENT_TYPE = REIMBURSE_EVENT_TYPE;
		reimburse_status = REIMBURSE_STATUS;
		reimburse_timestamp = REIMBURSE_TIMESTAMP;
		this.REIMBURSE_DATE = REIMBURSE_DATE;
		this.REIMBURSE_LOCATION = REIMBURSE_LOCATION;
		this.DEPT_NAME = DEPT_NAME;
		this.TIMEOFF_START = TIMEOFF_START;
		this.TIMEOFF_END = TIMEOFF_END;
	}
	
	public ReimbursementRequest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Covered cost.
	 *
	 * @return the double
	 */
	public double coveredCost() {
		switch ((REIMBURSE_EVENT_TYPE).trim().toLowerCase()) {
			case "uni":
				pending = (REIMBURSE_COST) * .8;
				break;
			case "sem":
				pending = (REIMBURSE_COST) * .6;
				break;
			case "certprep":
				pending = (REIMBURSE_COST) * .75;
				break;
			case "cert":
				pending = (REIMBURSE_COST) * 1.0;
				break;
			case "train":
				pending = (REIMBURSE_COST) * .9;
				break;
			default:
				pending = (REIMBURSE_COST) * .3;
				break;
		}
		if (pending < 0.0) {
			pending = 0.0;
		} else if (pending > 1000.0) {
			pending = 1000.0;
		}
		return pending;
	}
	
	/**
	 * Full to string.
	 *
	 * @return the string
	 */
	public String fullToString() {
		return "ReimbursementRequest [REIMBURSE_ID=" + REIMBURSE_ID + ", EMP_ID=" + EMP_ID
				+ ", REIMBURSE_COST=" + REIMBURSE_COST + ", REIMBURSE_EVENT_TYPE="
				+ REIMBURSE_EVENT_TYPE + ", REIMBURSE_DATE=" + REIMBURSE_DATE
				+ ", REIMBURSE_LOCATION=" + REIMBURSE_LOCATION + ", reimburse_status="
				+ reimburse_status + ", reimburse_timestamp=" + reimburse_timestamp + "]";
	}
	
	/**
	 * Gets the dept name.
	 *
	 * @return the dept name
	 */
	public String getDEPT_NAME() {
		return DEPT_NAME;
	}
	
	/**
	 * Gets the emp id.
	 *
	 * @return the emp id
	 */
	public Integer getEMP_ID() {
		return EMP_ID;
	}
	
	/**
	 * Gets the reimburse cost.
	 *
	 * @return the reimburse cost
	 */
	public Double getREIMBURSE_COST() {
		return REIMBURSE_COST;
	}
	
	/**
	 * Gets the reimburse date.
	 *
	 * @return the reimburse date
	 */
	public LocalDate getREIMBURSE_DATE() {
		return REIMBURSE_DATE;
	}
	
	/**
	 * Gets the reimburse event type.
	 *
	 * @return the reimburse event type
	 */
	public String getREIMBURSE_EVENT_TYPE() {
		return REIMBURSE_EVENT_TYPE;
	}
	
	/**
	 * Gets the reimburse id.
	 *
	 * @return the reimburse id
	 */
	public Integer getREIMBURSE_ID() {
		return REIMBURSE_ID;
	}
	
	/**
	 * Gets the reimburse location.
	 *
	 * @return the reimburse location
	 */
	public String getREIMBURSE_LOCATION() {
		return REIMBURSE_LOCATION;
	}
	
	/**
	 * Gets the reimburse status.
	 *
	 * @return the reimburse status
	 */
	public String getReimburse_status() {
		return reimburse_status;
	}
	
	/**
	 * Gets the reimburse timestamp.
	 *
	 * @return the reimburse timestamp
	 */
	public String getReimburse_timestamp() {
		return reimburse_timestamp;
	}
	
	/**
	 * Gets the timeoff end.
	 *
	 * @return the timeoff end
	 */
	public LocalDate getTIMEOFF_END() {
		return TIMEOFF_END;
	}
	
	/**
	 * Gets the timeoff start.
	 *
	 * @return the timeoff start
	 */
	public LocalDate getTIMEOFF_START() {
		return TIMEOFF_START;
	}
	
	/**
	 * Sets the dept name.
	 *
	 * @param dEPT_NAME the new dept name
	 */
	public void setDEPT_NAME(String dEPT_NAME) {
		DEPT_NAME = dEPT_NAME;
	}
	
	/**
	 * Sets the emp id.
	 *
	 * @param eMP_ID the new emp id
	 */
	public void setEMP_ID(Integer eMP_ID) {
		EMP_ID = eMP_ID;
	}
	
	/**
	 * Sets the reimburse cost.
	 *
	 * @param rEIMBURSE_COST the new reimburse cost
	 */
	public void setREIMBURSE_COST(Double rEIMBURSE_COST) {
		REIMBURSE_COST = rEIMBURSE_COST;
	}
	
	/**
	 * Sets the reimburse date.
	 *
	 * @param rEIMBURSE_DATE the new reimburse date
	 */
	public void setREIMBURSE_DATE(LocalDate rEIMBURSE_DATE) {
		REIMBURSE_DATE = rEIMBURSE_DATE;
	}
	
	/**
	 * Sets the reimburse event type.
	 *
	 * @param rEIMBURSE_EVENT_TYPE the new reimburse event type
	 */
	public void setREIMBURSE_EVENT_TYPE(String rEIMBURSE_EVENT_TYPE) {
		REIMBURSE_EVENT_TYPE = rEIMBURSE_EVENT_TYPE;
	}
	
	/**
	 * Sets the reimburse id.
	 *
	 * @param rEIMBURSE_ID the new reimburse id
	 */
	public void setREIMBURSE_ID(Integer rEIMBURSE_ID) {
		REIMBURSE_ID = rEIMBURSE_ID;
	}
	
	/**
	 * Sets the reimburse location.
	 *
	 * @param rEIMBURSE_LOCATION the new reimburse location
	 */
	public void setREIMBURSE_LOCATION(String rEIMBURSE_LOCATION) {
		REIMBURSE_LOCATION = rEIMBURSE_LOCATION;
	}
	
	/**
	 * Sets the reimburse status.
	 *
	 * @param reimburse_status the new reimburse status
	 */
	public void setReimburse_status(String reimburse_status) {
		this.reimburse_status = reimburse_status;
	}
	
	/**
	 * Sets the timeoff end.
	 *
	 * @param tIMEOFF_END the new timeoff end
	 */
	public void setTIMEOFF_END(LocalDate tIMEOFF_END) {
		TIMEOFF_END = tIMEOFF_END;
	}
	
	/**
	 * Sets the timeoff start.
	 *
	 * @param tIMEOFF_START the new timeoff start
	 */
	public void setTIMEOFF_START(LocalDate tIMEOFF_START) {
		TIMEOFF_START = tIMEOFF_START;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReimbursementRequest [REIMBURSE_ID=" + REIMBURSE_ID + ", EMP_ID=" + EMP_ID
				+ ", REIMBURSE_COST=" + REIMBURSE_COST + ", REIMBURSE_EVENT_TYPE="
				+ REIMBURSE_EVENT_TYPE + ", REIMBURSE_DATE=" + REIMBURSE_DATE
				+ ", REIMBURSE_LOCATION=" + REIMBURSE_LOCATION + "]";
	}
	
	/**
	 * Update status.
	 *
	 * @param approval the approval
	 * @return true, if successful
	 */
	public boolean updateStatus(Integer approval) {
		switch (approval) {
			case 0:
				if (reimburse_status == "denied") {
					return false;
				}
				reimburse_status = "denied";
				return true;
			case 1:
				if (reimburse_status == "pending_dephead") {
					return false;
				}
				reimburse_status = "pending_dephead";
				return true;
			case 2:
				if (reimburse_status == "pending_benco") {
					return false;
				}
				reimburse_status = "pending_benco";
				return true;
			case 3:
				if (reimburse_status == "approved") {
					return false;
				}
				reimburse_status = "approved";
				return true;
			default:
				reimburse_status = "denied";
				return false;
		}
	}
}
