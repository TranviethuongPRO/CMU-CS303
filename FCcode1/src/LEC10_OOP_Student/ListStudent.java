/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC10_OOP_Student;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ListStudent {
    private ArrayList<Student> liststu;
  public ListStudent(){
  liststu = new ArrayList<>();
  }
  public void addlist(Student st){
  liststu.add(st);
  System.out.println("Add student Successful");
  }
   public void updatelist(int studentid) {
        boolean found = false;
        for (Student st : liststu) {
            if (st.getStudentid() == studentid) {
                st.updateInfo(studentid); 
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Studentid not found ");
        }
    }

    public void removelist(int studentid) {
        boolean removed = liststu.removeIf(sv -> sv.getStudentid() == studentid);
        if (removed) {
            System.out.println("StudentID was remove " + studentid);
        } else {
            System.out.println("can't found student id!");
        }
    }

   
    public void research(int studentid) {
        for (Student st : liststu) {
            if (st.getStudentid() == studentid ) {
                st.output();
                return;
            }
        }
        System.out.println("studentID not found " + studentid);
    }

 
    public void outputlist() {
        if (liststu.isEmpty()) {
            System.out.println("list student empty!");
        } else {
            System.out.println("List students");
            for (Student st : liststu) {
                st.output();
            }
        }
    }
}
