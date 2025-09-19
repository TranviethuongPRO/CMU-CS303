
package Book_OOP;

import java.util.Scanner;


public class Processor {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList listb = new BookList();
        int choice;

        do {
            System.out.println("\n=== BOOK MANAGEMENT MENU ===");
            System.out.println("1. Add a new TextBook");
            System.out.println("2. Add a new ReferenceBook");
            System.out.println("3. Update a book by ID");
            System.out.println("4. Delete a book by ID");
            System.out.println("5. Find a book by ID");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count the number of TextBooks and ReferenceBooks");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: {
                    TextBook tb = new TextBook();
                    tb.addBook();
                    listb.addBook(tb);
                    break;
                }
                case 2: {
                    ReferenceBook rb = new ReferenceBook();
                    rb.addBook();
                    listb.addBook(rb);
                    break;
                }
                case 3: {
                    System.out.print("Enter Book ID to update: ");
                    String id = sc.nextLine();
                    listb.updateBook(id);
                    break;
                }
                case 4: {
                    System.out.print("Enter Book ID to delete: ");
                    String id = sc.nextLine();
                    listb.deleteBook(id);
                    break;
                }
                case 5: {
                    System.out.print ("Enter Book ID to find: ");
                    String id = sc.nextLine();
                    Book b = listb.findBook(id);
                    if (b != null) b.displayDetails();
                    else System.out.println("Book not found!");
                    break;
                }
                case 6: {
                    listb.displayAllBook();
                    break;
                }
                case 7: {
                    Book expensive = listb.findMostExpensive();
                    if (expensive != null) {
                        System.out.println("Most expensive book:");
                        expensive.displayDetails();
                    } else {
                        System.out.println("No books found!");
                    }
                    break;
                }
                case 8: {
                    listb.countBook();
                    break;
                }
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
