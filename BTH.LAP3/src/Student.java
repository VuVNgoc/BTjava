import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private int Masv, namsinh, tuoi;
    private String Hovaten;
    boolean gtinh;

    void nhapThongtin() {
        System.out.print("Nhap ho va ten cua std : ");
        Hovaten = sc.nextLine();

        System.out.print("Nhap vao ma sv cua std : ");
        Masv = sc.nextInt();

        System.out.print("Nhap nam sinh cua std : ");
        namsinh = sc.nextInt();

        System.out.print("Nhap gioi tinh cua std : ");
        gtinh = sc.hasNext();

    }

    void inHovaTen() {
        System.out.println("Ho va ten : " + Hovaten);
    }

    void inNamsinh() {
        System.out.println("Nam sinh la : " + namsinh);
    }

    void inMasv() {
        System.out.println("Ma sv cua std la : " + Masv);
    }

    void Tinhtuoi() {
        tuoi = 2023 - namsinh;
    }

    void inTuoi() {
        System.out.println("Nam nay std " + tuoi + " tuoi");
    }

    public static void main(String[] args) {
        Student std = new Student();
        std.nhapThongtin();
        std.inHovaTen();
        std.inNamsinh();
        std.inMasv();
        std.Tinhtuoi();
        std.inTuoi();
    }

}
