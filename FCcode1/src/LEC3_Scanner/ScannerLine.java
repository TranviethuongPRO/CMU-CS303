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
public class ScannerLine {
   public static void main(String args[]){
   Scanner  keyboard = new Scanner(System.in);
   System.out.print("Enter a sentence : ");
   String sentence = keyboard.nextLine();
   System.out.println(sentence);
   } 
}
