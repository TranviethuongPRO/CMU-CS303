
package Lec5_Loop;

import java.util.Scanner;


public class Ex6_Sum_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int n = sc.nextInt();

        int sum = 0;
        while (n > 0) {
            sum += n % 10;  
            n /= 10;        
        }

        System.out.println("The sum of digits is: " + sum);

        sc.close();
    }
}
