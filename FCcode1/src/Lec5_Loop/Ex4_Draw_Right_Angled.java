/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_Loop;

import java.util.Scanner;


public class Ex4_Draw_Right_Angled {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter h: ");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++) {         
            for (int j = 1; j <= i; j++) {      
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
