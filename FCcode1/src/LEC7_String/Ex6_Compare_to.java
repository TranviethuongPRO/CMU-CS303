package LEC7_String;

public class Ex6_Compare_to {

    public static void main(String args[]) {

        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "HelloWorld";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
    }
}
