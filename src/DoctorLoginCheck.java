

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoctorLoginCheck
 */
@WebServlet("/DoctorLoginCheck")
public class DoctorLoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext ctx;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorLoginCheck() {
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
		
		
		
		
		String emailid=request.getParameter("id");
		String pass=request.getParameter("pass");
		PrintWriter pw=response.getWriter();
		RequestDispatcher rdis;
		  try
		    {
					Class.forName("com.mysql.jdbc.Driver");
				    Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualmedicalhome","root","SHIVAM000#");
				    Statement stmt=con.createStatement();
				    ResultSet rs=stmt.executeQuery("select * from doctor");
				    int flag=0;
					while(rs.next())
					{
						
						if(rs.getString(1).equals(emailid) && rs.getString(2).equals(pass))
						{
							flag=1;
							rdis=ctx.getRequestDispatcher("/DoctorHomePage.jsp");
							rdis.forward(request,response);
						
					    }
					}
					if(flag==0)
					{
						pw.println("Doctor Details are Incorrect");
					}
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
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
