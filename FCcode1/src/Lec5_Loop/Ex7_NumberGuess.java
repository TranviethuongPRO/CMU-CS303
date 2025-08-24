/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_Loop;

import java.util.Random;
import java.util.Scanner;


public class Ex7_NumberGuess {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int secret = rd.nextInt(100) + 1; 
        int guess =0;

        do {
            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();

            if (guess < secret) {
                System.out.println("Your number is lower than the secret number.");
            } else if (guess > secret) {
                System.out.println("Your number is higher than the secret number.");
            } else {
                System.out.println("You guessed correctly!");
            }
        } while (guess != secret);

        sc.close();
    }
}