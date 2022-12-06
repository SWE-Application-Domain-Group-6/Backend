package JavaFilesAndServlets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


//user class object
public class User {
    //variables with inline setter/getter methods
    String fname,lname,address,email, dob;
    int userID;
    public UserList userList = new UserList();

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
    //arg less constructor
    public User(){}

    //cosntructor with args
    public User(String fn, String ln, String address, String email, String dob,int userID){
        this.fname = fn;
        this.lname = ln;
        this.address = address;
        this.email = email ;
        this.dob = dob;
        this.userID = userID;

    }

    //method to get all users from teh db
    public void getAllUsers()throws SQLException {
        String sqlStatement = ("select email, fname, lname, dob, address from user_accounts");
        Statement statement;
        ResultSet resultSet;
        //attempting to query db
        try {
            //conecting to the db
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            //specifying the query to run
            statement = connection.createStatement();
            //setting the results to be the result of the query execution
            resultSet = statement.executeQuery(sqlStatement);
            //while there is another entry in the db (another journalentry), program will loop and add the account into the journalentryist
            while(resultSet.next()){
                User u1 = new User();
                u1.setEmail(resultSet.getString(1));
                u1.setFname(resultSet.getString(2));
                u1.setLname(resultSet.getString(3));
                u1.setDob(resultSet.getString(4));
                u1.setAddress(resultSet.getString(5));
                userList.addUser(u1);
            }
            //error handling
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }
    //displaying all users
    public void display(){
        System.out.println("First name: " + fname);
        System.out.println("Last name: " + lname);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("DOB: " + dob);
        System.out.println("User ID: " + userID);
    }

}
