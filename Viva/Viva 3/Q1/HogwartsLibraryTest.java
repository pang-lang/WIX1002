package viva3;

import java.util.Scanner;

public class HogwartsLibraryTest {
    public static void main(String[] args) {
        Library hogwartsLibrary = new Library();
        Book book1 = new Book("The Standard Book of Spells", "Miranda Goshawk", "9452297");
        Book book2 = new Book("Advanced Potion-Making", "Libatius Borage", "4826972");
        Book book3 = new Book("Fantastic Beasts and Where to Find Them", "Newt Scamander", "1564815");
        Book book4 = new Book("The Dark Forces: A Guide to Self-Protection", "Quirinus Quirrell", "1891568");
        Book book5 = new Book("Forbidden Spells", "Salazar Slytherin", "7134567"); // ISBN ends in prime digits
        
        hogwartsLibrary.addBook(book1);
        hogwartsLibrary.addBook(book2);
        hogwartsLibrary.addBook(book3);
        hogwartsLibrary.addBook(book4);
        hogwartsLibrary.addBook(book5);
        
        System.out.println("Searching for books by author:"); 
        hogwartsLibrary.findBooksByAuthor("Miranda Goshawk");
        System.out.println("\nSearching for books by title:");
        hogwartsLibrary.findBooksByTitle("The Standard Book of Spells");
        boolean canBorrow = hogwartsLibrary.borrowBook("9452297");
        
        if (canBorrow) {
            System.out.println("\nYou've borrowed a book!");
        } else {
            System.out.println("\nSorry, this book is not available for borrowing.");
        }
        
        System.out.println("\nSorted Books:");
        hogwartsLibrary.sortBooks();
        
        hogwartsLibrary.removeBook("1564815"); // Fantastic Beasts and Where to Find Them
        System.out.println("\nUpdated Library:");
        hogwartsLibrary.displayLibrary();
        
        //Library hogwartsLibrary = new Library();
        JournalLibrary journalLibrary=new JournalLibrary();
        Journals journal1 = new Journals("Today in History","104");
        Journals journal2 = new Journals("Today in History","105");
        Journals journal3 = new Journals("Today in History","106");
        Journals journal4 = new Journals("Human","46");
        Journals journal5 = new Journals("Human","47");
        Journals journal6 = new Journals("Scentific Malaysia,","55");
        Journals journal7 = new Journals("Scentific Malaysia,","56");
        Journals journal8 = new Journals("Scentific Malaysia,","57");
        
        journalLibrary.addJournal(journal1);
        journalLibrary.addJournal(journal2);
        journalLibrary.addJournal(journal3);
        journalLibrary.addJournal(journal4);
        journalLibrary.addJournal(journal5);
        journalLibrary.addJournal(journal6);
        journalLibrary.addJournal(journal7);
        journalLibrary.addJournal(journal8);
        System.out.println("Searching number of journals:");
        System.out.println("Journals with name \"Human\"");
        System.out.println(journalLibrary.NumofJournals("Human"));
          
          
        System.out.println("\nSearching journal with title \"Scentific Malaysia,\" and with volume 53");
        boolean checkVol = journalLibrary.journalExists("Scentific Malaysia,","53");
        System.out.println(checkVol);
         
    }
}
    
