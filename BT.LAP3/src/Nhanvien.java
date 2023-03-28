import java.util.Scanner;

public class Nhanvien {
    Scanner sc = new Scanner(System.in);
    String hovten;
    int manv;
    int tuoi;
    int namsinh;
    int hsluong;
    int luong;
    final int luongcb = 1490000;

    public void nhapThongtinnv() {
        System.out.print("Nhap vao ho va ten nv : ");
        hovten = sc.nextLine();

        System.out.print("Nhap manv: ");
        manv = sc.nextInt();

        System.out.print("Nhap nam sinh cua nv: ");
        namsinh = sc.nextInt();

        System.out.print("Nhap he so luong: ");
        hsluong = sc.nextInt();
    }

    public void tinhLuongnv() {
        luong = hsluong * luongcb;
    }

    public void tinhTuoi() {
        tuoi = 2023 - namsinh;
    }

    public void inThongtinnv() {
        System.out.println("Ho va ten nv : " + hovten);
        System.out.println("Ma nv: " + manv);
        System.out.println("Nam sinh cua nv: " + namsinh);
        System.out.println("Luong cua nv : " + luong);
        System.out.println("Tuoi hien tai cua nv: " + tuoi + " tuoi ");
    }

    public static void main(String[] args) {
        Nhanvien nv = new Nhanvien();
        nv.nhapThongtinnv();
        nv.tinhLuongnv();
        nv.tinhTuoi();
        nv.inThongtinnv();
    }

}
