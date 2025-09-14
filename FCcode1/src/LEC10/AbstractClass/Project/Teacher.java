/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC10.AbstractClass.Project;

/**
 *
 * @author PC
 */
public class Teacher extends People {
     private String TeacherID;

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Ma giao vien: ");
        TeacherID = sc.nextLine();
    }

    public void xepLoaiThiDua() {
        System.out.println("Chon xep loai thi dua:");
        System.out.println("1-loai A, 2-loai B, 3-loai C");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1: System.out.println("Thi dua loai A"); break;
            case 2: System.out.println("Thi dua loai B"); break;
            case 3: System.out.println("Thi dua loai C"); break;
            default: System.out.println("Khong hop le");
        }
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(", maGiaoVien=" + TeacherID);
    }
}
