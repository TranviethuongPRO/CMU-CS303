
package LEC10.AbstractClass.Project;


public class Student extends People {
    private String StudentId;

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Ma sinh vien: ");
        StudentId = sc.nextLine();
    }

    public void danhGiaRenLuyen() {
        System.out.println("Danh gia ren luyen:");
        System.out.println("Chon 1-gioi, 2-kha, 3-trung binh, 4-yeu");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1: System.out.println("Xep loai gioi"); break;
            case 2: System.out.println("Xep loai kha"); break;
            case 3: System.out.println("Xep loai trung binh"); break;
            case 4: System.out.println("Xep loai yeu"); break;
            default: System.out.println("Khong hop le");
        }
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(", maSinhVien=" + StudentId);
    }
}
