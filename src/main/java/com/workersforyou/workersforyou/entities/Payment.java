package com.workersforyou.workersforyou.entities;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

	@Id
	private int paymentId;
	private Double paymentAmount;
	
	@OneToOne
	@JoinColumn(name="userId")
	private User user;
	

	public Payment(int paymentId, Double paymentAmount, User user) {
		super();
		this.paymentId = paymentId;
		this.paymentAmount = paymentAmount;
		this.user = user;
	}

	public Payment() {
		super();
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
	
	
}
