package JavaFilesAndServlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
//servlet for the managerviewupdates
@WebServlet(name = "ManagerViewUpdateStatusServlet", value = "/ManagerViewUpdateStatusServlet")
public class ManagerViewUpdateStatusServlet extends HttpServlet {

    public ManagerViewUpdateStatusServlet(){
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);

        try{
            //approve journal entry
            if (request.getParameter("approvebtn") != null) {
                int entryNum = Integer.parseInt(request.getParameter("approvebtn"));
                JournalEntry.updateEntryStatus(entryNum, "approved");
                RequestDispatcher rd=request.getRequestDispatcher("ManagerView Confirmation Screen.jsp");
                rd.forward(request,response);
            }
            //reject journal entry
            if (request.getParameter("rejectbtn") != null) {
                int entryNum = Integer.parseInt(request.getParameter("rejectbtn"));
                JournalEntry.updateEntryStatus(entryNum, "rejected");
                RequestDispatcher rd=request.getRequestDispatcher("ManagerView Confirmation Screen.jsp");
                rd.forward(request,response);
            }
        }
        catch(SQLException ex){}
    }
}
