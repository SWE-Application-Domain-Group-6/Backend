package JavaFilesAndServlets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class JournalEntry {

    public int entryNum;
    public int accountID;
    public String date;
    public String accountName;
    public double debit;
    public double credit;
    public JournalEntryList journalEntryList = new JournalEntryList();

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

    public JournalEntry(){}

    public JournalEntry(int entryNum, int accountID, String date, String accountName, double debit, double credit) {
        this.entryNum = entryNum;
        this.accountID = accountID;
        this.date = date;
        this.accountName = accountName;
        this.debit = debit;
        this.credit = credit;
    }

    public void getJournalEntries(int accountID)throws SQLException{
        String sqlStatement = ("select * from journal_entries where accountID = '" + accountID + "'");
        Statement statement;
        ResultSet resultSet;
        try {
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStatement);
            while(resultSet.next()){
                JournalEntry j1 = new JournalEntry();
                j1.setEntryNum(resultSet.getInt(1));
                j1.setAccountID(resultSet.getInt(2));
                j1.setDate(resultSet.getString(3));
                j1.setAccountName(resultSet.getString(4));
                j1.setDebit(resultSet.getDouble(5));
                j1.setCredit(resultSet.getDouble(6));
                journalEntryList.addJournalEntry(j1);
            }

        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    public void getAllJournalEntries()throws SQLException{
        String sqlStatement = ("select * from journal_entries");
        Statement statement;
        ResultSet resultSet;
        try {
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStatement);
            while(resultSet.next()){
                JournalEntry j1 = new JournalEntry();
                j1.setEntryNum(resultSet.getInt(1));
                j1.setAccountID(resultSet.getInt(2));
                j1.setDate(resultSet.getString(3));
                j1.setAccountName(resultSet.getString(4));
                j1.setDebit(resultSet.getDouble(5));
                j1.setCredit(resultSet.getDouble(6));
                journalEntryList.addJournalEntry(j1);
            }

        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    public void getPendingJournalEntries()throws SQLException{
        String sqlStatement = ("select * from journal_entries where status = 'pending'");
        Statement statement;
        ResultSet resultSet;
        try {
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStatement);
            while(resultSet.next()){
                JournalEntry j1 = new JournalEntry();
                j1.setEntryNum(resultSet.getInt(1));
                j1.setAccountID(resultSet.getInt(2));
                j1.setDate(resultSet.getString(3));
                j1.setAccountName(resultSet.getString(4));
                j1.setDebit(resultSet.getDouble(5));
                j1.setCredit(resultSet.getDouble(6));
                journalEntryList.addJournalEntry(j1);
            }

        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    public void getRejectedJournalEntries()throws SQLException{
        String sqlStatement = ("select * from journal_entries where status = 'rejected'");
        Statement statement;
        ResultSet resultSet;
        try {
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStatement);
            while(resultSet.next()){
                JournalEntry j1 = new JournalEntry();
                j1.setEntryNum(resultSet.getInt(1));
                j1.setAccountID(resultSet.getInt(2));
                j1.setDate(resultSet.getString(3));
                j1.setAccountName(resultSet.getString(4));
                j1.setDebit(resultSet.getDouble(5));
                j1.setCredit(resultSet.getDouble(6));
                journalEntryList.addJournalEntry(j1);
            }

        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    public void display(){
        System.out.println("Entry Number: " + entryNum);
        System.out.println("Account ID: " + accountID);
        System.out.println("Date: " + date);
        System.out.println("Account Name: " + accountName);
        System.out.println("Debit: " + debit);
        System.out.println("Credit: " + credit);
    }












}


