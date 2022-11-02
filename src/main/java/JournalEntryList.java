import java.util.ArrayList;

public class JournalEntryList {

    public ArrayList<JournalEntry> journalEntryArrayList = new ArrayList<>();

    public JournalEntry getJournalEntry(int index){
        JournalEntry j1 = journalEntryArrayList.get(index);
        return j1;
    }
    public void addJournalEntry(JournalEntry j1){
        journalEntryArrayList.add(j1);
    }
    public int size(){
        return journalEntryArrayList.size();
    }

}
