/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_Loop;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex9_Calculator_Average {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0, number;

        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            number = sc.nextInt();

            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        sc.close();
    }
}
