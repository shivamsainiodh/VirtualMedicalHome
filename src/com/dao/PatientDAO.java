package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.model.Patient;

public class PatientDAO {
	
	ArrayList<Patient>  patients;
	Connection con;
	MyConnection mycon;
	
	public PatientDAO()
	{
		patients=new ArrayList<Patient>();
		mycon =new MyConnection();
		}
	
	public ArrayList<Patient> getPatient()
	{
		con=mycon.getMyConnection();
		try
		{
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from patient");
		while(rs.next())
		{
			Patient d1=new Patient();
			d1.setEmailid(rs.getString(1));
			d1.setPass(rs.getString(2));
			d1.setCnfpass(rs.getString(3));
			d1.setName(rs.getString(4));
			d1.setAddress(rs.getString(5));
			d1.setGender(rs.getString(6));
			d1.setPhone(rs.getString(7));
			d1.setDob(rs.getString(8));
			d1.setOccupation(rs.getString(9));
			
			
		
			patients.add(d1);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return patients;
	}
	
	
	
	
	
	public boolean InsertPatient(Patient e)
	{
		boolean flag=false;
	
		con=mycon.getMyConnection();
		try
		{
			 PreparedStatement pstmt=con.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?,?)");
				
				pstmt.setString(1,e.getEmailid());
				pstmt.setString(2,e.getPass());
			    pstmt.setString(3,e.getCnfpass());
				pstmt.setString(4,e.getName());
				pstmt.setString(5,e.getAddress());
				pstmt.setString(6,e.getGender());
				pstmt.setString(7,e.getPhone());
				pstmt.setString(8,e.getDob());
				pstmt.setString(9,e.getOccupation());
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
	
	
	
	
	

	public boolean updatePatient(Patient p)
	{
		boolean flag=false;
	
		con=mycon.getMyConnection();
		try
		{
			PreparedStatement pstmt=con.prepareStatement("update patient set pass=?,cnfpass=?,name=?,address=? ,gender=?,phone=?,dob=?,occupation=?  where emailid=?");
			
			
			
			pstmt.setString(1,p.getPass());
			pstmt.setString(2,p.getCnfpass());
			pstmt.setString(3,p.getName());
			pstmt.setString(4,p.getAddress());
			pstmt.setString(5,p.getGender());
			pstmt.setString(6,p.getPhone());
			pstmt.setString(7,p.getDob());
			pstmt.setString(8,p.getOccupation());
			pstmt.setString(9,p.getEmailid());
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

	
	
	
	

