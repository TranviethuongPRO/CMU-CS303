package Lec7_Exercise;

import java.util.Scanner;

public class Ex9_Format_Number_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number string:");
        String number = sc.nextLine();
        StringBuilder sb = new StringBuilder(number);
        // Đếm từ cuối chuỗi và chèn dấu phẩy sau mỗi 3 chữ số
        int count = 0;
        for (int i = sb.length() - 1; i > 0; i--) { // i>0 để không chèn ở đầu
            count++;
            if (count % 3 == 0) {
                sb.insert(i, ',');
            }
        }
        System.out.println("Format number: " + sb.toString());
        sc.close();
    }
}
