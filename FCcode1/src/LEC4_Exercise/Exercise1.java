
package LEC4_Exercise;

import java.util.Scanner;


public class Exercise1 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter a Integer: ");
     int num = sc.nextInt();
     if(num %2 == 0){
     System.out.println(num+" is even number ");
     }else{
      System.out.println(num+" is odd number");
     }
   sc.close();
   } 
}
