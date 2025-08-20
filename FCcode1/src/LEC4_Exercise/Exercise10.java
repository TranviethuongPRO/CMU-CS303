/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC4_Exercise;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an A: ");
        double a = sc.nextDouble();
        System.out.print("Enter an B: ");
        double b = sc.nextDouble();
        System.out.print("Enter an C: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("This is an equilateral triangle.");
            } else if (a == b || a == c || b == c) {
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle.");
        }

        sc.close();

    }
}
