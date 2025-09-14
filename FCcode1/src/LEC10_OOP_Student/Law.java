/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC10_OOP_Student;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Law extends Student {
    private int Toeic;

    public Law() {
    }

    public Law(int Toeic,int studentid, String fullname, String faculty, double gradeAvg) {
        super(studentid, fullname, faculty, gradeAvg);
        this.Toeic= Toeic;   
    }

    public int getToeic() {
        return Toeic;
    }

    public void setToeic(int Toeic) {
        this.Toeic = Toeic;
    }
    
    @Override
  public void inputInfor() {
        super.inputInfor(); // gọi nhập thông tin chung
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Grade Toeic: ");
           setToeic(Integer.parseInt(sc.nextLine()));
        } catch (NumberFormatException ex) {
            System.out.println("Error: Invalid number format! " + ex.getMessage());
        }
    }
    public void updateInfor(int studentid){
    if(getStudentid()== studentid){
    super.updateInfo(studentid);
    Scanner sc = new Scanner(System.in);
    System.out.print("Grade Toeic: ");
    setToeic(sc.nextInt());
    System.out.println("Update Successful");
    
    }else{System.out.println("Student Id not found");}
    }
    public void output(){
    super.output();
    System.out.println("Grade Information: "+getToeic()+" Result Scholarship: "+scholarship());
    }
    

    @Override
    public String scholarship() {
       if(getGradeAvg()>=9.0&& getToeic()>= 700 ){
       return "Pass";}
       return "fail";
    }
}
