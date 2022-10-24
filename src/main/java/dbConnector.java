import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnector {

    public Connection dbConnector(){
        Connection connection;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getDrivers();
            System.out.println("Driver loaded....");
            connection = DriverManager.getConnection("jdbc:mysql://apptest.cyu0zp5qje42.us-east-2.rds.amazonaws.com:3306/sys", "admin", "applicationdomain");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error connecting to DB");
            e.printStackTrace();
            throw new RuntimeException(e);

        }
        System.out.println("Connected to the database....");
        return connection;
    }

}
