import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    private boolean isIssued;

    // Constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.isIssued = false;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isIssued() {
        return isIssued;
    }

    // Issue Book
    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    // Return Book
    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    // Display Book Details
    public void display() {
        System.out.println("ID: " + bookId +
                ", Name: " + bookName +
                ", Author: " + authorName +
                ", Status: " + (isIssued ? "Issued" : "Available"));
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, name, author));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();

                    boolean foundIssue = false;
                    for (Book b : books) {
                        if (b.getBookId() == issueId) {
                            b.issueBook();
                            foundIssue = true;
                            break;
                        }
                    }
                    if (!foundIssue) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    boolean foundReturn = false;
                    for (Book b : books) {
                        if (b.getBookId() == returnId) {
                            b.returnBook();
                            foundReturn = true;
                            break;
                        }
                    }
                    if (!foundReturn) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID or Name to search: ");
                    sc.nextLine();
                    String search = sc.nextLine();

                    boolean foundSearch = false;

                    for (Book b : books) {
                        if (String.valueOf(b.getBookId()).equals(search) ||
                                b.getBookName().equalsIgnoreCase(search)) {

                            b.display();
                            foundSearch = true;
                        }
                    }

                    if (!foundSearch) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}