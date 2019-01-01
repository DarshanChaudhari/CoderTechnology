/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package com.jp.insurance.entities;

import java.util.Date;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Policy.
 * 
 * @author Administrator
 */
public class Policy {
	/**
	 * Description of the property policyId.
	 */
	private Long policyId = Long.valueOf(0L);

	/**
	 * Description of the property customerId.
	 */
	private Long customerId = Long.valueOf(0L);

	/**
	 * Description of the property vehicleId.
	 */
	private Long vehicleId = Long.valueOf(0L);

	/**
	 * Description of the property policyStartDate.
	 */
	private Date policyStartDate = LocalDateAttributeConverter.class)
	private Date policyStartDate;

	/**
		 * Description of the property policyEndDate.
		 */
	private Date policyEndDate = LocalDateAttributeConverter.class)
	private Date policyEndDate;

	// Start of user code (user defined attributes for Policy)

	// End of user code

	/**
		 * The constructor.
		 */
	public Policy() {
		// Start of user code constructor for Policy)
		super();
		// End of user code
	}

	/**
		 * Description of the method getPolicyId.
		 * @return 
		 */
	public Long getPolicyId() {
		// Start of user code for method getPolicyId
		Long getPolicyId = Long.valueOf(0L);
		return getPolicyId;
		// End of user code
	}

	/**
	 * Description of the method setPolicyId.
	 * @param policyId 
	 */
	public void setPolicyId(Long policyId) {
		// Start of user code for method setPolicyId
		// End of user code
	}

	/**
	 * Description of the method getCustomerId.
	 * @return 
	 */
	public Long getCustomerId() {
		// Start of user code for method getCustomerId
		Long getCustomerId = Long.valueOf(0L);
		return getCustomerId;
		// End of user code
	}

	/**
	 * Description of the method setCustomerId.
	 * @param customerId 
	 */
	public void setCustomerId(Long customerId) {
		// Start of user code for method setCustomerId
		// End of user code
	}

	/**
	 * Description of the method getVehicleId.
	 * @return 
	 */
	public Long getVehicleId() {
		// Start of user code for method getVehicleId
		Long getVehicleId = Long.valueOf(0L);
		return getVehicleId;
		// End of user code
	}

	/**
	 * Description of the method setVehicleId.
	 * @param vehicleId 
	 */
	public void setVehicleId(Long vehicleId) {
		// Start of user code for method setVehicleId
		// End of user code
	}

	/**
	 * Description of the method getPolicyStartDate.
	 * @return 
	 */
	public Date getPolicyStartDate() {
		// Start of user code for method getPolicyStartDate
		Date getPolicyStartDate = new Date();
		return getPolicyStartDate;
		// End of user code
	}

	/**
	 * Description of the method setPolicyStartDate.
	 * @param policyStartDate 
	 */
	public void setPolicyStartDate(Date policyStartDate) {
		// Start of user code for method setPolicyStartDate
		// End of user code
	}

	/**
	 * Description of the method getPolicyEndDate.
	 * @return 
	 */
	public Date getPolicyEndDate() {
		// Start of user code for method getPolicyEndDate
		Date getPolicyEndDate = new Date();
		return getPolicyEndDate;
		// End of user code
	}

	/**
	 * Description of the method setPolicyEndDate.
	 * @param policyEndDate 
	 */
	public void setPolicyEndDate(Date policyEndDate) {
		// Start of user code for method setPolicyEndDate
		// End of user code
	}

	/**
	 * Description of the method toString.
	 * @return 
	 */
	public String toString() {
		// Start of user code for method toString
		String toString = "";
		return toString;
		// End of user code
	}

	// Start of user code (user defined methods for Policy)

	// End of user code
	/**
		 * Returns policyId.
		 * @return policyId 
		 */
	public Long getPolicyId() {
		return this.policyId;
	}

	/**
	 * Sets a value to attribute policyId. 
	 * @param newPolicyId 
	 */
	public void setPolicyId(Long newPolicyId) {
		if (this.policyId != null) {
			this.policyId.set(null);
		}
		this.policyId.set(this);
	}

	/**
		 * Returns customerId.
		 * @return customerId 
		 */
	public Long getCustomerId() {
		return this.customerId;
	}

	/**
	 * Sets a value to attribute customerId. 
	 * @param newCustomerId 
	 */
	public void setCustomerId(Long newCustomerId) {
		if (this.customerId != null) {
			this.customerId.set(null);
		}
		this.customerId.set(this);
	}

	/**
		 * Returns vehicleId.
		 * @return vehicleId 
		 */
	public Long getVehicleId() {
		return this.vehicleId;
	}

	/**
	 * Sets a value to attribute vehicleId. 
	 * @param newVehicleId 
	 */
	public void setVehicleId(Long newVehicleId) {
		if (this.vehicleId != null) {
			this.vehicleId.set(null);
		}
		this.vehicleId.set(this);
	}

	/**
		 * Returns policyStartDate.
		 * @return policyStartDate 
		 */
	public Date getPolicyStartDate() {
		return this.policyStartDate;
	}

	/**
	 * Sets a value to attribute policyStartDate. 
	 * @param newPolicyStartDate 
	 */
	public void setPolicyStartDate(Date newPolicyStartDate) {
		if (this.policyStartDate != null) {
			this.policyStartDate.set(null);
		}
		this.policyStartDate.set(this);
	}

	/**
		 * Returns policyEndDate.
		 * @return policyEndDate 
		 */
	public Date getPolicyEndDate() {
		return this.policyEndDate;
	}

	/**
	 * Sets a value to attribute policyEndDate. 
	 * @param newPolicyEndDate 
	 */
	public void setPolicyEndDate(Date newPolicyEndDate) {
		if (this.policyEndDate != null) {
			this.policyEndDate.set(null);
		}
		this.policyEndDate.set(this);
	}

}
