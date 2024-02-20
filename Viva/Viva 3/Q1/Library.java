
package viva3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//search for books by their title or author's name
//add or remove books from its collection
//books with ISBN numbers ending in prime digits for the last two digits won't be available for borrowing
//sort the books within the library's collection based on their book title in ascending order.

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> findBooksByTitle(String title) {
        // Return a list of all books with the title, or null
        ArrayList<Book> result = new ArrayList<>();
        
        for (Book book: this.books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.display();
                result.add(book);
            }
        }
        //if result is empty, it returns null; otherwise, it returns the result
        return (result.isEmpty()) ? null : result;
    }
    
    public ArrayList<Book> findBooksByAuthor(String author) {
        // Return a list of all books from the author, or null
        ArrayList<Book> result = new ArrayList<>();

        System.out.println("Books by author '" + author + "':");
        for (Book book: this.books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.display();
                result.add(book);
            }
        }
        return (result.isEmpty()) ? null : result;
    }
    
    public boolean borrowBook(String ISBN) {
        //to get the last two digit
        int d = Integer.parseInt(ISBN) % 100;
        
        if (isPrime(d)) {
            return false;
        }
        
        for (Book book: this.books) {
            if (book.getISBN().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }
    
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public boolean removeBook(String ISBN) {
        for (Book book: this.books) {
            if (book.getISBN().equals(ISBN)) {
                this.books.remove(book);
                return true;
            }
        }
        return false;
    }
    
    public void sortBooks() {
        Collections.sort(this.books, new SortBookByTitleComparator());
        System.out.println("Books in the library, sorted by title:");
        this.displayLibrary();
    }
   
    private boolean isPrime(int n) {
        boolean prime = n > 1;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
        
    public void displayLibrary() {
        // for-each loop to iterate over a collection of Book objects
        for (Book book: this.books) {
            book.display();
            System.out.println();
        }
    }
}

// Comparator for sorting Books
// reference:
// https://www.geeksforgeeks.org/comparator-interface-java/

class SortBookByTitleComparator implements Comparator<Book> {    
    public int compare(Book a, Book b) {
        // A negative number, if Book a should come before Book b
        // A positive number, if Book a should come after Book b
        // 0, if Book a can come in the same place as Book b.

        return a.getTitle().compareTo(b.getTitle());
    }
}

