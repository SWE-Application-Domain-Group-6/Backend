package JavaFilesAndServlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//class to handle the login feature in conjunction with the login servlet
public class Login {
	//method to validate the username/pass combo against stored values in the db
	public static boolean validate(String email, String pass){
		boolean status=false;
		try {
			//this is the new way to implement the db connector
			dbConnector db =  new dbConnector();
			Connection connection = db.dbConnector();

			//getting the info from the db
			PreparedStatement preparedStatement=connection.prepareStatement("select password from user_accounts where email=? and password=?");

			//setting the variables in the sql statement to be the user given values
			preparedStatement.setString(1,email);
			preparedStatement.setString(2,pass);  
			      
			ResultSet rs=preparedStatement.executeQuery();  
			status=rs.next();  

		}
		//error handling
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Connecting to DB");
			e.printStackTrace();
			}//Establishing connection
		return status;
		
		
	}
	//gets the role for a user to determine where to redirect
	public static String getRole(String name) {
		DriverManager.getDrivers();
		Connection connection;
		try {
			//this is the old way to implement the db connector
			connection = DriverManager.getConnection("jdbc:mysql://apptest.cyu0zp5qje42.us-east-2.rds.amazonaws.com:3306/sys", "admin", "applicationdomain");
			//String sql = "select permission_Level from user_accounts where fname=" + "\"" + name + "\"";
			//System.out.println(sql);
			//selecting the permission level of the user
			PreparedStatement preparedStatement=connection.prepareStatement("select permission_Level from user_accounts where email=?");
			preparedStatement.setString(1,name);  
			ResultSet rs=preparedStatement.executeQuery();  
			rs.next();
			name = rs.getString("permission_Level");
			System.out.println(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return name;
		
	}
}

