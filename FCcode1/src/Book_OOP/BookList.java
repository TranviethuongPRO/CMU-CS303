package Book_OOP;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> listb = new ArrayList<>();

   

    public void addBook(Book b) {
        listb.add(b);
        System.out.print("Add book Successful");
    }

   public void updateBook(String id) {
    boolean found = false;
    for (Book b : listb) {
        if (b.getId().equalsIgnoreCase(id)) {  
            b.updateBook();
            System.out.println("Update book successful!");
            found = true;
            break; 
        }
    }
    if (!found) {
        System.out.println("Book ID not found!");
    }
}

   public void deleteBook(String id) {
    boolean removed = listb.removeIf(b -> b.getId().equalsIgnoreCase(id));
    if (removed) {
        System.out.println("Delete Book Successful!");
    } else {
        System.out.println("Book ID not found!");
    }
}

public Book findBook(String id) {
    for (Book b : listb) {
        if (b.getId().equalsIgnoreCase(id)) {
            return b;
        }
    }
    return null;
}

    public void displayAllBook() {
        if (listb.isEmpty()) {
            System.out.print("ListBook is empty");
        } else {
            System.out.print("List book");
            for (Book b : listb) {
                b.displayDetails();
            }
        }
    }

     public Book findMostExpensive() {
        if (listb.isEmpty()) return null;

        Book max = listb.get(0);
        for (Book b : listb) {
            if (b.calculatePrice()> max.calculatePrice()) {
                max = b;
            }
        }
        return max;
    }
    public void countBook(){
    int text=0, ref = 0;
    for(Book b: listb){
    if (b instanceof TextBook) text++;
            else if (b instanceof ReferenceBook) ref++;
    }
    System.out.print("Count textbook: "+text);
    System.out.print("Count reference book: "+ref);
    }

}
