package ManagementSystem.com;
//Book class
public class Book {
    String bookID;
    String title;
    String author;
    boolean isAvailable;
    //parameterized Constructor for book class
    public Book(String bookID,  String author, String title) {
        this.bookID = bookID;
        this.author = author;
        this.title = title;
        this.isAvailable = true;//By default the book is available
    }
    //Method to display the book
    public void displayBook() {
        System.out.println("BookID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}