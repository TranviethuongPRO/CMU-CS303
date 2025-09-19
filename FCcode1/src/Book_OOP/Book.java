
package Book_OOP;

import java.util.Scanner;


public abstract class Book implements IBook {
    private String id;
    private String title;
    private double basePrice;

    public Book() {
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    
    @Override
    public void addBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Information");
        System.out.print("ID: ");
        setId(sc.nextLine());
        System.out.print("Title: ");
        setTitle(sc.nextLine());
        System.out.print("Base Price: ");
        setBasePrice(Double.parseDouble(sc.nextLine()));
    
    }
    @Override
    public void updateBook(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Book Title: ");
    setTitle(sc.nextLine());
    System.out.print("Base Price: ");
    setBasePrice(Double.parseDouble(sc.nextLine()));
    }
    @Override
    public void displayDetails(){
    System.out.println("Book ID: "+getId()+", Title: "+ getTitle()+", Base Price: "+getBasePrice());
    }
    @Override
    public abstract double calculatePrice();
}
