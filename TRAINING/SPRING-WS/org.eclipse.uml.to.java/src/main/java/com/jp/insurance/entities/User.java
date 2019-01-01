/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package com.jp.insurance.entities;

import java.util.Date;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of User.
 * 
 * @author Administrator
 */
public class User {
	/**
	 * Description of the property userId.
	 */
	private Long userId = Long.valueOf(0L);

	/**
	 * Description of the property username.
	 */
	private String username = "";

	/**
	 * Description of the property password.
	 */
	private String password = "";

	/**
	 * Description of the property roleId.
	 */
	private Integer roleId = Integer.valueOf(0);

	/**
	 * Description of the property questionId.
	 */
	private Integer questionId = Integer.valueOf(0);

	/**
	 * Description of the property securityAnswer.
	 */
	private String securityAnswer = "";

	/**
	 * Description of the property failedLoginAttempt.
	 */
	private Integer failedLoginAttempt = Integer.valueOf(0);

	/**
	 * Description of the property accountLocked.
	 */
	private char accountLocked = 0;

	/**
	 * Description of the property creationDate.
	 */
	private Date creationDate = new Date();

	/**
	 * Description of the property lastModifiedDate.
	 */
	private Date lastModifiedDate = new Date();

	/**
	 * Description of the property lastSuccessfulLoginDate.
	 */
	private Date lastSuccessfulLoginDate = new Date();

	/**
	 * Description of the property modifiedBy.
	 */
	private String modifiedBy = "";

	// Start of user code (user defined attributes for User)

	// End of user code

	/**
	 * The constructor.
	 */
	public User() {
		// Start of user code constructor for User)
		super();
		// End of user code
	}

	/**
	 * Description of the method getUserId.
	 * @return 
	 */
	public Long getUserId() {
		// Start of user code for method getUserId
		Long getUserId = Long.valueOf(0L);
		return getUserId;
		// End of user code
	}

	/**
	 * Description of the method setUserId.
	 * @param userId 
	 */
	public void setUserId(Long userId) {
		// Start of user code for method setUserId
		// End of user code
	}

	/**
	 * Description of the method getUsername.
	 * @return 
	 */
	public String getUsername() {
		// Start of user code for method getUsername
		String getUsername = "";
		return getUsername;
		// End of user code
	}

	/**
	 * Description of the method setUsername.
	 * @param username 
	 */
	public void setUsername(String username) {
		// Start of user code for method setUsername
		// End of user code
	}

	/**
	 * Description of the method getPassword.
	 * @return 
	 */
	public String getPassword() {
		// Start of user code for method getPassword
		String getPassword = "";
		return getPassword;
		// End of user code
	}

	/**
	 * Description of the method setPassword.
	 * @param password 
	 */
	public void setPassword(String password) {
		// Start of user code for method setPassword
		// End of user code
	}

	/**
	 * Description of the method getRoleId.
	 * @return 
	 */
	public Integer getRoleId() {
		// Start of user code for method getRoleId
		Integer getRoleId = Integer.valueOf(0);
		return getRoleId;
		// End of user code
	}

	/**
	 * Description of the method setRoleId.
	 * @param roleId 
	 */
	public void setRoleId(Integer roleId) {
		// Start of user code for method setRoleId
		// End of user code
	}

	/**
	 * Description of the method getQuestionId.
	 * @return 
	 */
	public Integer getQuestionId() {
		// Start of user code for method getQuestionId
		Integer getQuestionId = Integer.valueOf(0);
		return getQuestionId;
		// End of user code
	}

	/**
	 * Description of the method setQuestionId.
	 * @param questionId 
	 */
	public void setQuestionId(Integer questionId) {
		// Start of user code for method setQuestionId
		// End of user code
	}

	/**
	 * Description of the method getSecurityAnswer.
	 * @return 
	 */
	public String getSecurityAnswer() {
		// Start of user code for method getSecurityAnswer
		String getSecurityAnswer = "";
		return getSecurityAnswer;
		// End of user code
	}

	/**
	 * Description of the method setSecurityAnswer.
	 * @param securityAnswer 
	 */
	public void setSecurityAnswer(String securityAnswer) {
		// Start of user code for method setSecurityAnswer
		// End of user code
	}

	/**
	 * Description of the method getFailedLoginAttempt.
	 * @return 
	 */
	public Integer getFailedLoginAttempt() {
		// Start of user code for method getFailedLoginAttempt
		Integer getFailedLoginAttempt = Integer.valueOf(0);
		return getFailedLoginAttempt;
		// End of user code
	}

	/**
	 * Description of the method setFailedLoginAttempt.
	 * @param failedLoginAttempt 
	 */
	public void setFailedLoginAttempt(Integer failedLoginAttempt) {
		// Start of user code for method setFailedLoginAttempt
		// End of user code
	}

	/**
	 * Description of the method getAccountLocked.
	 * @return 
	 */
	public char getAccountLocked() {
		// Start of user code for method getAccountLocked
		char getAccountLocked = 0;
		return getAccountLocked;
		// End of user code
	}

