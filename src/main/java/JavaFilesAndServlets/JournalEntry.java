package JavaFilesAndServlets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

//creating a journal entry object
public class JournalEntry {

    //journal entry attributes
    public int entryNum;
    public int accountID;
    public String date;
    public String accountName;
    public double debit;
    public double credit;

    //creating a new journalentrylist
    public JournalEntryList journalEntryList = new JournalEntryList();

    //creating more attributes and the getters and setters inline
    public int getEntryNum() {
        return entryNum;
    }
    public void setEntryNum(int entryNum) {
        this.entryNum = entryNum;
    }
    public int getAccountID() {
        return accountID;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
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

    //argless constructor
    public JournalEntry(){}

    //constructor with all the appropriate attributes
    public JournalEntry(int entryNum, int accountID, String date, String accountName, double debit, double credit) {
        this.entryNum = entryNum;
        this.accountID = accountID;
        this.date = date;
        this.accountName = accountName;
        this.debit = debit;
        this.credit = credit;
    }

    //method to get specific journal entries from the DB
    public void getJournalEntries(int accountID)throws SQLException{
        //creating sql query
        String sqlStatement = ("select * from journal_entries where accountID = '" + accountID + "'");
        Statement statement;
        ResultSet resultSet;
        //attempting to query db
        try {
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            //specifying the query to run
            statement = connection.createStatement();
            //setting the results to be the result of the query execution
            resultSet = statement.executeQuery(sqlStatement);
            //while there is another entry in the db (another journalentry), program will loop and add the account into the journalentryist
            while(resultSet.next()){
                //creating a new journal entry
                JournalEntry j1 = new JournalEntry();
                //setting the attributes of the entry equal to the values from the db
                j1.setEntryNum(resultSet.getInt(1));
                j1.setAccountID(resultSet.getInt(2));
                j1.setDate(resultSet.getString(3));
                j1.setAccountName(resultSet.getString(4));
                j1.setDebit(resultSet.getDouble(5));

                //adding the jounrnal entry to the list
                journalEntryList.addJournalEntry(j1);
            }

            //catching any issues should the attempt fail
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    //querying all journal entries
    public void getAllJournalEntries()throws SQLException{
        String sqlStatement = ("select * from journal_entries");
        Statement statement;
        ResultSet resultSet;
        //attempting to query db
        try {
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            //specifying the query to run
            statement = connection.createStatement();
            //setting the results to be the result of the query execution
            resultSet = statement.executeQuery(sqlStatement);
            //while there is another entry in the db (another journalentry), program will loop and add the account into the journalentryist
            while(resultSet.next()){
                //creatomg new journal entry
                JournalEntry j1 = new JournalEntry();
                //setting the attributes of the entry equal to the values from the db
                j1.setEntryNum(resultSet.getInt(1));
                j1.setAccountID(resultSet.getInt(2));
                j1.setDate(resultSet.getString(3));
                j1.setAccountName(resultSet.getString(4));
                j1.setDebit(resultSet.getDouble(5));
                j1.setCredit(resultSet.getDouble(6));
                //adding the jounrnal entry to the list
                journalEntryList.addJournalEntry(j1);
            }

            //error handling
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    //get only pending entries
    public void getPendingJournalEntries()throws SQLException{
        //sql statement to select only records that are marked pending
        String sqlStatement = ("select * from journal_entries where status = 'pending'");
        Statement statement;
        ResultSet resultSet;
        try {
            //establishing db connection
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStatement);
           //looping through the results
            while(resultSet.next()){
                //creating a new journal entry and filling it with the values pulled from the db
                JournalEntry j1 = new JournalEntry();
                j1.setEntryNum(resultSet.getInt(1));
                j1.setAccountID(resultSet.getInt(2));
                j1.setDate(resultSet.getString(3));
                j1.setAccountName(resultSet.getString(4));
                j1.setDebit(resultSet.getDouble(5));
                j1.setCredit(resultSet.getDouble(6));

                //adding this to the journalentry list
                journalEntryList.addJournalEntry(j1);
            }

            //error handling
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    //this is the method to retrieve rejected journal entries
    public void getRejectedJournalEntries()throws SQLException{
        //specifying only entries from table where the status is rejected
        String sqlStatement = ("select * from journal_entries where status = 'rejected'");
        Statement statement;
        ResultSet resultSet;
        //attempting connecting to db and running sql
        try {
            //connecting to db
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            //executing sql
            resultSet = statement.executeQuery(sqlStatement);
            //while there is another entry, create a journal entry and add to entrylist
            while(resultSet.next()){
                //creating a new entry and filling it with values from the db
                JournalEntry j1 = new JournalEntry();
                j1.setEntryNum(resultSet.getInt(1));
                j1.setAccountID(resultSet.getInt(2));
                j1.setDate(resultSet.getString(3));
                j1.setAccountName(resultSet.getString(4));
                j1.setDebit(resultSet.getDouble(5));
                j1.setCredit(resultSet.getDouble(6));
                //adding journal entry to the list
                journalEntryList.addJournalEntry(j1);
            }
            //error handling
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    //method to update the status of a journal entry
    public static void updateEntryStatus(int entryNum1, String status1)throws SQLException{
        //specifying the set of jounral entries to modify
        String sqlStatement = ("update journal_entries set status = '"+ status1 +"' where entryNum = '" + entryNum1 + "'");
        Statement statement;
        //attempting to execute sql
        try {
            //connecting to db
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            //executing sql
            statement.executeUpdate(sqlStatement);

            //error  handling
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    //method to create a journal entry
    public static void createJournalEntry(double debit, double credit, String date, int accountID, String status) throws SQLException{
       //inserting a value into the jounral entry tables, this is by default an unapproved entry
        String sqlStatement = ("insert into journal_entries values (DEFAULT, '" + accountID + "', '" + date + "', " + "NULL, " +
                "'" + debit + "', '" + credit + "', '" + status + "')");
        Statement statement;
        //attempting to execute sql
        try{
            //establishing db connection
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            //executing sql
            statement.executeUpdate(sqlStatement);
        }
        //error handling
        catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    //method to display the values for a given journal entry
    public void display(){
        System.out.println("Entry Number: " + entryNum);
        System.out.println("Account ID: " + accountID);
        System.out.println("Date: " + date);
        System.out.println("Account Name: " + accountName);
        System.out.println("Debit: " + debit);
        System.out.println("Credit: " + credit);
    }

}


