
package Book_OOP;

import java.util.Scanner;


public class TextBook extends Book {
  private String subject;

    public TextBook() {
    }
    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
  @Override
    public void addBook(){
    super.addBook();
    Scanner sc = new Scanner(System.in);
    System.out.print("Subject: ");
    setSubject(sc.nextLine());
    }
    public void updateBook(String id){
    if(getId()==id){
    super.updateBook();
    Scanner sc = new Scanner(System.in);
    System.out.print("Subject: ");
    setSubject(sc.nextLine());
    }else{
     System.out.println("Book ID NOT FOUND");
     }
    }
    public void displayDetails(){
    super.displayDetails();
    System.out.println("Subject: "+getSubject()+", Calculate Price: "+calculatePrice());
    }
  
  
    @Override
    public double calculatePrice() {
       return getBasePrice()* 1.1;
    }
    
}
