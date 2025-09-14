
package LEC10.AbstractClass.Project;



import java.util.Scanner;

public class People {
    public String Fullname;
    public String Sex;
    public int PersonalId;
    public String Birthday;  // dùng String cho đơn giản

    Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.print("Ho va ten: ");
        Fullname = sc.nextLine();
        System.out.print("Ngay sinh(dd/MM/YYYY): ");
        Birthday = sc.nextLine();
        System.out.print("Gioi tinh: ");
        Sex = sc.nextLine();
        System.out.print("CMND: ");
        PersonalId = Integer.parseInt(sc.nextLine());
    }

    public void xuat() {
        System.out.print("hoVaTen=" + Fullname 
                + ", ngaySinh=" + Birthday 
                + ", gioiTinh=" + Sex 
                + ", cmnd=" + PersonalId);
    }
}
