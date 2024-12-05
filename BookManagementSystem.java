package ManagementSystem.com;
//class BookManagementSystem with main method
import java.util.Scanner;

public class BookManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookID = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    Book book = new Book(bookID, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    bookID = scanner.nextLine();
                    library.removeBook(bookID);
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    bookID = scanner.nextLine();
                    Book foundBook = library.searchBook(bookID);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        foundBook.displayBook();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}