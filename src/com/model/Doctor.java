package com.model;

public class Doctor {
 String doctorId;
 String password;
 String confirmPassword;
 String name;
 String address;
 String gender;
 String phone;
 String qualification;
 int experience;
 String specialization;
public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}
public Doctor(String doctorId, String password, String confirmPassword, String name, String address, String gender,
		String phone, String qualification, int experience, String specialization) {
	super();
	this.doctorId = doctorId;
	this.password = password;
	this.confirmPassword = confirmPassword;
	this.name = name;
	this.address = address;
	this.gender = gender;
	this.phone = phone;
	this.qualification = qualification;
	this.experience = experience;
	this.specialization = specialization;
}
public String getDoctorId() {
	return doctorId;
}
public void setDoctorId(String doctorId) {
	this.doctorId = doctorId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
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
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
@Override
public String toString() {
	return "Doctor [doctorId=" + doctorId + ", password=" + password + ", confirmPassword=" + confirmPassword
			+ ", name=" + name + ", address=" + address + ", gender=" + gender + ", phone=" + phone + ", qualification="
			+ qualification + ", experience=" + experience + ", specialization=" + specialization + "]";
}
 
 
 
 
 
 
 
}
