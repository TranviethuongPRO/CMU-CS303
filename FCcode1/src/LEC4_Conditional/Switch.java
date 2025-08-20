/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC4_Conditional;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Switch {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap X: ");
    int x = scanner.nextInt();
    switch(x){
        case 2 :System.out.println(" thu 2"); break;
        case 3 :System.out.println(" thu 3"); break;
        case 4 :System.out.println(" thu 4"); break;
        case 5 :System.out.println(" thu 5"); break;
        case 6 :System.out.println(" thu 6"); break;
        case 7 :System.out.println(" thu 7"); break;
        case 8 :System.out.println(" chu nhat"); break;
        default : System.out.println("Nhap sai");
    }
    
    }
}
