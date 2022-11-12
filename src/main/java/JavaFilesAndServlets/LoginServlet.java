package JavaFilesAndServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
/**
 * Servlet implementation class JavaFilesAndServlets.LoginServlet
 */
@WebServlet("/JavaFilesAndServlets.LoginServlet")
public class LoginServlet extends HttpServlet {
	String username;
	String password;
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
		// TODO Auto-generated method stub
		doGet(request, response);
		
		username = request.getParameter("username");
		password = request.getParameter("psw");
		
		System.out.println("Username: " + username + "\nPassword: " + password);
		if(Login.validate(username, password)) {
			
			if(Login.getRole(username).equals(("admin"))|Login.getRole(username).equals(("administrator"))) {
				RequestDispatcher rd=request.getRequestDispatcher("AdminView.jsp");
		        rd.forward(request,response);  
			}
			else if(Login.getRole(username).equals("manager")) {
				RequestDispatcher rd=request.getRequestDispatcher("ManagerView.jsp");
		        rd.forward(request,response);  
			}
			else if(Login.getRole(username).equals("accountant")) {
				RequestDispatcher rd=request.getRequestDispatcher("AccountantView.jsp");
				rd.forward(request,response);
			}

			else {
				RequestDispatcher rd=request.getRequestDispatcher("AccountantView.jsp");
		        rd.forward(request,response);  

			}
			
		}
		
		else{  
	        System.out.print("Sorry username or password error");  
	        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	        rd.include(request,response);  
	    }
		 
	}

}
