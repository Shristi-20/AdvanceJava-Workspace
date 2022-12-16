package requestDispatchPkg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		String fname=request.getParameter("fname"); 
		String lname=request.getParameter("lname"); 
		if( (fname!=null && fname.trim().length()!=0) && (lname!=null && lname.trim().length()!=0))
		  request.getRequestDispatcher("Success").forward( request, response); 
		else{
		   request.setAttribute("errorattr", "first name or last name not entered");
		   request.getRequestDispatcher("Error").include(request, response);
		   //getServletContext().getNamedDispatcher("error").include( request, response);
		   request.getRequestDispatcher("index.html").include(request, response); 		
		}	

	}


}
