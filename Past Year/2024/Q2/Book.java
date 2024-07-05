
package Q2;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book() {
        this.title = null;
        this.author = null;
        this.yearPublished = 0;
    }
    
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
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

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    public String toString(){
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + yearPublished;
    }

}
