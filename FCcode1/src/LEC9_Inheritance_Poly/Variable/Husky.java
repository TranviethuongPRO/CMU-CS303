/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC9_Inheritance_Poly.Variable;

/**
 *
 * @author PC
 */
public class Husky extends Dog {
    int price = 1500;
void displayPrice() {
System.out.println("Dog's price: " + super.price); // refer to superclass's variable
System.out.println("Husky's price: " + price); // refer to subclass's variable
}
}
