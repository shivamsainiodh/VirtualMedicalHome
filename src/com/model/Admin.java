package com.model;

public class Admin {
	String emailId;
	String password;
	String name;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String emailId, String password, String name) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Admin [emailId=" + emailId + ", password=" + password + ", name=" + name + "]";
	}
	
	
	
}
