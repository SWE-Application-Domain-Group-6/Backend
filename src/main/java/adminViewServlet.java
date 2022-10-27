
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

@WebServlet(name = "adminViewServlet", value = "/adminViewServlet")
public class adminViewServlet extends HttpServlet {
    String fname;
    String lname;
    String password;
    String permission_Level = "regular";
    String address;
    Date dob;
    String email;
    String temp;
    String role;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
        Connection connection;
        fname = request.getParameter("enterfname");
        lname = request.getParameter("lastname");
        password = request.getParameter("psw");
        email = request.getParameter("email");
        address = request.getParameter("address");
        temp = request.getParameter("dob");


        //TODO: Assign function numbers in the the HTML form so that it doesn't try and run every function

        if(request.getParameter("create")!= null){
            try {
                SignUp.signup(password, fname, lname, email, address, temp);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


        role = request.getParameter("newrole");


        if(request.getParameter("assignrole")!= null){
            try {
                email = request.getParameter("em");
                System.out.println(email +"\t" + role);
                adminView.updateUser(email, role);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
