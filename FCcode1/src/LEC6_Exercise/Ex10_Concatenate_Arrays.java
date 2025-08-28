package LEC6_Exercise;

import java.util.Scanner;

public class Ex10_Concatenate_Arrays {

    public static int[] concatenate(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];

        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Elements of Arrays a1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter  numbers of a1; ");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();// nhap mang a1
        }
        System.out.print("Enter elements of a2: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter numbers of a2: ");
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        int[] result = concatenate(a1, a2);
        System.out.print("New Arrays: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
