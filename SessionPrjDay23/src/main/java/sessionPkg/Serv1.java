package sessionPkg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv1
 */
@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*java.io.PrintWriter out = response.getWriter(); 
		String login=request.getParameter("login");
        String pd=request.getParameter("passwd");
		out.println("<html><body><h1>Welcome "+ login +"! <br> with password: " + pd); 
		out.println("<a href='Serv2'><br>Continue to next.. </a>");
		out.println("</body></html>");
		*/
    	/*
    	java.io.PrintWriter out = response.getWriter(); 
		String login=request.getParameter("login");
        String pd=request.getParameter("passwd");
		out.println("<html><body><h1>Welcome "+ login +"! <br> with password: " + pd); 
//		//No Session tracked:
//		out.println("<a href='Serv2'><br>Continue to next.. </a>");
		
		//URL Re-writing:
		out.println("<a href='Serv2?login="+login+"&passwd="+pd+"'>");
		out.println("<br>Continue to next.. </a>");

		out.println("</body></html>");
       */
    /*	java.io.PrintWriter out = response.getWriter(); 
		String login=request.getParameter("login");
        String pd=request.getParameter("passwd");
		out.println("<html><body><h1>Welcome "+ login +"! <br> with password: " + pd); 

		out.println("<form action='Serv2'>");
		out.println("<input type='hidden' name='login' value="+login+">");
		out.println("<input type='hidden' name='passwd' value="+pd+">");
		out.println("<br><input type='submit' value='Continue to next..'> </form>");


		out.println("</body></html>");
		*/
    	java.io.PrintWriter out = response.getWriter(); 
		String login=request.getParameter("login");
        String pd=request.getParameter("passwd");
		out.println("<html><body><h1>Welcome "+ login +"! <br> with password: " + pd); 

//		javax.servlet.http.Cookie ck=new javax.servlet.http.Cookie("loginid",login);//creating cookie object  
//		response.addCookie(ck);//adding cookie in the response
//		javax.servlet.http.Cookie ck1=new javax.servlet.http.Cookie("passwd",pd);//creating cookie object  
//		response.addCookie(ck1);//adding cookie in the response
//		out.println("<a href='Serv2'><br>Continue to next.. </a>");
		
		//using HttpSession:
				javax.servlet.http.HttpSession session= request.getSession(); 
				session.setAttribute("loginid",login); 
				session.setAttribute("passwd",pd); 
				out.println("<a href='Serv2'><br>Continue to next.. </a>");

		out.println("</body></html>");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
