package viva3;

//book's title, author, and an enchanted ISBN
//constructor, accessor, and mutator spells for each variable

public class Book {
    private String title;
    private String author; 
    private String ISBN;
    
    public Book(){
        title = null;
        author = null;
        ISBN = null;
    }
    
    public Book (String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public void display() {
        System.out.println("- Title: " + this.title);
        System.out.println("  Author: " + this.author);
        System.out.println("  ISBN: " + this.ISBN);
    }
}
    
