package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Doctor;

public class DoctorDAO {

	

	ArrayList<Doctor>  doctors;
	Connection con;
	MyConnection mycon;
	
	public DoctorDAO()
	{
		doctors=new ArrayList<Doctor>();
		mycon =new MyConnection();
		}
	
	public ArrayList<Doctor> getDoctor()
	{
		con=mycon.getMyConnection();
		try
		{
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from doctor");
		while(rs.next())
		{
			Doctor d1=new Doctor();
			d1.setDoctorId(rs.getString(1));
			d1.setPassword(rs.getString(2));
			d1.setConfirmPassword(rs.getString(3));
			d1.setName(rs.getString(4));
			d1.setAddress(rs.getString(5));
			d1.setGender(rs.getString(6));
			d1.setPhone(rs.getString(7));
			d1.setQualification(rs.getString(8));
			d1.setExperience(rs.getInt(9));
			d1.setSpecialization(rs.getString(10));
			
		
			doctors.add(d1);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return doctors;
	}
	
	
	
	
	
	
	

	
	public boolean InsertDoctor(Doctor e)
	{
		boolean flag=false;
	
		con=mycon.getMyConnection();
		try
		{
			 PreparedStatement pstmt=con.prepareStatement("insert into doctor values(?,?,?,?,?,?,?,?,?,?)");
				
				pstmt.setString(1,e.getDoctorId());
				pstmt.setString(2,e.getPassword());
				pstmt.setString(3,e.getConfirmPassword());
				pstmt.setString(4,e.getName());
				pstmt.setString(5,e.getAddress());
				pstmt.setString(6,e.getGender());
				pstmt.setString(7,e.getPhone());
				pstmt.setString(8,e.getQualification());
				pstmt.setInt(9,e.getExperience());
				pstmt.setString(10,e.getSpecialization());
				pstmt.execute();
				flag=true;
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			flag=false;
			
		}
	return flag;
	}
	
	
	
	
	
	
	
	public boolean updateDoctor(Doctor dd)
	{
		boolean flag=false;
	
		con=mycon.getMyConnection();
		try
		{
			PreparedStatement pstmt=con.prepareStatement("update doctor set password=?,confirmPassword=?,name=?,address=?,gender=?,phone=?,qualification=?,experience=?,specialization=?  where doctorId=?");
			
			
			
			pstmt.setString(1,dd.getPassword());
			pstmt.setString(2,dd.getConfirmPassword());
			pstmt.setString(3,dd.getName());
			pstmt.setString(4,dd.getAddress());
			pstmt.setString(5,dd.getGender());
			pstmt.setString(6,dd.getPhone());
			pstmt.setString(7,dd.getQualification());
			pstmt.setInt(8,dd.getExperience());
			pstmt.setString(9,dd.getSpecialization());
			
			
			pstmt.setString(10,dd.getDoctorId());
			pstmt.execute();
			flag=true;
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			flag=false;
			
		}
	return flag;
	}
	
	
	
}
	
/*
	public String getMaxEmployeeId()
	{
	
		String eMaxId="";
		con=mycon.getMyConnection();
		Statement stmt;
		ResultSet rs;
		try
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery("select max(Employeeid) from employee");
			rs.next();
			eMaxId=rs.getString(1);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
			
		}
	return eMaxId;
	}
	

	
	
	
	

	
	public boolean deleteEmployee(String did)
	{
		boolean flag=false;
	
		con=mycon.getMyConnection();
		try
		{
			PreparedStatement pstmt=con.prepareStatement("delete from employee where Employeeid=?");
			
			pstmt.setString(1,did);

			pstmt.execute();
			flag=true;
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			flag=false;
			
		}
	return flag;
	}
	
	
	
	
	
	
	public Employee getEmployeeById(String empId)
	{
		Employee e1=new Employee();
		con=mycon.getMyConnection();
		try
		{
			PreparedStatement pstmt=con.prepareStatement("select * from employee where Employeeid= ? ");
			
			pstmt.setString(1,empId);
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			e1.setEid(rs.getString(1));
			e1.setEname(rs.getString(2));
			e1.setEadd(rs.getString(3));
			e1.setEphone(rs.getString(4));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return e1;
	}
	
	
}*/
