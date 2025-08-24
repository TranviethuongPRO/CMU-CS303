
package Lec5_Loop;

import java.util.Scanner;


public class Ex2_Mul_table {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer (2-9): ");
        int num = sc.nextInt();
        
        if (num < 2 || num > 9) {
            System.out.println("Invalid input");
        } else {
           
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
        
        sc.close();
    }
}
