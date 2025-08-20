
package LEC4_Exercise;

import java.util.Scanner;


public class Exercise9 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int num = sc.nextInt();
     int abs ;
     if(num >=0){
     abs = num;
     }else {
     abs = -num;
     }
     System.out.println(" the Absolute value is  "+ abs);
    }
}
