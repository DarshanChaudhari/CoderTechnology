package com.jp.insurance.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

	private Long userId;
	private String username;
	private String password;
	private Integer roleId;
	private Integer questionId;
	private String securityAnswer;
	private Integer failedLoginAttempt;
	private char accountLocked;
	private Date creationDate;
	private Date lastModifiedDate;
	private Date lastSuccessfulLoginDate;
	private String modifiedBy;

	@Id
	@Column(name="userId")
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	@Column(name="username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="roleId")
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	@Column(name="questionId")
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	
	@Column(name="securityanswer")
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	
	@Column(name="failedLoginAttempt")
	public Integer getFailedLoginAttempt() {
		return failedLoginAttempt;
	}
	public void setFailedLoginAttempt(Integer failedLoginAttempt) {
		this.failedLoginAttempt = failedLoginAttempt;
	}
	
	@Column(name="accountLocked")
	public char getAccountLocked() {
		return accountLocked;
	}
	public void setAccountLocked(char accountLocked) {
		this.accountLocked = accountLocked;
	}
	
	@Column(name="creationDate")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	@Column(name="lastModifiedDate")
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
	@Column(name="lastSuccessfulLoginDate")
	public Date getLastSuccessfulLoginDate() {
		return lastSuccessfulLoginDate;
	}
	public void setLastSuccessfulLoginDate(Date lastSuccessfulLoginDate) {
		this.lastSuccessfulLoginDate = lastSuccessfulLoginDate;
	}
	
	@Column(name="modifiedBy")
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", roleId=" + roleId
				+ ", questionId=" + questionId + ", securityAnswer=" + securityAnswer + ", failedLoginAttempt="
				+ failedLoginAttempt + ", accountLocked=" + accountLocked + ", creationDate=" + creationDate
				+ ", lastModifiedDate=" + lastModifiedDate + ", lastSuccessfulLoginDate=" + lastSuccessfulLoginDate
				+ ", modifiedBy=" + modifiedBy + "]";
	}
	
	
}
