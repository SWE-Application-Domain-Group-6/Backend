package JavaFilesAndServlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

//this class handles updating the chart of accounts and journal entries for a manager user
//in conjunction with the managerviewupdatejeandcoa servlet
@WebServlet(name = "ManagerViewUpdateJEandCOA", value = "/ManagerViewUpdateJEandCOA")
public class ManagerViewUpdateJEandCOA extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //refreshing requests and responses to the webserver
        doGet(request, response);

        try{
            //if a journal entry is created get the required entry values from the frontend
            if (request.getParameter("logJournalEntry") != null){
                System.out.println("Log Journal Entry button pushed");
                String debitParam = request.getParameter("debit");
                System.out.println("Value from parameter: " + debitParam);
                String creditParam = request.getParameter("credit");
                System.out.println("Value from parameter: " + creditParam);
                String date = request.getParameter("date_picker");
                System.out.println("Value from parameter: " + date);
                int accountID = 3;
                String status = "pending";
                double debit = Double.parseDouble(debitParam);
                double credit = Double.parseDouble(creditParam);
                //taking the values provided and creating a journal entry
                JournalEntry.createJournalEntry(debit, credit, date, accountID, status);
                //redirect to the confirmation screen
                RequestDispatcher rd=request.getRequestDispatcher("ManagerView Confirmation Screen.jsp");
                rd.forward(request,response);
            }
            //handles user updates to COA
            if(request.getParameter("updateChartOfAccounts")!= null){
                System.out.println("Update Chart of Accounts button pushed");
                String name = request.getParameter("accountname");
                System.out.println("Value from parameter: " + name);
                String account_cat = request.getParameter("accountcategory");
                System.out.println("Value from parameter: " + account_cat);
                String account_subcat = request.getParameter("accountsubcategory");
                System.out.println("Value from parameter: " + account_subcat);
                String date = request.getParameter("date_picker");
                Accounts.createAccount(name, 7, account_cat, account_subcat, date);

                //redirecting to the confirmation
                RequestDispatcher rd=request.getRequestDispatcher("ManagerView Confirmation Screen.jsp");
                rd.forward(request,response);
            }
        }
        catch(SQLException ex){}

    }
}
