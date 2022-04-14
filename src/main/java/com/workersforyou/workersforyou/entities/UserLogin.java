package com.workersforyou.workersforyou.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userlogin")
public class UserLogin {
	
	@Id
	@GeneratedValue
	private int loginId;
	private String email;
	private String password;
	
	@OneToOne(mappedBy = "login")
	private User user;

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
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

	public void setUser(User user) {
		this.user = user;
	}

	public UserLogin(int loginId, String email, String password) {
		super();
		this.loginId = loginId;
		this.email = email;
		this.password = password;
	}

	public UserLogin() {
		super();
	}

	@Override
	public String toString() {
		return "UserLogin [loginId=" + loginId + ", email=" + email + ", password=" + password + "]";
	}

	

}
