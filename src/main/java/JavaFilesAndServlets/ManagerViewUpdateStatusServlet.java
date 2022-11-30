package JavaFilesAndServlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ManagerViewUpdateStatusServlet", value = "/ManagerViewUpdateStatusServlet")
public class ManagerViewUpdateStatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);

        try{
            if (request.getParameter("approvebtn") != null) {
                int entryNum = Integer.parseInt(request.getParameter("entryNum1"));
                System.out.println("Entry num passed is: " + entryNum);
                JournalEntry.updateEntryStatus(entryNum, "approved");
            }
            if (request.getParameter("rejectbtn") != null) {
                int entryNum = Integer.parseInt(request.getParameter("entryNum1"));
                JournalEntry.updateEntryStatus(entryNum, "rejected");
            }
        }
        catch(SQLException ex){}
    }
}
