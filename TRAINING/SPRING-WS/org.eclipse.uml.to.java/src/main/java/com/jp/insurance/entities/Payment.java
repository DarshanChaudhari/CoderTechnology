/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package com.jp.insurance.entities;

import java.util.Date;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Payment.
 * 
 * @author Administrator
 */
public class Payment {
	/**
	 * Description of the property paymentId.
	 */
	private Long paymentId = Long.valueOf(0L);

	/**
	 * Description of the property policyId.
	 */
	private Long policyId = Long.valueOf(0L);

	/**
	 * Description of the property nameOnCard.
	 */
	private String nameOnCard = "";

	/**
	 * Description of the property cardNo.
	 */
	private String cardNo = "";

	/**
	 * Description of the property cardExpirtDate.
	 */
	private String cardExpirtDate = "";

	/**
	 * Description of the property policyAmount.
	 */
	private Float policyAmount = Float.valueOf(0F);

	/**
	 * Description of the property paymentDate.
	 */
	private Date paymentDate = new Date();

	// Start of user code (user defined attributes for Payment)

	// End of user code

	/**
	 * The constructor.
	 */
	public Payment() {
		// Start of user code constructor for Payment)
		super();
		// End of user code
	}

	/**
	 * Description of the method getPaymentId.
	 * @return 
	 */
	public Long getPaymentId() {
		// Start of user code for method getPaymentId
		Long getPaymentId = Long.valueOf(0L);
		return getPaymentId;
		// End of user code
	}

	/**
	 * Description of the method setPaymentId.
	 * @param paymentId 
	 */
	public void setPaymentId(Long paymentId) {
		// Start of user code for method setPaymentId
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
	 * Description of the method getNameOnCard.
	 * @return 
	 */
	public String getNameOnCard() {
		// Start of user code for method getNameOnCard
		String getNameOnCard = "";
		return getNameOnCard;
		// End of user code
	}

	/**
	 * Description of the method setNameOnCard.
	 * @param nameOnCard 
	 */
	public void setNameOnCard(String nameOnCard) {
		// Start of user code for method setNameOnCard
		// End of user code
	}

	/**
	 * Description of the method getCardNo.
	 * @return 
	 */
	public String getCardNo() {
		// Start of user code for method getCardNo
		String getCardNo = "";
		return getCardNo;
		// End of user code
	}

	/**
	 * Description of the method setCardNo.
	 * @param cardNo 
	 */
	public void setCardNo(String cardNo) {
		// Start of user code for method setCardNo
		// End of user code
	}

	/**
	 * Description of the method getCardExpirtDate.
	 * @return 
	 */
	public String getCardExpirtDate() {
		// Start of user code for method getCardExpirtDate
		String getCardExpirtDate = "";
		return getCardExpirtDate;
		// End of user code
	}

	/**
	 * Description of the method setCardExpirtDate.
	 * @param cardExpirtDate 
	 */
	public void setCardExpirtDate(String cardExpirtDate) {
		// Start of user code for method setCardExpirtDate
		// End of user code
	}

	/**
	 * Description of the method getPolicyAmount.
	 * @return 
	 */
	public Float getPolicyAmount() {
		// Start of user code for method getPolicyAmount
		Float getPolicyAmount = Float.valueOf(0F);
		return getPolicyAmount;
		// End of user code
	}

	/**
	 * Description of the method setPolicyAmount.
	 * @param policyAmount 
	 */
	public void setPolicyAmount(Float policyAmount) {
		// Start of user code for method setPolicyAmount
		// End of user code
	}

	/**
	 * Description of the method getPaymentDate.
	 * @return 
	 */
	public Date getPaymentDate() {
		// Start of user code for method getPaymentDate
		Date getPaymentDate = new Date();
		return getPaymentDate;
		// End of user code
	}

	/**
	 * Description of the method setPaymentDate.
	 * @param paymentDate 
	 */
	public void setPaymentDate(Date paymentDate) {
		// Start of user code for method setPaymentDate
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

	// Start of user code (user defined methods for Payment)

	// End of user code
	/**
	 * Returns paymentId.
	 * @return paymentId 
	 */
	public Long getPaymentId() {
		return this.paymentId;
	}

	/**
	 * Sets a value to attribute paymentId. 
	 * @param newPaymentId 
	 */
	public void setPaymentId(Long newPaymentId) {
		if (this.paymentId != null) {
			this.paymentId.set(null);
		}
		this.paymentId.set(this);
	}

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
	 * Returns nameOnCard.
	 * @return nameOnCard 
	 */
	public String getNameOnCard() {
		return this.nameOnCard;
	}

	/**
	 * Sets a value to attribute nameOnCard. 
	 * @param newNameOnCard 
	 */
	public void setNameOnCard(String newNameOnCard) {
		if (this.nameOnCard != null) {
			this.nameOnCard.set(null);
		}
		this.nameOnCard.set(this);
	}

	/**
	 * Returns cardNo.
	 * @return cardNo 
	 */
	public String getCardNo() {
		return this.cardNo;
	}

	/**
	 * Sets a value to attribute cardNo. 
	 * @param newCardNo 
	 */
	public void setCardNo(String newCardNo) {
		if (this.cardNo != null) {
			this.cardNo.set(null);
		}
		this.cardNo.set(this);
	}

	/**
	 * Returns cardExpirtDate.
	 * @return cardExpirtDate 
	 */
	public String getCardExpirtDate() {
		return this.cardExpirtDate;
	}

	/**
	 * Sets a value to attribute cardExpirtDate. 
	 * @param newCardExpirtDate 
	 */
	public void setCardExpirtDate(String newCardExpirtDate) {
		if (this.cardExpirtDate != null) {
			this.cardExpirtDate.set(null);
		}
		this.cardExpirtDate.set(this);
	}

	/**
	 * Returns policyAmount.
	 * @return policyAmount 
	 */
	public Float getPolicyAmount() {
		return this.policyAmount;
	}

	/**
	 * Sets a value to attribute policyAmount. 
	 * @param newPolicyAmount 
	 */
	public void setPolicyAmount(Float newPolicyAmount) {
		if (this.policyAmount != null) {
			this.policyAmount.set(null);
		}
		this.policyAmount.set(this);
	}

	/**
	 * Returns paymentDate.
	 * @return paymentDate 
	 */
	public Date getPaymentDate() {
		return this.paymentDate;
	}

	/**
	 * Sets a value to attribute paymentDate. 
	 * @param newPaymentDate 
	 */
	public void setPaymentDate(Date newPaymentDate) {
		if (this.paymentDate != null) {
			this.paymentDate.set(null);
		}
		this.paymentDate.set(this);
	}

}
