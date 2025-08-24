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
public class Ex8_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter from 1 to 10: ");
            number = sc.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Invalid number, please try again.");
            }
        } while (number < 1 || number > 10);

        System.out.println("You entered the number: " + number);

        sc.close();
    }
}
