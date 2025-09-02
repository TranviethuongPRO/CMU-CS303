package Lec7_Exercise;

public class Ex2_Capitalize_Name {

    public static void main(String[] args) {
        String fullName = "ngUYen vAn a ";
        System.out.println(fullName);
        String[] words = fullName.trim().split("\\s+");
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                // Chữ cái đầu viết hoa, các chữ cái còn lại viết thường
                name.append(word.substring(0, 1).toUpperCase());
                if (word.length() > 1) {
                    name.append(word.substring(1).toLowerCase());
                }
                if (i != words.length - 1) {
                    name.append(" "); // Thêm khoảng trắng giữa các từ
                }
            }
        }

        // In tên đã chuẩn hóa
        System.out.println(name.toString());
    }
}
