
package LEC4_Exercise;

import java.util.Scanner;


public class Exercise4 {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an A: ");
        int a = sc.nextInt();
        System.out.print("Enter a B: ");
        int b = sc.nextInt();
        System.out.print("Select: (+, -, *, /): ");
        char oper = sc.next().charAt(0);

        switch (oper) {
            case '+':
                System.out.println(a + " + " + b
                        + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b
                        + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b
                        + " = " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Error");
                }
                ;
                break;
            default:
                System.out.println("Invaild");
        }
        sc.close();
    }
}
