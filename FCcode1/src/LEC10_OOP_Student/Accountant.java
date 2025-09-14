
package LEC10_OOP_Student;

import java.util.Scanner;


public class Accountant extends Student {
    private double gradeIT;

    public Accountant() {
    }

    public Accountant(double gradeIT,int studentid, String fullname, String faculty, double gradeAvg) {
        super(studentid, fullname, faculty, gradeAvg);
        this.gradeIT= gradeIT; 
    }

    public double getGradeIT() {
        return gradeIT;
    }

    public void setGradeIT(double gradeIT) {
        this.gradeIT = gradeIT;
    }
      public void inputInfor() {
        super.inputInfor(); 
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Grade IT: ");
            setGradeIT(Float.parseFloat(sc.nextLine()));
        } catch (NumberFormatException ex) {
            System.out.println("Error: Invalid number format! " + ex.getMessage());
        }
    }
    public void updateInfor(int studentid){
    if(getStudentid()== studentid){
    super.updateInfo(studentid);
    Scanner sc = new Scanner(System.in);
    System.out.print("Grade Information: ");
    setGradeIT(sc.nextDouble());
    System.out.println("Update Successful");
    
    }else{System.out.println("Student Id not found");}
    }
    public void output(){
    super.output();
    System.out.println("Grade Information: "+getGradeIT()+" Result Scholarship: "+scholarship());
    }
    

    @Override
    public String scholarship() {
       if(getGradeAvg()>=9.0&& getGradeIT()>=9.5 ){
       return "Pass";}
       return "fail";
    }
    
}
