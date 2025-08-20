
package LEC4_Exercise;

import java.util.Scanner;


public class Exercise7 {
      public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter an A: ");
        int a = sc.nextInt();
        System.out.print("Enter a B: ");
        int b = sc.nextInt();
        System.out.print("Enter a C: ");
        int c = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("the largest is " + max);
    }
}
