package LEC4_Conditional;

import java.util.Scanner;

public class if_else {

    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an X = ");
        double x = scanner.nextDouble();
        System.out.println("Enter a Y =");
        double y = scanner.nextDouble();
        int quad = quadrant(x, y);
        System.out.println("goc phan tu thu: " + quad
        );
    }
}
