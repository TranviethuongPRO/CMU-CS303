
package Lec7_Exercise;


public class Ex10_Longest_Common_substring {
     public static String findLongest(String str1, String str2) {
        // Xác định chuỗi nào ngắn hơn để tối ưu vòng lặp
        String s = str1.length() <= str2.length() ? str1 : str2;
        String l = str1.length() > str2.length() ? str1 : str2;
        String longestSub = "";
        // Duyệt tất cả các chuỗi con của chuỗi ngắn hơn
        for (int start = 0; start < s.length(); start++) {
            for (int end = start + 1; end <= s.length(); end++) {
                String sub = s.substring(start, end);
                if (l.contains(sub) && sub.length() > longestSub.length()) {
                    longestSub = sub;
                }
            }
        }
        return longestSub;
    }
    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "XBYCDEFZ";
        String longestCommon = findLongest(str1, str2);
        System.out.println("Longest common substring: " + longestCommon);
    }
}
