package ServPkg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		response.setContentType("text/html");  
	    java.io.PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("username");  
	    String p=request.getParameter("userpass");  
	    try {
			Class.forName("org.postgresql.Driver");//Load the driver to JVM
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javadb", "postgres", "password");
			Statement stmt=c.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from login where u='"+n+"' and p='"+ p + "';");
			 if(rs.next())
		          out.print("Welcome "+n);  
		    else
		          out.print("Sorry username or password error");
			
		} catch (Exception e) {
			System.err.println(e);
		}
	   

	}
}

