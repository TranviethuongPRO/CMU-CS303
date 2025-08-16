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
public class Exercise10 {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 scanner.useDelimiter("##|\\n");
 
 System.out.println("Enter words separated by '##': ");
 
 while (scanner.hasNext()) {
 System.out.println(scanner.next());
 }
 
 scanner.close();
 }
}
