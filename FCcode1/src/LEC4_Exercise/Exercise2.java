
package LEC4_Exercise;

import java.util.Scanner;


public class Exercise2 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an age: ");
    int age = sc.nextInt();
    if(age >=0 && age <=12){
    System.out.print(" child");
    }
    else if (age >= 13 && age <= 19){
    System.out.print("Teenager");
    }
    else if (age >= 20 && age <= 59){
    System.out.print("Adult");
    }
    else if (age >= 60){
    System.out.print("Senior");
    }
    else{
    System.out.print("Invalid");
    }
    sc.close();
    }
    
}
