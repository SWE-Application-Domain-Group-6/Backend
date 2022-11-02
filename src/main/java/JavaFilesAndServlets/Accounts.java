package JavaFilesAndServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "JavaFilesAndServlets.Accounts", value = "/JavaFilesAndServlets.Accounts")
public class Accounts extends HttpServlet {
    public Accounts() throws SQLException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    dbConnector db =  new dbConnector();
    Connection connection = db.dbConnector();
    Statement stmt = connection.createStatement();




    public void createAccount(String name, String username, String cat, String subcat){
        String sinsert  = "insert into account_info (name,userID, account_cat, account_subcat,acc_created) values (name,07, 'test' ,'subtest', 10/10/2022)";
        System.out.println(sinsert);
        try{
            int countInserted = stmt.executeUpdate(sinsert);
            System.out.println(countInserted + " record updated.\n");
        }
        catch (Exception err){
            System.out.println("Could not execute SQL");
            err.printStackTrace();
        }
    }

    public void getAccount(String username){
        String sinsert  = "select * from account_info where ()";
        System.out.println(sinsert);
        try{
            int countInserted = stmt.executeUpdate(sinsert);
            System.out.println(countInserted + " records found.\n");
        }
        catch (Exception err){
            System.out.println("Could not execute SQL");
            err.printStackTrace();
        }
    }

    public void createEntry(String name, String username, String cat, String subcat){
        String sinsert  = "insert into account_info (name,userID, account_cat, account_subcat,acc_created) values (name,07, 'test' ,'subtest', 10/10/2022)";
        System.out.println(sinsert);
        try{
            int countInserted = stmt.executeUpdate(sinsert);
            System.out.println(countInserted + " record updated.\n");
        }
        catch (Exception err){
            System.out.println("Could not execute SQL");
            err.printStackTrace();
        }
    }

    public void getEntry(int id){
        String sinsert  = "select * from account_info where ()";
        System.out.println(sinsert);
        try{
            int countInserted = stmt.executeUpdate(sinsert);
            System.out.println(countInserted + " records found.\n");
        }
        catch (Exception err){
            System.out.println("Could not execute SQL");
            err.printStackTrace();
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accountName = request.getParameter("");
        String username = request.getParameter("");
        String cat = request.getParameter("");
        String subcat = request.getParameter("");
        int accountId = 0;

        if(request.getParameter("create account")!= null){
            createAccount(accountName,username, cat, subcat);
        }

        if(request.getParameter("select account")!= null){
            getAccount(username);
        }

        //creating a journal entry
        if(request.getParameter("create entry")!= null){
            createEntry(accountName,username, cat, subcat);
        }

        //retreiving the journal entries
        if(request.getParameter("select entry")!= null){
            getEntry(accountId);
        }

    }
}
