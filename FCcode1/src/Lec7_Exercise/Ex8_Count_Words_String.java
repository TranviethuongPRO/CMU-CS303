package Lec7_Exercise;

import java.util.Scanner;

public class Ex8_Count_Words_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String[] words = input.trim().split("\\s+");

        int wordCount = 0;
        if (words.length == 1 && words[0].isEmpty()) {
            wordCount = 0; // Trường hợp chuỗi rỗng sau trim
        } else {
            wordCount = words.length;
        }
        System.out.println("The number of words in the string is: " + wordCount);

        sc.close();
    }
}
