package sessionPkg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv2
 */
@WebServlet("/Serv2")
public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		java.io.PrintWriter out = response.getWriter(); 
//		out.println("<html><body><h1>Welcome Again "+ request.getParameter("login")+"! "+ request.getParameter("passwd")+"</h1>"); 
//		out.println("</body></html>");
    	javax.servlet.http.Cookie ck[]=request.getCookies();
//		if(ck.length==2)
//			out.println("<html><body><h1>Welcome Again "+ ck[0].getValue()+"! "+ ck[1].getValue()); 
//		else if(ck.length==1)
//			out.println("<html><body><h1>Welcome Again "+ ck[0].getValue()+"! "); 
//		else
//			out.println("<html><body><h1>Welcome Again "+ null+"! "+ null); 

    	//With HttpSession:
    			javax.servlet.http.HttpSession session= request.getSession(); 
    			out.println("<html><body><h1>Welcome Again "+ session.getAttribute("loginid")+"!"+session.getAttribute("passwd"));
    	
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
