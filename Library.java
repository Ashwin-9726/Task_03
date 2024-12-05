package ManagementSystem.com;

import java.util.ArrayList;


// Library class
class Library {
    private ArrayList<Book> books;

    // Constructor to initialize the list of books
    public Library() {
        books = new ArrayList<>();
    }
    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }
    // Method to remove a book by bookID
    public void removeBook(String bookID) {
        boolean found = false;
        for (Book book : books) {
            if (book.bookID.equals(bookID)) {
                books.remove(book);
                System.out.println("Book with ID " + bookID + " has been removed.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + bookID + " not found.");
        }
    }
    // Method to search a book by bookID
    public Book searchBook(String bookID) {
        for (Book book : books) {
            if (book.bookID.equals(bookID)) {
                return book;
            }
        }
        return null; // If book not found
    }
    // Method to display all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}