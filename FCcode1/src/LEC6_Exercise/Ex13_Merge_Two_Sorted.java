package LEC6_Exercise;

import java.util.Arrays;

public class Ex13_Merge_Two_Sorted {

    public static int[] mergeSorted(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6};
        int[] b = {2, 3, 5};
        System.out.println("Arrays A: "+Arrays.toString(a));
        System.out.println("Arrays B: "+Arrays.toString(b));
        System.out.println("Merged: " + Arrays.toString(mergeSorted(a, b)));
    }
}
