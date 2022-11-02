package JavaFilesAndServlets;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SignUp {
    public static void signup(String psw, String fname, String lname, String email, String address, String dob) throws SQLException {

       dbConnector db =  new dbConnector();
       Connection connection = db.dbConnector();
       //java.sql.Statement statement=connection.createStatement();

       Statement stmt = connection.createStatement();


       String sinsert = "insert into user_accounts (password, fname, lname, email, address, dob, permission_level) values ('"
               + psw + "', '"+ fname + "', '" +  lname + "', '" + email + "', '" + address + "', '" + dob+ "', + " + "'regular')";
       System.out.println(sinsert);


      // sinsert = "insert into user_accounts (password, fname, lname, email, address, dob) values ('pass', 'ben', 'price', 'benprice1998@gmail.com', 'bp', 'Thu Sep 10 00:00:00 EDT 1998')";

       try{
          int countInserted = stmt.executeUpdate(sinsert);
          System.out.println(countInserted + " records inserted.\n");
       }
       catch (Exception err){
          System.out.println("Could not execute SQL");
          err.printStackTrace();
       }


   }



}