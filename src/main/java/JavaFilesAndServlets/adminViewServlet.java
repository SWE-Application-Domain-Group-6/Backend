package JavaFilesAndServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

// servlet for the admin view page, formatted differently because this still largely uses the old servlet
// and form system that we were using before switching most everything to jsps
@WebServlet(name = "JavaFilesAndServlets.adminViewServlet", value = "/JavaFilesAndServlets.adminViewServlet")
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

    //post method to get the data from the html form
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //getting requests/responses to and from the webserver
        doGet(request, response);
        //establishing db connection
        Connection connection;
        fname = request.getParameter("enterfname");
        lname = request.getParameter("lastname");
        password = request.getParameter("psw");
        email = request.getParameter("email");
        address = request.getParameter("address");
        temp = request.getParameter("dob");


        //if the create button has been pressed, run the signup function
        if(request.getParameter("create")!= null){
            try {
                SignUp.signup(password, fname, lname, email, address, temp);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


        role = request.getParameter("newrole");

        //if the assignrole button has been pressed, run the assign role function
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
