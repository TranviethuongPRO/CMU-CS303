/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC4_Conditional;

/**
 *
 * @author PC
 */
public class True_false_exercise {

    public static void main(String args[]) {
        int x = 42;
        int y = 17;
        int z = 25;
        if (y < x && y <= z) {
            System.out.println(true);
        } else {
            System.out.println(false);
        };
        if (x % 2 == y % 2 || x % 2 == z % 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        };
        if (x <= y + z && x >= y + z) {
            System.out.println(true);
        } else {
            System.out.println(false);
        };
        if (!(x < y && x < z)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        };
        if ((x + y) % 2 == 0 || !((z - y) % 2 == 0)) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
    }
}
