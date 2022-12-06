package JavaFilesAndServlets;

import java.util.ArrayList;

//class to make a list of journal entry objects
public class JournalEntryList {

    //creating an arraylist of journal entry objects
    public ArrayList<JournalEntry> journalEntryList = new ArrayList<>();

    //getting a specified entry
    public JournalEntry getJournalEntry(int index){
        JournalEntry j1 = journalEntryList.get(index);
        return j1;
    }
    //adding an entry to the list
    public void addJournalEntry(JournalEntry j1){
        journalEntryList.add(j1);
    }
    //getting the number of entries
    public int size(){
        return journalEntryList.size();
    }

    //displaying all the information for each entry in the list
    public void display(){
        for(int i = 0; i < journalEntryList.size(); i++){
            journalEntryList.get(i).display();
        }
    }
}
