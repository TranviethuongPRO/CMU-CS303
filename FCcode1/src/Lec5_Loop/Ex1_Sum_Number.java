
package Lec5_Loop;

import java.util.Scanner;


public class Ex1_Sum_Number {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a N: ");
     int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        
        System.out.println("The sum from 1 to " + n + " is: " + sum);
        
        sc.close();
    }
}
