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
public class Ex5_Calculator_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a N: ");
        int N = sc.nextInt();

        long f = 1;
        for (int i = 1; i <= N; i++) {
            f *= i;
        }

        System.out.println("The factorial of " + N + " is: " + f);

        sc.close();
    }
}
