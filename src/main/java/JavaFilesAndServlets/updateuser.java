package JavaFilesAndServlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "JavaFilesAndServlets.updateuser", value = "/JavaFilesAndServlets.updateuser")
public class updateuser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //this is the method to update a users role
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email;
       //getting the new role from the UI
        String role = request.getParameter("newrole");

        try {
            //getting the user and updating their role
            email = request.getParameter("usn");
            adminView.updateUser(email, role);

            System.out.println(request.getParameter("pageName"));

            //redirecting to the appropriate screen
            if(request.getParameter("pageName").equals("admin")){
                RequestDispatcher rd=request.getRequestDispatcher("AdminView Confirmation Screen.jsp");
                rd.forward(request,response);
            } else if (request.getParameter("pageName").equals("manager")) {
                RequestDispatcher rd=request.getRequestDispatcher("ManagerView Confirmation Screen.jsp");
                rd.forward(request,response);
            } else if (request.getParameter("pageName").equals("accountant")) {
                RequestDispatcher rd=request.getRequestDispatcher("AccountantView Confirmation Screen.jsp");
                rd.forward(request,response);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
