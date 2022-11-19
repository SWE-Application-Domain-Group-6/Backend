package JavaFilesAndServlets;

import java.util.ArrayList;

public class EventList {
    public ArrayList<Event> eventList = new ArrayList<>();

    public Event getEvent(int index){
        Event e1 = eventList.get(index);
        return e1;
    }
    public void addEvent(Event e1){
        eventList.add(e1);
    }
    public int size(){
        return eventList.size();
    }
    public void display(){
        for(int i = 0; i < eventList.size(); i++){
            eventList.get(i).display();
        }
    }


}
