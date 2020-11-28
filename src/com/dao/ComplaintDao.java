package com.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.ArrayList;
import com.model.complaint;

	public class ComplaintDao {


		ArrayList<complaint>  comp;
		Connection con;
		MyConnection mycon;
		
		public ComplaintDao()
		{
			comp=new ArrayList<complaint>();
			mycon =new MyConnection();
			}
		
		public ArrayList<complaint> getComplaint()
		{
			con=mycon.getMyConnection();
			try
			{
				Statement stmt=con.createStatement();
				
				ResultSet rs=stmt.executeQuery("select * from complaint");
			while(rs.next())
			{
				complaint a=new complaint();
				a.setDoctorId(rs.getString(1));
				a.setComplaint(rs.getString(2));
			
				comp.add(a);
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return comp;
		}
		
		
		
		public boolean insertComplaint(String did,String compl )
		{
			boolean flag=false;
		
			con=mycon.getMyConnection();
			try
			{
				 PreparedStatement pstmt=con.prepareStatement("insert into complaint values(?,?)");
					
					pstmt.setString(1,did);
					pstmt.setString(2, compl);
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
