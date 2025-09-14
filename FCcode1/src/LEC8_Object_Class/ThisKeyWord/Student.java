/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC8_Object_Class.ThisKeyWord;


public class Student {
    void m(){
    System.out.println("method is invoked");
    }
    void n(){
    this.m();
    }
    void p(){
    n();
}
    public static void main(String []args)
    {
    Student s1 = new Student();
    s1.p();
    }    
}
