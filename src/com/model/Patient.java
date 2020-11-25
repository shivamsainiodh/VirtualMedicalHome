package com.model;

public class Patient {
	 String emailid;
	 String pass;
	 String cnfpass;
	 String name;
	 String address;
	 String gender;
	 String phone;
	 String dob;
	 String occupation;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String emailid, String pass, String cnfpass, String name, String address, String gender,
			String phone, String dob, String occupation) {
		super();
		this.emailid = emailid;
		this.pass = pass;
		this.cnfpass = cnfpass;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
		this.dob = dob;
		this.occupation = occupation;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCnfpass() {
		return cnfpass;
	}
	public void setCnfpass(String cnfpass) {
		this.cnfpass = cnfpass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	@Override
	public String toString() {
		return "Patient [emailid=" + emailid + ", pass=" + pass + ", cnfpass=" + cnfpass + ", name=" + name
				+ ", address=" + address + ", gender=" + gender + ", phone=" + phone + ", dob=" + dob + ", occupation="
				+ occupation + "]";
	}
	
	
	
	
	
	
	
	
}
