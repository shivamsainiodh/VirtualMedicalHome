

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DoctorListServlet
 */
@WebServlet("/DoctorListServlet")
public class DoctorListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext ctx;
	HttpSession mySession;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorListServlet() {
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
		PrintWriter pw=response.getWriter();
		RequestDispatcher rdis;
		  try
		    {
					Class.forName("com.mysql.jdbc.Driver");
				    Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualmedicalhome","root","SHIVAM000#");
				    Statement stmt=con.createStatement();
				    ResultSet rs=stmt.executeQuery("select * from doctor");
				    mySession.setAttribute("rs",rs);
                    
					
							rdis=ctx.getRequestDispatcher("/patientDoctorList.jsp");
							rdis.forward(request,response);
			
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
