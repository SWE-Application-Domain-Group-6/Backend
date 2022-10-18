import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;  
public class Login {
	public static boolean validate(String name, String pass){
		boolean status=false;
		try {
			DriverManager.getDrivers();
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/app_test", "root", "asdf11@ASDF");
			PreparedStatement preparedStatement=connection.prepareStatement("select password from user_accounts where fname=? and password=?");
			
			preparedStatement.setString(1,name);  
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
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/app_test", "root", "asdf11@ASDF");
			//String sql = "select permission_Level from user_accounts where fname=" + "\"" + name + "\"";
			//System.out.println(sql);
			PreparedStatement preparedStatement=connection.prepareStatement("select permission_Level from user_accounts where fname=?");
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

