package LEC6_Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6_Unlimited_Data {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        int sum = 0;
        System.out.println("Enter a number (-1 to stop): ");
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            number.add(n);
            sum += n;
        }
        System.out.println("Numbers entered: " + number);
        System.out.println("the sum is: " + sum);

    }
}
