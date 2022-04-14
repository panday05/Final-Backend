package com.workersforyou.workersforyou.entities;

import javax.persistence.*;

@Entity
@Table(name = "bookinghistory")
public class BookingHistory {

	private int userId;
	private int adharNumber;
	private String userName;
	@Id
	private int workerId;
	private String serviceType;
	private int paymentId;
	private int paymentStatus;

	public BookingHistory(int userId, int adharNumber, String userName, int workerId, String serviceType, int paymentId,
			int paymentStatus) {
		super();
		this.userId = userId;
		this.adharNumber = adharNumber;
		this.userName = userName;
		this.workerId = workerId;
		this.serviceType = serviceType;
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		
	}

	public BookingHistory() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(int adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "BookingHistory [userId=" + userId + ", adharNumber=" + adharNumber + ", userName=" + userName
				+ ", workerId=" + workerId + ", serviceType=" + serviceType + ", paymentId=" + paymentId
				+ ", paymentStatus=" + paymentStatus + "]";
	}
	
	

}
