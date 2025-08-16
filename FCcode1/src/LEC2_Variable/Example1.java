/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC2_Variable;

/**
 *
 * @author PC
 */
public class Example1 {
     public static void main(String[] args) {
       
        // Exercise 1
        System.out.println("Exercise 1:");
        System.out.println("(1) " + (1 + 2));
        System.out.println("(2) " + (3.5 + 8));
        System.out.println("(3) " + (1.0 / 2)); // dùng 1.0 để tránh chia nguyên
        System.out.println("(4) " + (4.5 + 7));
        System.out.println("(5) " + (4 * 5 + 1));
        System.out.println("(6) " + (20 % 3 + 2 - 7));

        // Exercise 21
        int x = 1;
        int y = x + ++x - x-- - x++ + x - x--;
        System.out.println("\nExercise 21:");
        System.out.println("y = " + y);
        System.out.println("x = " + x);

        // Exercise 22
        x = 1;
        int z = x - x-- - x++ + --x - x-- + x;
        System.out.println("\nExercise 22:");
        System.out.println("z = " + z);
        System.out.println("x = " + x);
    }
}
