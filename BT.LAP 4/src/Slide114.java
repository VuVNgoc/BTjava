import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Slide114 {
    public static void main(String[] args) {
        Map<String, Sinhvien> svm = new HashMap<>();
        Sinhvien sv = new Sinhvien();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        sv.nhapSinhVien(svm, n, sc);
        sv.showSvLop(svm, sc);
        sv.showSvMSV(svm, sc);
    }
}
