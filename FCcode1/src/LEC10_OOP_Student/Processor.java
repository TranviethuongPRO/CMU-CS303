
package LEC10_OOP_Student;

import java.util.Scanner;


public class Processor {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListStudent list = new ListStudent();
        int coutinus = 1;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add student Accountant");
            System.out.println("2. Add student Law");
            System.out.println("3. Output list student");
            System.out.println("4. Update Information student ");
            System.out.println("5. research follow studentID");
            System.out.println("6. Delete follow studentID");
            System.out.println("0. Cancel");
            System.out.print("Select: ");
            int select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1: {
                    Accountant ac = new Accountant();
                    ac.inputInfor();
                    list.addlist(ac);
                    break;
                }
                case 2: {
                    Law la = new Law();
                    la.inputInfor();
                    list.addlist(la);
                    break;
                }
                case 3: {
                    list.outputlist();
                    break;
                }
                case 4: {
                    System.out.print("Enter studentID need to update: ");
                    int studentid = Integer.parseInt(sc.nextLine());
                    list.updatelist(studentid);
                    break;
                }
                case 5: {
                    System.out.print("Enter studentID need to Research: ");
                    int studentid = Integer.parseInt(sc.nextLine());
                    list.research(studentid);
                    break;
                }
                case 6: {
                    System.out.print("Enter studentID to delete: ");
                    int studentid = Integer.parseInt(sc.nextLine());
                    list.removelist(studentid);
                    break;
                }
                case 0: {
                    coutinus = 0;
                    System.out.println("Cancel Program!");
                    break;
                }
                default:
                    System.out.println("Select Error!");
            }
        } while (coutinus != 0);

        sc.close();
    }
}
