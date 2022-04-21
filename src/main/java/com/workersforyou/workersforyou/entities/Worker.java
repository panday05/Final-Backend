package com.workersforyou.workersforyou.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "worker")
public class Worker {

	@Id
	@Column(name = "workerId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int workerId;
	private String name;
	@NotEmpty(message = "email is required")
	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-0.-]+$")
	private String email;
	@NotEmpty(message = "password is required")
	private String password;
	private Long phoneNumber;
	private String address;
	private Long adharNumber;
	private String services;
	//private String wphoto;
	@OneToOne(cascade=CascadeType.ALL)
	private WorkerLogin login;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="serviceId")
	private Service service;

public Worker(int workerId, String name, @NotEmpty(message = "email is required") String email,
		@NotEmpty(message = "password is required") String password, Long phoneNumber, String address, Long adharNumber,
		String services, WorkerLogin login, Service service) {
	super();
	this.workerId = workerId;
	this.name = name;
	this.email = email;
	this.password = password;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.adharNumber = adharNumber;
	this.services = services;
	this.login = login;
	this.service = service;
}

public Worker() {
	super();
}

@Override
public String toString() {
	return "Worker [workerId=" + workerId + ", name=" + name + ", email=" + email + ", password=" + password
			+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", adharNumber=" + adharNumber + ", services="
			+ services + ", login=" + login + ", service=" + service + "]";
}

public int getWorkerId() {
	return workerId;
}

public void setWorkerId(int workerId) {
	this.workerId = workerId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Long getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Long getAdharNumber() {
	return adharNumber;
}

public void setAdharNumber(Long adharNumber) {
	this.adharNumber = adharNumber;
}

public String getServices() {
	return services;
}

public void setServices(String services) {
	this.services = services;
}

public WorkerLogin getLogin() {
	return login;
}

public void setLogin(WorkerLogin login) {
	this.login = login;
}

public Service getService() {
	return service;
}

public void setService(Service service) {
	this.service = service;
}

	
	
}
