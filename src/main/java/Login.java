import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
public class Login {
	public static boolean validate(String email, String pass){
		boolean status=false;
		try {
			//this is the new way to implement the db connector
			dbConnector db =  new dbConnector();
			Connection connection = db.dbConnector();

			PreparedStatement preparedStatement=connection.prepareStatement("select password from user_accounts where email=? and password=?");
			
			preparedStatement.setString(1,email);
			preparedStatement.setString(2,pass);  
			      
			ResultSet rs=preparedStatement.executeQuery();  
			status=rs.next();  
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Connecting to DB");
			e.printStackTrace();
			}//Establishing connection
		return status;
		
		
	}
	
	public static String getRole(String name) {
		DriverManager.getDrivers();
		Connection connection;
		try {
			//this is the old way to implement the db connector
			connection = DriverManager.getConnection("jdbc:mysql://apptest.cyu0zp5qje42.us-east-2.rds.amazonaws.com:3306/sys", "admin", "applicationdomain");
			//String sql = "select permission_Level from user_accounts where fname=" + "\"" + name + "\"";
			//System.out.println(sql);
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

