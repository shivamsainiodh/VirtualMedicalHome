package com.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDAO;
import com.dao.AppointMentDAO;
import com.dao.DoctorDAO;
import com.dao.PatientDAO;
import com.model.Admin;
import com.model.Appointment;
import com.model.Doctor;
import com.model.Patient;



/**
 * Servlet implementation class adminServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext ctx;
	HttpSession mySession;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ctx=config.getServletContext();
	}

	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		mySession=request.getSession(true);
		String op=request.getParameter("rad");
		String emailid=request.getParameter("id");
		String pass=request.getParameter("pass");
		PrintWriter pw=response.getWriter();
		RequestDispatcher rdis;
		if(op.equals("admin"))
		{
			Admin d1=new Admin();
		ArrayList<Admin> al=new ArrayList<Admin>();
		AdminDAO adao=new AdminDAO();
	  al=adao.getAdmin();
	  int f=1;
	  for(Admin d:al)
	  {
		  if(d.getEmailId().equals(emailid) && d.getPassword().equals(pass))
		  {     f=0;
			    mySession.setAttribute("ADMIN",d);
			    rdis=ctx.getRequestDispatcher("/adminHomePage.jsp");
				rdis.forward(request,response);
		  }
		 
	  }
	  if(f==1)
	  {
		  
				pw.println("Admin details are Incorrect");
	
	  }
			}
		
		else if(op.equals("patient"))
		{ 
			Patient d1=new Patient();
		ArrayList<Patient> al=new ArrayList<Patient>();
		PatientDAO pdao=new PatientDAO();
		
		
		
	  al=pdao.getPatient();
	  int f=1;
	  for(Patient d:al)
	  {
		  if(d.getEmailid().equals(emailid) && d.getPass().equals(pass))
		  {     f=0;
			    mySession.setAttribute("PATIENT",d);
			    rdis=ctx.getRequestDispatcher("/patientHomePage.jsp");
				rdis.forward(request,response);
		  }
		 
	  }
	  if(f==1)
	  {
		  
				pw.println("Patient details are Incorrect");
	
	  }
			}
		else if(op.equals("doctor"))
		{
				  Doctor d1=new Doctor();
					ArrayList<Doctor> al=new ArrayList<Doctor>();
					DoctorDAO docdao=new DoctorDAO();
				  al=docdao.getDoctor();
				  int f=1;
				  
				    Appointment apoint=new Appointment();
					AppointMentDAO adao=new AppointMentDAO();
					ArrayList<Appointment> alappoint=adao.getAppointment();
					mySession.setAttribute("APPOINT",alappoint);
					
				  
				  
				  
				 for(Doctor d:al)
				  {
					  if(d.getDoctorId().equals(emailid) && d.getPassword().equals(pass))
					  {     f=0;
						    mySession.setAttribute("DOCTOR",d);
						    rdis=ctx.getRequestDispatcher("/DoctorHomePage.jsp");
							rdis.forward(request,response);
					  }
					 
				  }
				  if(f==1)
				  {
					  
							pw.println("Doctor details are Incorrect");
				
				  }
				  
				  
				  
				  
				  
				  
				  
				  
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
