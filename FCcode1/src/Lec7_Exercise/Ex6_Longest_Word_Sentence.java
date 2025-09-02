package Lec7_Exercise;

import java.util.Scanner;

public class Ex6_Longest_Word_Sentence {

    public static String findLongestWord(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        String longestWord = "";
        int maxLength = 0;
        // Duyệt từng từ trong mảng
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        // Tìm từ dài nhất
        String longest = findLongestWord(sentence);
        System.out.println("longest word : " + longest);
        sc.close();
    }
}
