
package LEC6_Exercise;

import java.util.Scanner;

public class Ex12_Character_Frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine().toLowerCase();

        int[] freq = new int[26];
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + freq[i]);
            }
        }
    }
}
