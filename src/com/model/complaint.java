package com.model;

public class complaint {

	String doctorId;
	String complaint;
	public complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public complaint(String doctorId, String complaint) {
		super();
		this.doctorId = doctorId;
		this.complaint = complaint;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	@Override
	public String toString() {
		return "complaint [doctorId=" + doctorId + ", complaint=" + complaint + "]";
	}
	
	
	
}
