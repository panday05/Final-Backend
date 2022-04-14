package com.workersforyou.workersforyou.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Service {

	@Id
	@GeneratedValue
	private int serviceId;
	private String serviceType;
	private int workerId;
	
	@OneToMany(mappedBy = "service")
	private List<Worker> worker;

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

//	public int getWorkerId() {
//		return workerId;
//	}
//
//	public void setWorkerId(int workerId) {
//		this.workerId = workerId;
//	}

	public void setWorker(List<Worker> worker) {
		this.worker = worker;
	}

	public Service(int serviceId, String serviceType, int workerId, List<Worker> worker) {
		super();
		this.serviceId = serviceId;
		this.serviceType = serviceType;
		this.workerId = workerId;
		this.worker = worker;
	}

	public Service() {
		super();
	}

	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", serviceType=" + serviceType + ", workerId=" + workerId
				+ ", worker=" + worker + "]";
	}

	
	
}
