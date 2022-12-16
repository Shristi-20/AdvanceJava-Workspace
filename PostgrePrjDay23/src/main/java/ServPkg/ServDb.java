package ServPkg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServDb
 */
@WebServlet("/ServDb")
public class ServDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServDb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		java.io.PrintWriter out=response.getWriter();
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");//Load the driver to JVM
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javadb", "postgres", "password");
			Statement stmt=c.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from company");
			while(rs.next()) {
				out.println("Name : "+ rs.getString("name") + " <br>");
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
