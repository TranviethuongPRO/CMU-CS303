package Book_OOP;

import java.util.Scanner;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.2;
    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner sc = new Scanner(System.in);
        System.out.print("Publisher ");
        setPublisher(sc.nextLine());
    }
public void updateBook(String id){
if(getId()== id){
super.updateBook();
Scanner sc = new Scanner(System.in);
System.out.print("Publisher: ");
setPublisher(sc.nextLine());
System.out.println("Update book successful");
}else{System.out.print("book id not found");}
}
public void displayDetails(){
super.displayDetails();
System.out.println("Publisher: "+getPublisher()+", CalculatePrice: "+calculatePrice());
}
    

}
