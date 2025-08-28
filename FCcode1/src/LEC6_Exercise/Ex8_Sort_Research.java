package LEC6_Exercise;

import java.util.*;

public class Ex8_Sort_Research {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter a 5 integer: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.println("Number to find: ");
        int x = sc.nextInt();
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {

                n = i;
                break;
            }
        }

        if (n != -1) {
            System.out.println("the number " + x + " was found at index " + n);
        }
    }
}
