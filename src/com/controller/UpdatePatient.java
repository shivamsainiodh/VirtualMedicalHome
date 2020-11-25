package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.PatientDAO;
import com.model.Patient;

/**
 * Servlet implementation class UpdatePatient
 */
@WebServlet("/UpdatePatient")
public class UpdatePatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePatient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		

		
		String emailid=request.getParameter("id");
		String pass=request.getParameter("pass");
		String cnfPass=request.getParameter("cnfPass");
		String name=request.getParameter("name");
		String address=request.getParameter("add");
		String gender=request.getParameter("gen");
		String phone=request.getParameter("phone");
		String dob=request.getParameter("date");
		String occ=request.getParameter("occ");
		PrintWriter pw=response.getWriter();
		 Patient pp=new Patient(emailid,pass,cnfPass,name,address,gender,phone,dob,occ);
		RequestDispatcher rdis;
		if(pass.equals(cnfPass))
		{
			
		
		 PatientDAO pdao=new PatientDAO();
		 
		  boolean flag=pdao.updatePatient(pp);
		  if(flag==true)
		  {
			  
			
			 // rdis=ctx.getRequestDispatcher("/login.jsp");
			  //rdis.forward(request,response);
			  pw.println("<!DOCTYPE html>\r\n" + 
			  		"<html>\r\n" + 
			  		"<head>\r\n" +
			  		"                 <link rel=\"stylesheet\" type=\"text/css\" href=\"mystylesheet.css\">\r\n" + 
			  		"        \r\n" + 
			  		"    </head>\r\n" + 
			  		"    <body>\r\n");
			  		
			  pw.println("<center><h3>Updation in  Successful</h3></br></br>");
			  pw.println("</br><a href='patientHomePage.jsp'>Click Here To go to HomePage</a></center></body></html>");
			  		
		  }
		
		  }
		else
		{
		   pw.println("<center>Hey! Password and Confirm Password Should be Same</center>");
		}
		
	}
	

		
		
		
		
		
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
