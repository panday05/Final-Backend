package com.workersforyou.workersforyou.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@NotEmpty(message = "email is required")
	private String email;
	@NotEmpty(message = "password is required")
	private String password;
	private int phoneNo;
	private String address;

//	@OneToMany
//	@JoinColumn(name="workerId")
//    private List<Worker> worker;

	@OneToOne(cascade = CascadeType.ALL)
	private UserLogin login;

//	@OneToOne(mappedBy = "user")
//	private Payment payment;

	public User(int id, String name, @NotEmpty(message = "email is required") String email,
			@NotEmpty(message = "password is required") String password, int phoneNo, String address,
			List<Worker> worker, UserLogin login, Payment payment) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
		// this.worker = worker;
		this.login = login;
		// this.payment = payment;

	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public List<Worker> getWorker() {
//		return worker;
//	}
//
//	public void setWorker(List<Worker> worker) {
//		this.worker = worker;
//	}

	public UserLogin getLogin() {
		return login;
	}

	public void setLogin(UserLogin login) {
		this.login = login;
	}

//	public Payment getPayment() {
//		return payment;
//	}
//
//	public void setPayment(Payment payment) {
//		this.payment = payment;
//	}

//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phoneNo="
//				+ phoneNo + ", address=" + address + ", worker=" + worker + ", login=" + login + ", payment=" + payment
//				+ "]";
//	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phoneNo="
				+ phoneNo + ", address=" + address + ", login=" + login + "]";
	}

}
