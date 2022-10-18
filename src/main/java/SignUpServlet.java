

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;

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
		fname = request.getParameter("First name");
		password = request.getParameter("psw");
		address = request.getParameter("address");
		String temp = request.getParameter("dob");
		//dob  = dob.parse(temp);
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/app_test", "root", "asdf11@ASDF");
			java.sql.Statement statement=connection.createStatement();
		//	String sql  = "VALUES (1001, "+ fname + ", "+ lname +", " + permission_Level + null + 1 + password + address ")";
			
			
		//	statement.executeUpdate("INSERT INTO user_accounts " + sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
