/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_Loop;

import java.util.Scanner;


public class Ex3_Draw_Retangle {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter h: ");
        int h = sc.nextInt();

        System.out.print("Enter w: ");
        int w = sc.nextInt();

        for (int i = 0; i < h; i++) {       
            for (int j = 0; j < w; j++) {    
                System.out.print("*");
            }
            System.out.println(); 
        }

        sc.close();
    }
}
