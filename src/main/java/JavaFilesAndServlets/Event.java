package JavaFilesAndServlets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Event {
    String attribute, value, date, user;
    int changeID,accountID;
    public EventList eventList = new EventList();

    public int getAccountID() {return accountID;}

    public void setAccountID(int accountID) {this.accountID = accountID;}



    public String getUser() {return user;}

    public void setUser(String user) {this.user = user;}

    public String getAttribute() {return attribute;}

    public void setAttribute(String attribute) {this.attribute = attribute;}

    public String getValue() {return value;}

    public void setValue(String value) {this.value = value;}

    public String getDate() {return date;}

    public void setDate(String date) {this.date = date;}

    public int getChangeID() {return changeID;}

    public void setChangeID(int changeID) {this.changeID = changeID;}

    public EventList getEventList() {return eventList;}

    public void setEventList(EventList eventList) {this.eventList = eventList;}



    public Event(){}

    public Event(String user,  int account, String attribute, String value, String date){
        this.user = user;
        this.accountID = account;
        this.attribute = attribute ;
        this.value = value;
        this.date = date;

    }

    public void getAllEvents(int accountID)throws SQLException {
        String sqlStatement = ("select change_id, user, account, date, attribute_changed, value_changed from event_log");
        Statement statement;
        ResultSet resultSet;
        try {
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStatement);
            System.out.println("executed sql statement");
            while(resultSet.next()){
                System.out.println("in loop");
                Event e1 = new Event();
                System.out.println("event created");
                System.out.println(Integer.parseInt(resultSet.getString(1)));
                e1.setChangeID(Integer.parseInt(resultSet.getString(1)));
                System.out.println("set 1");
                e1.setUser(resultSet.getString(2));
                System.out.println("set 2");
                System.out.println(Integer.parseInt(resultSet.getString(3)));
                e1.setAccountID(Integer.parseInt(resultSet.getString(3)));
                e1.setDate(resultSet.getString(4));
                e1.setAttribute(resultSet.getString(5));
                e1.setValue(resultSet.getString(6));
                eventList.addEvent(e1);
            }

        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    public void display(){
        System.out.println("ChangeID: " + changeID);
        System.out.println("User: " + user);
        System.out.println("AccountID: " + accountID);
        System.out.println("date: " + date);
        System.out.println("Attribute Modified: " + attribute);
        System.out.println("Value: " + value);
    }
}
