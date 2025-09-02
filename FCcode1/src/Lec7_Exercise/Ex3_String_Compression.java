package Lec7_Exercise;

public class Ex3_String_Compression {

    public static void main(String[] args) {
        String input = "AAABBCDDDD";
        System.out.println(input);
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        // Duyệt chuỗi từ ký tự thứ 2
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                // Nếu ký tự hiện tại giống ký tự trước, tăng count
                count++;
            } else {
                // Nếu ký tự thay đổi, thêm ký tự trước + count vào StringBuilder
                compressed.append(input.charAt(i - 1));
                compressed.append(count);
                count = 1; // reset count cho ký tự mới
            }
        }
        // Thêm ký tự cuối cùng và count của nó
        compressed.append(input.charAt(input.length() - 1));
        compressed.append(count);
        System.out.println(compressed.toString());
    }
}
