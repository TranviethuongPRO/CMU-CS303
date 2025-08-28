
package LEC6_Exercise;

import java.util.ArrayList;


public class Ex5_Filte_Even_Numbers {
      public static ArrayList<Integer> filterEven(int[] arr) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> result = filterEven(numbers);

        System.out.println("Even numbers: " + result);
    }
}
