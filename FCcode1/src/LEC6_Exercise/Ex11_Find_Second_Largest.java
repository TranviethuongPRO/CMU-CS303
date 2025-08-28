/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC6_Exercise;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Ex11_Find_Second_Largest {
     public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15, 20};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
  
    System.out.println("Arrays: " + Arrays.toString(arr));
        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("No second largest element.");
        else
            System.out.println("The second-largest element is: " + secondLargest);
    }
}
