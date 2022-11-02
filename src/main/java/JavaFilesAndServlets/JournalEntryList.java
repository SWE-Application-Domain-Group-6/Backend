package JavaFilesAndServlets;

import java.util.ArrayList;

public class JournalEntryList {

    public ArrayList<JournalEntry> journalEntryList = new ArrayList<>();

    public JournalEntry getJournalEntry(int index){
        JournalEntry j1 = journalEntryList.get(index);
        return j1;
    }
    public void addJournalEntry(JournalEntry j1){
        journalEntryList.add(j1);
    }
    public int size(){
        return journalEntryList.size();
    }

    public void display(){
        for(int i = 0; i < journalEntryList.size(); i++){
            journalEntryList.get(i).display();
        }
    }
}
