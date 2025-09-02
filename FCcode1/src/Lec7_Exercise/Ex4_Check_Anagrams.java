package Lec7_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4_Check_Anagrams {

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Nếu độ dài khác nhau, chắc chắn không phải Anagram
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1:");
        String str1 = sc.nextLine();
        System.out.println("Enter string2:");
        String str2 = sc.nextLine();
        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are Anagrams.");
        } else {
            System.out.println("The two strings are not Anagrams.");
        }

        sc.close();
    }

}
