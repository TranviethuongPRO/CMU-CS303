package LEC6_Exercise;

import java.util.Scanner;

public class Ex1_FindMaximum_Minimum_Value {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            number[i] = sc.nextInt();
        }
        int max = number[0];
        int min = number[0];

        for (int i = 0; i < n; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {
                min = number[i];
            }
        }

        System.out.println("the maximum value is " + max);
        System.out.println("The Minimum value is " + min);
    }
}
