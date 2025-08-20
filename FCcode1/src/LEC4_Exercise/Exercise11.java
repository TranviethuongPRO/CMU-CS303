package LEC4_Exercise;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ax^2 + Bx + C = 0");
        System.out.print("Enter an A: ");
        double a = sc.nextDouble();
        System.out.print("Enter an B: ");
        double b = sc.nextDouble();
        System.out.print("Enter an C: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("x = " + x);
            } else {
                if (c == 0) {
                    System.out.println(" phuong trinh co vo so nghiem");
                } else {
                    System.out.println("phuong trinh vo nghiem");
                }
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("phuong trinh vi nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("phuong trinh co nghiem kep X1 = x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println(" phuong trinh co 2 nghiem phan biet x1 = " + x1 + ", x2 = " + x2);
            }
        }
        sc.close();
    }
}
