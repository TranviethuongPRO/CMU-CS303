/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC10_OOP_Student;

import java.text.NumberFormat;
import java.util.Scanner;

public abstract class Student {

    private int studentid;
    private String fullname;
    private String faculty;
    private double gradeAvg;

    public Student() {
    }

    public Student(int studentid, String fullname, String faculty, double gradeAvg) {
        this.studentid = studentid;
        this.fullname = fullname;
        this.faculty = faculty;
        this.gradeAvg = gradeAvg;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public double getGradeAvg() {
        return gradeAvg;
    }

    public void setGradeAvg(double gradeAvg) {
        this.gradeAvg = gradeAvg;
    }

    public void inputInfor() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Information: ");
            System.out.print("Studetn ID: ");
            setStudentid(Integer.parseInt(sc.nextLine()));
            System.out.print("Fullname: ");
            setFullname(sc.nextLine());
            System.out.print("Faculty: ");
            setFaculty(sc.nextLine());
            System.out.print("Grade Average: ");
            setGradeAvg(Double.parseDouble(sc.nextLine()));
        } catch (NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void updateInfo(int studentid) {
        if (this.studentid == studentid) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Update Information Student ID " + getStudentid());
                System.out.print("Fullname: ");
                setFullname(sc.nextLine());
                System.out.print("Faculty: ");
                setFaculty(sc.nextLine());
                System.out.print("Grade Average: ");
                setGradeAvg(Double.parseDouble(sc.nextLine()));
                System.out.println("Update successful");
            } catch (NumberFormatException ex) {
                System.out.print("Error " + ex.getMessage());
            }
        } else {
            System.out.println("Student ID not found");
        }

    }

    public void output() {
        System.out.println("Student Information");
        System.out.println("Student ID: " + getStudentid() + ", Fullname: " + getFullname() + ", Faculty: " + getFaculty() + ", Grade Average: " + getGradeAvg());
    }

    public abstract String scholarship();

}
