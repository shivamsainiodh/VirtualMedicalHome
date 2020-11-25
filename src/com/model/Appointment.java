package com.model;

public class Appointment {
	String DoctorId;
	String PatientName;
	String PatientId;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(String doctorId, String patientName, String patientId) {
		super();
		DoctorId = doctorId;
		PatientName = patientName;
		PatientId = patientId;
	}
	public String getDoctorId() {
		return DoctorId;
	}
	public void setDoctorId(String doctorId) {
		DoctorId = doctorId;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getPatientId() {
		return PatientId;
	}
	public void setPatientId(String patientId) {
		PatientId = patientId;
	}
	@Override
	public String toString() {
		return "Appointment [DoctorId=" + DoctorId + ", PatientName=" + PatientName + ", PatientId=" + PatientId + "]";
	}
	
	

}
