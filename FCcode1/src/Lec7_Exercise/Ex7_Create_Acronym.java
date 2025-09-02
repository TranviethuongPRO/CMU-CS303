package Lec7_Exercise;

import java.util.Scanner;

public class Ex7_Create_Acronym {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String phrase = sc.nextLine();
        String[] words = phrase.trim().split("\\s+");
        StringBuilder acronym = new StringBuilder();
        // Duyệt từng từ, lấy ký tự đầu tiên và viết hoa
        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        System.out.println("Acronym: " + acronym.toString());

        sc.close();
    }
}
