import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class adminView {
    public static void updateUser(String user, String role) throws SQLException {
        dbConnector db =  new dbConnector();
        Connection connection = db.dbConnector();
        Statement stmt = connection.createStatement();

        String sinsert  = "update user_accounts set permission_level = '" + role + "' where email = '" + user + "'";
        System.out.println(sinsert);
        try{
            int countInserted = stmt.executeUpdate(sinsert);
            System.out.println(countInserted + " record updated.\n");
        }
        catch (Exception err){
            System.out.println("Could not execute SQL");
            err.printStackTrace();
        }
    }


}
