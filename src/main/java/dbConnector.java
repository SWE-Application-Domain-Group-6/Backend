import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnector {

    public Connection dbConnector(){
        Connection connection;
        try {
            DriverManager.getDrivers();
            System.out.println("Driver loaded....");
            connection = DriverManager.getConnection("jdbc:mysql://apptest.cyu0zp5qje42.us-east-2.rds.amazonaws.com:3306/sys", "admin", "applicationdomain");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connected to the database....");
        return connection;
    }

}
