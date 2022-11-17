package JavaFilesAndServlets;

import java.util.ArrayList;

public class EventList {
    public static ArrayList<Event> EventList = new ArrayList<>();

    public Event getEvent(int index){
        Event e1 = EventList.get(index);
        return e1;
    }
    public static void addEvent(Event e1){
        EventList.add(e1);
    }
    public int size(){
        return EventList.size();
    }
    public void display(){
        for(int i = 0; i < EventList.size(); i++){
            EventList.get(i).display();
        }
    }


}
