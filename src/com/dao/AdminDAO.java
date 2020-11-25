package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Admin;

public class AdminDAO {

	


	ArrayList<Admin>  admin;
	Connection con;
	MyConnection mycon;
	
	public AdminDAO()
	{
		admin=new ArrayList<Admin>();
		mycon =new MyConnection();
		}
	
	public ArrayList<Admin> getAdmin()
	{
		con=mycon.getMyConnection();
		try
		{
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from admin");
		while(rs.next())
		{
			Admin d1=new Admin();
			d1.setEmailId(rs.getString(1));
		    d1.setPassword(rs.getString(2));
		    d1.setName(rs.getString(3));
		
		    admin.add(d1);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return admin;
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
	

	
	
	public boolean updateEmployee(Employee empu)
	{
		boolean flag=false;
	
		con=mycon.getMyConnection();
		try
		{
			PreparedStatement pstmt=con.prepareStatement("update employee set EmployeeName=?,Address=?,phone=?  where Employeeid=?");
			
			
			
			pstmt.setString(1,empu.getEname());
			pstmt.setString(2,empu.getEadd());
			pstmt.setString(3,empu.getEphone());
			pstmt.setString(4,empu.getEid());
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
	
	
	
	
	public boolean InsertEmployee(Employee e)
	{
		boolean flag=false;
	
		con=mycon.getMyConnection();
		try
		{
			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?,?)");
			
			pstmt.setString(1,e.getEid());
			pstmt.setString(2,e.getEname());
			pstmt.setString(3,e.getEadd());
			pstmt.setString(4,e.getEphone());
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

	

