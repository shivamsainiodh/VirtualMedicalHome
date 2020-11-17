

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PatientServlet
 */
@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientServlet() {
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
	
		RequestDispatcher rdis;
		if(pass.equals(cnfPass))
		{
		  boolean flag=false;
		  try
		    {
					Class.forName("com.mysql.jdbc.Driver");
				    Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualmedicalhome","root","SHIVAM000#");
				  
				    PreparedStatement pstmt=con.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?,?)");
					
					pstmt.setString(1,emailid);
					pstmt.setString(2,pass);
				    pstmt.setString(3,cnfPass);
					pstmt.setString(4,name);
					pstmt.setString(5,address);
					pstmt.setString(6,gender);
					pstmt.setString(7,phone);
					pstmt.setString(8,dob);
					pstmt.setString(9,occ);
					pstmt.execute();
					flag=true;
					
					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
					flag=false;
					
				}
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
			  		
			  pw.println("<center><h3>Sign Up is Successful</h3></br></br>");
			  pw.println("</br><a href='login.jsp'>Click Here To Login</a></center></body></html>");
			  		
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
