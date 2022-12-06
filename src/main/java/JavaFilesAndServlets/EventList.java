package JavaFilesAndServlets;
import java.util.ArrayList;

//class for the eventlist object
public class EventList {
    //creating an eventlist
    public ArrayList<Event> eventList = new ArrayList<>();

    //method to get a specified event from the list
    public Event getEvent(int index){
        Event e1 = eventList.get(index);
        return e1;
    }
    //adding an event to the list
    public void addEvent(Event e1){
        eventList.add(e1);
    }
    //getting the number of events/size of list
    public int size(){
        return eventList.size();
    }
    //displaying all events in the list
    public void display(){
        for(int i = 0; i < eventList.size(); i++){
            eventList.get(i).display();
        }
    }


}
