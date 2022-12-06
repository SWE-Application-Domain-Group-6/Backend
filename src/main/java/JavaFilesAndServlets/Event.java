package JavaFilesAndServlets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//class to create, read, or modify an event
public class Event {
    //account variables, with the getter/setter inline
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


    //emptry constructor
    public Event(){}

    //event constructor with attributes
    public Event(String user,  int account, String attribute, String value, String date){
        this.user = user;
        this.accountID = account;
        this.attribute = attribute ;
        this.value = value;
        this.date = date;

    }

    //gets all the stored events in the database
    public void getAllEvents(int accountID)throws SQLException {
        //creating sql query
        String sqlStatement = ("select change_id, user, account, date, attribute_changed, value_changed from event_log");
        Statement statement;
        ResultSet resultSet;
        //attempting to query db
        try {
            //Establishing connection
            dbConnector db =  new dbConnector();
            Connection connection = db.dbConnector();
            //specifying the query to run
            statement = connection.createStatement();
            //setting the results to be the result of the query execution
            resultSet = statement.executeQuery(sqlStatement);
            System.out.println("executed sql statement");
            //while there is another entry in the db (another event), program will loop
            // and add the event into the eventlist
            while(resultSet.next()){
                System.out.println("in loop");
                //creating an event
                Event e1 = new Event();
                System.out.println("event created");
                System.out.println(Integer.parseInt(resultSet.getString(1)));
                e1.setChangeID(Integer.parseInt(resultSet.getString(1)));
                System.out.println("set 1");
                e1.setUser(resultSet.getString(2));
                System.out.println("set 2");
                System.out.println(Integer.parseInt(resultSet.getString(3)));
                //setting the accountID associated with the event from the db
                e1.setAccountID(Integer.parseInt(resultSet.getString(3)));
                //setting the date
                e1.setDate(resultSet.getString(4));
                //set attribute being modified
                e1.setAttribute(resultSet.getString(5));
                //set attribute value
                e1.setValue(resultSet.getString(6));
                //adding the event to the event list
                eventList.addEvent(e1);
            }

            //catching any issues should the attempt fail
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            System.out.println("Error Connecting to DB");
            ex.printStackTrace();
        }//Establishing connection
    }

    //method to display all event information
    public void display(){
        System.out.println("ChangeID: " + changeID);
        System.out.println("User: " + user);
        System.out.println("AccountID: " + accountID);
        System.out.println("date: " + date);
        System.out.println("Attribute Modified: " + attribute);
        System.out.println("Value: " + value);
    }
}
