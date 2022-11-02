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


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email;
        String role = request.getParameter("newrole");

        try {
            email = request.getParameter("usn");
            adminView.updateUser(email, role);

            System.out.println(request.getParameter("pageName"));

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
