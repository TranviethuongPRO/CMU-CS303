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
public class Exercise4 {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
  
    System.out.print("nhap so a = ");
    double a = scanner.nextDouble();
    System.out.print("nhap so b = ");
    double b = scanner.nextDouble();
    Double avg = (a+b)/2;
    System.out.println("sum = " + avg);
    }
}
