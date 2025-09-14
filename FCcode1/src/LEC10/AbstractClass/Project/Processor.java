package LEC10.AbstractClass.Project;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coutinus;
        do {
            System.out.print("Ban muon nhap thong tin cho ai ? 1 - Sinh vien, 2 - giao vien: ");
            int chon = Integer.parseInt(sc.nextLine());
            if (chon == 1) {
                Student st = new Student();
                System.out.println("Nhap thong tin:");
                st.nhap();
                st.danhGiaRenLuyen();
                st.xuat();
            } else if (chon == 2) {
                Teacher te = new Teacher();
                System.out.println("Nhap thong tin:");
                te.nhap();
                te.xepLoaiThiDua();
                te.xuat();
            }
            System.out.print("\nTiep tuc? 1-yes, 0-no\n");
            coutinus = Integer.parseInt(sc.nextLine());
        } while (coutinus == 1);

        sc.close();
    }
}
