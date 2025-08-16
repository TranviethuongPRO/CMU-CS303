/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC3_Scanner;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Scanner_next_Line {
    public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter a muti-word sentence: ");
    String sentence = keyboard.nextLine();
    System.out.println(sentence);
    
    System.out.print("Enter a one word string :");
    String s = keyboard.next();
    System.out.println(s);
    }
    
}
