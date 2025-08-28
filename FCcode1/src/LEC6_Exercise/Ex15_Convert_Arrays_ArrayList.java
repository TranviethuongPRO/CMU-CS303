package LEC6_Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex15_Convert_Arrays_ArrayList {

    public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] arr = {"Ann", "Bob"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Charles", "David"));

        System.out.println("Array to ArrayList: " + arrayToArrayList(arr));
        System.out.println("ArrayList to Array: " + Arrays.toString(arrayListToArray(list)));
    }
}
