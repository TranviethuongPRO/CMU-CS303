package LEC6_Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex7_Remove_duplicate {

    public static ArrayList<Integer> remove(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 1, 4, 3, 5));

        System.out.println("before remove duplicate: " + list);
        System.out.println("after remove duplicate: " + remove(list));
    }
}
