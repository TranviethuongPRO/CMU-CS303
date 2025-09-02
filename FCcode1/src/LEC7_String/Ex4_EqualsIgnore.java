
package LEC7_String;


public class Ex4_EqualsIgnore {
    public static void main(String arg[]){
    String s1 = "Hello";
    String s2 = "HELLO";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    }
}
