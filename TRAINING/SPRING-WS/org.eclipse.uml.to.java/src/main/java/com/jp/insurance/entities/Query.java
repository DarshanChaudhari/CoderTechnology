/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package com.jp.insurance.entities;

import java.util.Date;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Query.
 * 
 * @author Administrator
 */
public class Query {
	/**
	 * Description of the property queryId.
	 */
	private Long queryId = Long.valueOf(0L);

	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property emailId.
	 */
	private String emailId = "";

	/**
	 * Description of the property queryType.
	 */
	private String queryType = "";

	/**
	 * Description of the property queryDescription.
	 */
	private String queryDescription = "";

	/**
	 * Description of the property queryResponse.
	 */
	private String queryResponse = "";

	/**
	 * Description of the property creationDate.
	 */
	private Date creationDate = new Date();

	/**
	 * Description of the property assignedTo.
	 */
	private String assignedTo = "";

	/**
	 * Description of the property status.
	 */
	private String status = "";

	// Start of user code (user defined attributes for Query)

	// End of user code

	/**
	 * The constructor.
	 */
	public Query() {
		// Start of user code constructor for Query)
		super();
		// End of user code
	}

	/**
	 * Description of the method getQueryId.
	 * @return 
	 */
	public Long getQueryId() {
		// Start of user code for method getQueryId
		Long getQueryId = Long.valueOf(0L);
		return getQueryId;
		// End of user code
	}

	/**
	 * Description of the method setQueryId.
	 * @param queryId 
	 */
	public void setQueryId(Long queryId) {
		// Start of user code for method setQueryId
		// End of user code
	}

	/**
	 * Description of the method getName.
	 * @return 
	 */
	public String getName() {
		// Start of user code for method getName
		String getName = "";
		return getName;
		// End of user code
	}

	/**
	 * Description of the method setName.
	 * @param name 
	 */
	public void setName(String name) {
		// Start of user code for method setName
		// End of user code
	}

	/**
	 * Description of the method getEmailId.
	 * @return 
	 */
	public String getEmailId() {
		// Start of user code for method getEmailId
		String getEmailId = "";
		return getEmailId;
		// End of user code
	}

	/**
	 * Description of the method setEmailId.
	 * @param emailId 
	 */
	public void setEmailId(String emailId) {
		// Start of user code for method setEmailId
		// End of user code
	}

	/**
	 * Description of the method getQueryType.
	 * @return 
	 */
	public String getQueryType() {
		// Start of user code for method getQueryType
		String getQueryType = "";
		return getQueryType;
		// End of user code
	}

	/**
	 * Description of the method setQueryType.
	 * @param queryType 
	 */
	public void setQueryType(String queryType) {
		// Start of user code for method setQueryType
		// End of user code
	}

	/**
	 * Description of the method getQueryDescription.
	 * @return 
	 */
	public String getQueryDescription() {
		// Start of user code for method getQueryDescription
		String getQueryDescription = "";
		return getQueryDescription;
		// End of user code
	}

	/**
	 * Description of the method setQueryDescription.
	 * @param queryDescription 
	 */
	public void setQueryDescription(String queryDescription) {
		// Start of user code for method setQueryDescription
		// End of user code
	}

	/**
	 * Description of the method getQueryResponse.
	 * @return 
	 */
	public String getQueryResponse() {
		// Start of user code for method getQueryResponse
		String getQueryResponse = "";
		return getQueryResponse;
		// End of user code
	}

	/**
	 * Description of the method setQueryResponse.
	 * @param queryResponse 
	 */
	public void setQueryResponse(String queryResponse) {
		// Start of user code for method setQueryResponse
		// End of user code
	}

	/**
	 * Description of the method getCreationDate.
	 * @return 
	 */
	public Date getCreationDate() {
		// Start of user code for method getCreationDate
		Date getCreationDate = new Date();
		return getCreationDate;
		// End of user code
	}

	/**
	 * Description of the method setCreationDate.
	 * @param creationDate 
	 */
	public void setCreationDate(Date creationDate) {
		// Start of user code for method setCreationDate
		// End of user code
	}

