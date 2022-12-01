package JavaFilesAndServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "JavaFilesAndServlets.Accounts", value = "/JavaFilesAndServlets.Accounts")
public class Accounts extends HttpServlet {

    public int accountID;
    public int userID;
    public String name;
    public String description;
    public String account_cat;
    public String account_subcat;
    public double initial_balance;
    public double debit;
    public double credit;
    public double balance;
    public String acc_created;
    public AccountList accountList = new AccountList();


    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccount_cat() {
        return account_cat;
    }

    public void setAccount_cat(String account_cat) {
        this.account_cat = account_cat;
    }

    public String getAccount_subcat() {
        return account_subcat;
    }

    public void setAccount_subcat(String account_subcat) {
        this.account_subcat = account_subcat;
    }

    public double getInitial_balance() {
        return initial_balance;
    }

    public void setInitial_balance(double initial_balance) {
        this.initial_balance = initial_balance;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAcc_created() {
        return acc_created;
    }

    public void setAcc_created(String acc_created) {
        this.acc_created = acc_created;
    }

    public Accounts (int accountID, int userID, String name, String description, String account_cat, String account_subcat, double initial_balance,
                     double debit, double credit, double balance, String acc_created) throws SQLException {
        this.accountID = accountID;
        this.userID = userID;
        this.name = name;
        this.description = description;
        this.account_cat = account_cat;
        this.account_subcat = account_subcat;
        this.initial_balance = initial_balance;
        this.debit = debit;
        this.credit = credit;
        this.balance = balance;
        this.acc_created = acc_created;
    }

    public Accounts() throws SQLException {
    }

    public void getAllAccounts()throws SQLException{
        String sqlStatement = ("select accountID, name, description from account_info");
        Statement statement;
        ResultSet resultSet;
        try {
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStatement);
            while(resultSet.next()){
                Accounts a1 = new Accounts();
                a1.setAccountID(resultSet.getInt(1));
                a1.setName(resultSet.getString(2));
                a1.setDescription(resultSet.getString(3));
                accountList.addAccount(a1);
            }

        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    dbConnector db =  new dbConnector();
    Connection connection = db.dbConnector();
    Statement stmt = connection.createStatement();




    public static void createAccount(String name, int userID, String account_cat, String account_subcat, String acc_created){
        String sqlStatement  = "insert into account_info (name, userID, account_cat, account_subcat, acc_created) " +
                "values ('" + name + "', '" + userID + "', '" + account_cat + "', '" + account_subcat + "', '" + acc_created + "')";
        System.out.println(sqlStatement);
        Statement statement;
        try{
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            statement.executeUpdate(sqlStatement);
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
            //createAccount(accountName,username, cat, subcat);
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
