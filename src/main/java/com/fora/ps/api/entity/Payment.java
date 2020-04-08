/**
 * 
 */
package com.fora.ps.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author siva
 *
 */
@Entity
@Table(name="PAYMENT_TB")
public class Payment {
	@Id
	@GeneratedValue
	private int paymentId;
	/**
	 * @return the paymentId
	 */
	public int getPaymentId() {
		return paymentId;
	}
	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	/**
	 * @return the paymentStatus
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}
	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	/**
	 * @return the transcationId
	 */
	public String getTranscationId() {
		return transcationId;
	}
	/**
	 * @param transcationId the transcationId to set
	 */
	public void setTranscationId(String transcationId) {
		this.transcationId = transcationId;
	}
	private String paymentStatus;
	private String transcationId;
	

}
