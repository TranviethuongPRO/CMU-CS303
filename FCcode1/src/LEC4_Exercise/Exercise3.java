
package LEC4_Exercise;

import java.util.Scanner;


public class Exercise3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int num = sc.nextInt();
        if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            System.out.println(num + " is a leap year ");
        } else {
            System.out.println(num + " is not a leap year");
        }
        sc.close();
    }
}
