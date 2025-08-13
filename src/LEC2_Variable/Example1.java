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
        // Execrise1

        int v = 1 + 2;
        System.out.println(" 1 + 2 = " + v);
        Double m = 3.5 + 8;
        System.out.println(" 3.5 + 8 = " + m);
        float a = 1 / 2;
        System.out.println(" 1/2 = " + a);
        double b = 4.5 + 7;
        System.out.println(" 4.5 + 7 = " + b);
        int s = 4 * 5 + 1;
        System.out.println(" 4 * 5 + 1 = " + s);
        int c = 20 % 3 + 2 - 7;
        System.out.println(" 20 % 3 + 2 - 7 = " + c);
        // Execrise 21

        int x = 1;
        int y = x + ++x - x-- - x++ + x - x--;
        System.out.println(" EX 21: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Execrise 22
        int z = x - x-- - x++ + --x - x + x-- + x;
        System.out.println("EX 22 :");
        System.out.println("x = " + x);
        System.out.println("z = " + z);

    }
}