	/**
	 * Description of the method getAssignedTo.
	 * @return 
	 */
	public String getAssignedTo() {
		// Start of user code for method getAssignedTo
		String getAssignedTo = "";
		return getAssignedTo;
		// End of user code
	}

	/**
	 * Description of the method setAssignedTo.
	 * @param assignedTo 
	 */
	public void setAssignedTo(String assignedTo) {
		// Start of user code for method setAssignedTo
		// End of user code
	}

	/**
	 * Description of the method getStatus.
	 * @return 
	 */
	public String getStatus() {
		// Start of user code for method getStatus
		String getStatus = "";
		return getStatus;
		// End of user code
	}

	/**
	 * Description of the method setStatus.
	 * @param status 
	 */
	public void setStatus(String status) {
		// Start of user code for method setStatus
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

	// Start of user code (user defined methods for Query)

	// End of user code
	/**
	 * Returns queryId.
	 * @return queryId 
	 */
	public Long getQueryId() {
		return this.queryId;
	}

	/**
	 * Sets a value to attribute queryId. 
	 * @param newQueryId 
	 */
	public void setQueryId(Long newQueryId) {
		if (this.queryId != null) {
			this.queryId.set(null);
		}
		this.queryId.set(this);
	}

	/**
	 * Returns name.
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(String newName) {
		if (this.name != null) {
			this.name.set(null);
		}
		this.name.set(this);
	}

	/**
	 * Returns emailId.
	 * @return emailId 
	 */
	public String getEmailId() {
		return this.emailId;
	}

	/**
	 * Sets a value to attribute emailId. 
	 * @param newEmailId 
	 */
	public void setEmailId(String newEmailId) {
		if (this.emailId != null) {
			this.emailId.set(null);
		}
		this.emailId.set(this);
	}

	/**
	 * Returns queryType.
	 * @return queryType 
	 */
	public String getQueryType() {
		return this.queryType;
	}

	/**
	 * Sets a value to attribute queryType. 
	 * @param newQueryType 
	 */
	public void setQueryType(String newQueryType) {
		if (this.queryType != null) {
			this.queryType.set(null);
		}
		this.queryType.set(this);
	}

	/**
	 * Returns queryDescription.
	 * @return queryDescription 
	 */
	public String getQueryDescription() {
		return this.queryDescription;
	}

	/**
	 * Sets a value to attribute queryDescription. 
	 * @param newQueryDescription 
	 */
	public void setQueryDescription(String newQueryDescription) {
		if (this.queryDescription != null) {
			this.queryDescription.set(null);
		}
		this.queryDescription.set(this);
	}

	/**
	 * Returns queryResponse.
	 * @return queryResponse 
	 */
	public String getQueryResponse() {
		return this.queryResponse;
	}

	/**
	 * Sets a value to attribute queryResponse. 
	 * @param newQueryResponse 
	 */
	public void setQueryResponse(String newQueryResponse) {
		if (this.queryResponse != null) {
			this.queryResponse.set(null);
		}
		this.queryResponse.set(this);
	}

	/**
	 * Returns creationDate.
	 * @return creationDate 
	 */
	public Date getCreationDate() {
		return this.creationDate;
	}

	/**
	 * Sets a value to attribute creationDate. 
	 * @param newCreationDate 
	 */
	public void setCreationDate(Date newCreationDate) {
		if (this.creationDate != null) {
			this.creationDate.set(null);
		}
		this.creationDate.set(this);
	}

	/**
	 * Returns assignedTo.
	 * @return assignedTo 
	 */
	public String getAssignedTo() {
		return this.assignedTo;
	}

	/**
	 * Sets a value to attribute assignedTo. 
	 * @param newAssignedTo 
	 */
	public void setAssignedTo(String newAssignedTo) {
		if (this.assignedTo != null) {
			this.assignedTo.set(null);
		}
		this.assignedTo.set(this);
	}

	/**
	 * Returns status.
	 * @return status 
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * Sets a value to attribute status. 
	 * @param newStatus 
	 */
	public void setStatus(String newStatus) {
		if (this.status != null) {
			this.status.set(null);
		}
		this.status.set(this);
	}

}
