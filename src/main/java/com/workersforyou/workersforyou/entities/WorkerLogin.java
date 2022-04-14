package com.workersforyou.workersforyou.entities;

import javax.persistence.*;

@Entity
@Table(name = "workerlogin")
public class WorkerLogin {

	@Id
	@GeneratedValue
	private int loginId;
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	private String email;
	private String password;
	@OneToOne(mappedBy = "login")
	private Worker worker;
	
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
	
	public WorkerLogin(int loginId, String email, String password, Worker worker) {
		super();
		this.loginId = loginId;
		this.email = email;
		this.password = password;
		this.worker = worker;
	}
	@Override
	public String toString() {
		return "WorkerLogin [loginId=" + loginId + ", email=" + email + ", password=" + password + ", worker=" + worker
				+ "]";
	}
	public WorkerLogin() {
		super();
	}
	
	
	
		

}
