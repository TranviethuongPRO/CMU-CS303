package Lec7_Exercise;

public class EX1_Reverse_Words {

    public static void main(String[] args) {
        String sen = "Java is fun";
        System.out.println(sen);
        String[] words = sen.split(" ");
        // Dùng StringBuilder để xây dựng câu mới
        StringBuilder resen = new StringBuilder();
        // Duyệt mảng từ từ cuối về đầu để đảo thứ tự từ
        for (int i = words.length - 1; i >= 0; i--) {
            resen.append(words[i]);
            if (i != 0) {
                resen.append(" ");
            }
        }
        // In câu đã đảo ngược
        System.out.println(resen.toString());
    }
}
