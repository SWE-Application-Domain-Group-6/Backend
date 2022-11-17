package JavaFilesAndServlets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Event {
    String fname,lname,address,email, dob;
    int userID;
    public EventList eventList = new EventList();

    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public Event(){}

    public Event(String fn, String ln, String address, String email, String dob,int userID){
        this.fname = fn;
        this.lname = ln;
        this.address = address;
        this.email = email ;
        this.dob = dob;
        this.userID = userID;

    }

    public void getAllEvents(int accountID)throws SQLException {
        String sqlStatement = ("select email, fname, lname, dob, address from user_accounts");
        Statement statement;
        ResultSet resultSet;
        try {
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStatement);
            while(resultSet.next()){
                Event e1 = new Event();
                e1.setEmail(resultSet.getString(1));
                e1.setFname(resultSet.getString(2));
                e1.setLname(resultSet.getString(3));
                e1.setDob(resultSet.getString(4));
                e1.setAddress(resultSet.getString(5));
                EventList.addEvent(e1);
            }

        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    public void display(){
        System.out.println("First name: " + fname);
        System.out.println("Last name: " + lname);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("DOB: " + dob);
        System.out.println("User ID: " + userID);
    }
}
