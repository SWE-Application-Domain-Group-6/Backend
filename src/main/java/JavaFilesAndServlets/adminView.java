package JavaFilesAndServlets;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//this class supports the administrator view and the upate user function
public class adminView {
    //method to update user role, takes in user and desired role
    public static void updateUser(String user, String role) throws SQLException {
        //establishing db connection
        dbConnector db =  new dbConnector();
        Connection connection = db.dbConnector();
        Statement stmt = connection.createStatement();
        //creating sql statement to update specified user account
        String sinsert  = "update user_accounts set permission_level = '" + role + "' where email = '" + user + "'";
        System.out.println(sinsert);
        //attempting to exeute sql
        try{
            int countInserted = stmt.executeUpdate(sinsert);
            System.out.println(countInserted + " record updated.\n");
        }
        //error handling
        catch (Exception err){
            System.out.println("Could not execute SQL");
            err.printStackTrace();
        }
    }


}
