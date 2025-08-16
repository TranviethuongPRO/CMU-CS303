/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC3_Exercise;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercise9 {
    public static void main(String args []){
   
 Scanner scanner = new Scanner(System.in);
 
 System.out.print("Enter an integer: ");
 int number = scanner.nextInt();
 
 // Fixing the issue by adding an extra nextLine()
 scanner.nextLine(); // To consume the newline character
 
 System.out.print("Enter a sentence: ");
 String sentence = scanner.nextLine();
 
 System.out.println("Number: " + number);
 System.out.println("Sentence: " + sentence);
 }
    
}
