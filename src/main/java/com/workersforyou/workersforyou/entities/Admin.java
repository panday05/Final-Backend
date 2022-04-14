package com.workersforyou.workersforyou.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {

	@Id
//	@OneToOne
//	@JoinColumn(name = "adminId")
//	private Login login;
	private int adminId;
	private String name;
	private String emailID;
	private int contactNo;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public Admin(int adminId, String name, String emailID, int contactNo) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.emailID = emailID;
		this.contactNo = contactNo;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", emailID=" + emailID + ", contactNo=" + contactNo
				+ "]";
	}

}
