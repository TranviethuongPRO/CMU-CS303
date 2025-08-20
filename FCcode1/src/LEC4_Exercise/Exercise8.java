package LEC4_Exercise;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an X: ");
        int x = sc.nextInt();
        System.out.print("Enter a Y: ");
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4th quadrant");
        } else {
            System.out.println("Error");
        }
    }
}
