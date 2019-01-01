/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package com.jp.insurance.entities;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of SecurityQuestion.
 * 
 * @author Administrator
 */
public class SecurityQuestion {
	/**
	 * Description of the property questionId.
	 */
	private Integer questionId = Integer.valueOf(0);

	/**
	 * Description of the property question.
	 */
	private String question = "";

	// Start of user code (user defined attributes for SecurityQuestion)

	// End of user code

	/**
	 * The constructor.
	 */
	public SecurityQuestion() {
		// Start of user code constructor for SecurityQuestion)
		super();
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
	 * Description of the method getQuestion.
	 * @return 
	 */
	public String getQuestion() {
		// Start of user code for method getQuestion
		String getQuestion = "";
		return getQuestion;
		// End of user code
	}

	/**
	 * Description of the method setQuestion.
	 * @param question 
	 */
	public void setQuestion(String question) {
		// Start of user code for method setQuestion
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

	// Start of user code (user defined methods for SecurityQuestion)

	// End of user code
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
	 * Returns question.
	 * @return question 
	 */
	public String getQuestion() {
		return this.question;
	}

	/**
	 * Sets a value to attribute question. 
	 * @param newQuestion 
	 */
	public void setQuestion(String newQuestion) {
		if (this.question != null) {
			this.question.set(null);
		}
		this.question.set(this);
	}

}
