/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC4_Exercise;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercise6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an average score: ");
        double s = sc.nextDouble();
        if (s >= 9.0 && s <= 10) {
            System.out.println("Excellent");
        } else if (s >= 8.0 && s <= 8.9) {
            System.out.println("Good");
        } else if (s >= 6.5 && s <= 7.9) {
            System.out.println("Fair");
        } else if (s >= 5.0 && s <= 6.4) {
            System.out.println("Average");
        } else if (s < 5.0) {
            System.out.println("Fail");
        } else {
            System.out.println("Error");
        }
    }
}
