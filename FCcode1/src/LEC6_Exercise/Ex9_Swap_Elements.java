package LEC6_Exercise;

import java.util.*;

public class Ex9_Swap_Elements {

    public static void swap(int arr[], int in1, int in2) {
        // function to swap index 1 and  index 2
        int temp = arr[in1];
        arr[in1] = arr[in2];
        arr[in2] = temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a elements of arrays: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter a number of arrays: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        System.out.println("Enter a index1: ");
        int in1 = sc.nextInt();
        System.out.println("Enter a index2: " + Arrays.toString(arr));
        int in2 = sc.nextInt();

        if (in1 < 0 || in1 >= n || in2 < 0 || in2 >= n) {
            System.out.println("error! ");
        } else {
            swap(arr, in1, in2);
            System.out.println("Array after Swap: " + Arrays.toString(arr));
        }

    }
}
