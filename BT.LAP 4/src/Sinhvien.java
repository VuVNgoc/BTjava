import java.util.Map;
import java.util.Scanner;

public class Sinhvien {
    public String maSv;
    public String hoTen;
    public String lop;

    Scanner sc = new Scanner(System.in);

    public void nhapSinhVien(Map<String, Sinhvien> svm, int n, Scanner sc) {
        System.out.println("===Nhap sinh vien===");
        for (int i = 0; i < n; i++) {
            Sinhvien sinhVien = new Sinhvien();
            System.out.println("Nhap thong tin");
            System.out.print("Ma sinh vien: ");
            sinhVien.maSv = sc.nextLine();
            System.out.print("Ho ten: ");
            sinhVien.hoTen = sc.nextLine();
            System.out.print("Lop: ");
            sinhVien.lop = sc.nextLine();
            svm.put(sinhVien.maSv, sinhVien);
        }
    }

    public void hienThi() {
        System.out.println("\tHoten: " + hoTen + "MSV: " + maSv + "\tLop: " + lop);
    }

    public void showSvLop(Map<String, Sinhvien> svm, Scanner sc) {
        System.out.print("Nhap ten lop: ");
        String lopNhap = sc.nextLine();

        System.out.println("Cac sinh vien thuoc lop " + lopNhap + " la:");
        for (Sinhvien sinhVien : svm.values()) {
            if (sinhVien.lop.equals(lopNhap)) {
                sinhVien.hienThi();
            }
        }
    }

    public void hienThiSV(Map<String, Sinhvien> svm) {
        for (Sinhvien sinhVien : svm.values()) {
            sinhVien.hienThi();
        }
    }

    public void showSvMSV(Map<String, Sinhvien> svm, Scanner sc) {
        System.out.print("Nhap ma sinh vien: ");
        String msvNhap = sc.nextLine();

        System.out.println("thong tin sinh vien co ma " + msvNhap + " la:");
        for (Sinhvien sinhVien : svm.values()) {
            if (sinhVien.lop.equals(msvNhap)) {
                sinhVien.hienThi();
            }
        }
    }
}
