
package viva3;

import java.util.ArrayList;

public class JournalLibrary {
    private ArrayList<Journals> journal = new ArrayList<>();
    
    public int NumofJournals(String Title) {
        int count = 0;
        for (Journals journals : journal) {
            if (journals.getTitle().equalsIgnoreCase(Title)) {
                count++;
            }
        } 
        return count;
    }
        
    public void addJournal(Journals journals){
        journal.add(journals);
     }
     
    public boolean journalExists(String title, String volume){
        for (Journals journals:journal){
            return (journals.getTitle().equalsIgnoreCase(title) && journals.getVolume().equalsIgnoreCase(volume));
        }
        return false;
    }
}