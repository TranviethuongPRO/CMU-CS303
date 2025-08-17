/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC3_Exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC
 */
class Student {
    String id;
    String fullName;
    Date birthday;
    String major;
    float gpa;

    // Method nhập và hiển thị thông tin sinh viên
    public void EnterAndDisplayStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Nhập thông tin
            System.out.print("Enter student ID: ");
            id = scanner.nextLine();

            System.out.print("Enter full name: ");
            fullName = scanner.nextLine();

            System.out.print("Enter birthday (dd/MM/yyyy): ");
            String birthStr = scanner.nextLine();
            birthday = sdf.parse(birthStr);

            System.out.print("Enter major: ");
            major = scanner.nextLine();

            System.out.print("Enter GPA: ");
            String gpaStr = scanner.nextLine();
            gpa = Float.parseFloat(gpaStr);

            // Hiển thị thông tin
            DisplayStudentInfo(id, fullName, birthday, major, gpa);

        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        }
    }

    // Method hiển thị thông tin sinh viên
    public void DisplayStudentInfo(String id, String fullName, Date birthday, String major, float gpa) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\n--- Student Information ---");
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birthday: " + sdf.format(birthday));
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        Student student = new Student();
        student.EnterAndDisplayStudentInfo();
    }
}