	/**
	 * Description of the method setAccountLocked.
	 * @param accountLocked 
	 */
	public void setAccountLocked(char accountLocked) {
		// Start of user code for method setAccountLocked
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
	 * Description of the method getLastModifiedDate.
	 * @return 
	 */
	public Date getLastModifiedDate() {
		// Start of user code for method getLastModifiedDate
		Date getLastModifiedDate = new Date();
		return getLastModifiedDate;
		// End of user code
	}

	/**
	 * Description of the method setLastModifiedDate.
	 * @param lastModifiedDate 
	 */
	public void setLastModifiedDate(Date lastModifiedDate) {
		// Start of user code for method setLastModifiedDate
		// End of user code
	}

	/**
	 * Description of the method getLastSuccessfulLoginDate.
	 * @return 
	 */
	public Date getLastSuccessfulLoginDate() {
		// Start of user code for method getLastSuccessfulLoginDate
		Date getLastSuccessfulLoginDate = new Date();
		return getLastSuccessfulLoginDate;
		// End of user code
	}

	/**
	 * Description of the method setLastSuccessfulLoginDate.
	 * @param lastSuccessfulLoginDate 
	 */
	public void setLastSuccessfulLoginDate(Date lastSuccessfulLoginDate) {
		// Start of user code for method setLastSuccessfulLoginDate
		// End of user code
	}

	/**
	 * Description of the method getModifiedBy.
	 * @return 
	 */
	public String getModifiedBy() {
		// Start of user code for method getModifiedBy
		String getModifiedBy = "";
		return getModifiedBy;
		// End of user code
	}

	/**
	 * Description of the method setModifiedBy.
	 * @param modifiedBy 
	 */
	public void setModifiedBy(String modifiedBy) {
		// Start of user code for method setModifiedBy
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

	// Start of user code (user defined methods for User)

	// End of user code
	/**
	 * Returns userId.
	 * @return userId 
	 */
	public Long getUserId() {
		return this.userId;
	}

	/**
	 * Sets a value to attribute userId. 
	 * @param newUserId 
	 */
	public void setUserId(Long newUserId) {
		if (this.userId != null) {
			this.userId.set(null);
		}
		this.userId.set(this);
	}

	/**
	 * Returns username.
	 * @return username 
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Sets a value to attribute username. 
	 * @param newUsername 
	 */
	public void setUsername(String newUsername) {
		if (this.username != null) {
			this.username.set(null);
		}
		this.username.set(this);
	}

	/**
	 * Returns password.
	 * @return password 
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Sets a value to attribute password. 
	 * @param newPassword 
	 */
	public void setPassword(String newPassword) {
		if (this.password != null) {
			this.password.set(null);
		}
		this.password.set(this);
	}

	/**
	 * Returns roleId.
	 * @return roleId 
	 */
	public Integer getRoleId() {
		return this.roleId;
	}

	/**
	 * Sets a value to attribute roleId. 
	 * @param newRoleId 
	 */
	public void setRoleId(Integer newRoleId) {
		if (this.roleId != null) {
			this.roleId.set(null);
		}
		this.roleId.set(this);
	}

	/**
	 * Returns questionId.
	 * @return questionId 
	 */
	public Integer getQuestionId() {
		return this.questionId;
	}

	/**
	 * Sets a value to attribute questionId. 
	 * @param newQuestionId 
	 */
	public void setQuestionId(Integer newQuestionId) {
		if (this.questionId != null) {
			this.questionId.set(null);
		}
		this.questionId.set(this);
	}

	/**
	 * Returns securityAnswer.
	 * @return securityAnswer 
	 */
	public String getSecurityAnswer() {
		return this.securityAnswer;
	}

	/**
	 * Sets a value to attribute securityAnswer. 
	 * @param newSecurityAnswer 
	 */
	public void setSecurityAnswer(String newSecurityAnswer) {
		if (this.securityAnswer != null) {
			this.securityAnswer.set(null);
		}
		this.securityAnswer.set(this);
	}

	/**
	 * Returns failedLoginAttempt.
	 * @return failedLoginAttempt 
	 */
	public Integer getFailedLoginAttempt() {
		return this.failedLoginAttempt;
	}

	/**
	 * Sets a value to attribute failedLoginAttempt. 
	 * @param newFailedLoginAttempt 
	 */
	public void setFailedLoginAttempt(Integer newFailedLoginAttempt) {
		if (this.failedLoginAttempt != null) {
			this.failedLoginAttempt.set(null);
		}
		this.failedLoginAttempt.set(this);
	}

	/**
	 * Returns accountLocked.
	 * @return accountLocked 
	 */
	public char getAccountLocked() {
		return this.accountLocked;
	}

	/**
	 * Sets a value to attribute accountLocked. 
	 * @param newAccountLocked 
	 */
	public void setAccountLocked(char newAccountLocked) {
		if (this.accountLocked != null) {
			this.accountLocked.set(null);
		}
		this.accountLocked.set(this);
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
	 * Returns lastModifiedDate.
	 * @return lastModifiedDate 
	 */
	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	/**
	 * Sets a value to attribute lastModifiedDate. 
	 * @param newLastModifiedDate 
	 */
	public void setLastModifiedDate(Date newLastModifiedDate) {
		if (this.lastModifiedDate != null) {
			this.lastModifiedDate.set(null);
		}
		this.lastModifiedDate.set(this);
	}

	/**
	 * Returns lastSuccessfulLoginDate.
	 * @return lastSuccessfulLoginDate 
	 */
	public Date getLastSuccessfulLoginDate() {
		return this.lastSuccessfulLoginDate;
	}

	/**
	 * Sets a value to attribute lastSuccessfulLoginDate. 
	 * @param newLastSuccessfulLoginDate 
	 */
	public void setLastSuccessfulLoginDate(Date newLastSuccessfulLoginDate) {
		if (this.lastSuccessfulLoginDate != null) {
			this.lastSuccessfulLoginDate.set(null);
		}
		this.lastSuccessfulLoginDate.set(this);
	}

	/**
	 * Returns modifiedBy.
	 * @return modifiedBy 
	 */
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	/**
	 * Sets a value to attribute modifiedBy. 
	 * @param newModifiedBy 
	 */
	public void setModifiedBy(String newModifiedBy) {
		if (this.modifiedBy != null) {
			this.modifiedBy.set(null);
		}
		this.modifiedBy.set(this);
	}

}
