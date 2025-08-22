package LEC5_Exercise;

import java.util.Random;

public class Exercise11 {

    public static void main(String args[]) {
        Random rd = new Random();
        int sx1, sx2;
        int count = 0;
        do {
            sx1 = rd.nextInt(6) + 1;
            sx2 = rd.nextInt(6) + 1;
            count++;
            System.out.println("Roll " + count + ": " + sx1 + " and " + sx2);

        } while (sx1 != sx2);
        System.out.println("\nYOU roll double after " + count + " tries");

    }
}
