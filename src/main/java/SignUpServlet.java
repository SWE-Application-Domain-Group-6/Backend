
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



//uncomment if using eclipse/not downloading sql plugin for intellij
//import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String fname;
	String lname;
	String password;
	String permission_Level = "regular";
	String address;
	Date dob;
	String email;

	String temp;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
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
		Connection connection;
		fname = request.getParameter("firstname");
		lname = request.getParameter("lastname");
		password = request.getParameter("psw");
		email = request.getParameter("email");
		address = request.getParameter("address");
		temp = request.getParameter("dob");

		try {
			dob  = new SimpleDateFormat("dd/MM/yyyy").parse(temp);
		} catch (ParseException e) {
			System.out.println("Date formatting error");
			throw new RuntimeException(e);
		}

		try {
			String sinsert = "from ui ('" + fname + "', '" +  lname + "', '" + email + "', '" + address + "', '" + temp + "')";
			System.out.println(sinsert);

			SignUp.signup(password, fname, lname, email, address, temp);


			if(request.getParameter("pageName").equals("admin")){
				RequestDispatcher rd=request.getRequestDispatcher("AdminView Confirmation Screen.html");
				rd.forward(request,response);
			} else if (request.getParameter("pageName").equals("manager")) {
				RequestDispatcher rd=request.getRequestDispatcher("ManagerView Confirmation Screen.html");
				rd.forward(request,response);
			} else if (request.getParameter("pageName").equals("accountant")) {
				RequestDispatcher rd=request.getRequestDispatcher("AccountantView Confirmation Screen.html");
				rd.forward(request,response);
			}




		} catch (SQLException e) {
			throw new RuntimeException(e);
		}


	}

}
