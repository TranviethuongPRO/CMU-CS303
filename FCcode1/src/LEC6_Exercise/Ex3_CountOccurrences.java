package LEC6_Exercise;

import java.util.Scanner;

public class Ex3_CountOccurrences {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number find to X: ");
        int x = sc.nextInt();
        int cout = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                cout++;
            }
        }

        System.out.println("the number " + x + " appear " + cout + "times");
        sc.close();
    }
}
