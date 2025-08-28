package LEC6_Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex14_Remove_Elements {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 60, 25, 80, 5, 95));
        System.out.println("Before removel: " + list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 50) {
                list.remove(i);
            }
        }

        System.out.println("After removal: " + list);
    }
}
