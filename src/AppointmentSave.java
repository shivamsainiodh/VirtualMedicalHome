

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AppointmentSave
 */
@WebServlet("/AppointmentSave")
public class AppointmentSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext ctx;
	HttpSession mySession;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppointmentSave() {
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
		String but = request.getParameter("submit");
		String did=but.substring(10);
		mySession=request.getSession(true);
		String pid=(String) mySession.getAttribute("ID");
		String pname=(String) mySession.getAttribute("NAME");
		PrintWriter pw=response.getWriter();
		int flag=1;
		 try
		    {
					Class.forName("com.mysql.jdbc.Driver");
				    Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualmedicalhome","root","SHIVAM000#");
				  
				    PreparedStatement pstmt=con.prepareStatement("insert into appointment values(?,?,?)");
					
					pstmt.setString(1,did);
					pstmt.setString(2,pname);
					pstmt.setString(3,pid);
					pstmt.execute();
				    flag=0;
				}
				catch(Exception ex)
				{
					flag=1;
					ex.printStackTrace();
				}
		 if (flag==0)
		 {
	
			 pw.println("<!DOCTYPE html>\r\n" + 
				  		"<html>\r\n" + 
				  		"<head>\r\n" +
				  		"                 <link rel=\"stylesheet\" type=\"text/css\" href=\"mystylesheet.css\">\r\n" + 
				  		"        \r\n" + 
				  		"    </head>\r\n" + 
				  		"    <body>\r\n");
				  		
				  pw.println("<center><h3>Your Request for Appointment is Submitted</h3></br></br>");
				  pw.println("</br><a href='patientHomepage.jsp'>Click Here To GO TO Patient HomePage</a></center></body></html>");
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
