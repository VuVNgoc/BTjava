import java.util.Scanner;

public class HinhTron {
    Scanner sc = new Scanner(System.in);
    final float PI = 3.14f;
    float r;
    float cv;
    float s;

    void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ban kinh r= ");
        r = sc.nextFloat();
        sc.close();
    }

    void tinhChuVi() {
        cv = 2 * r * PI;
    }

    void inChuVi() {
        System.out.print("Chu vi hinh tron = " + cv);
    }

    void tinhDientich() {
        s = r * r * PI;
    }

    void inDientich() {
        System.out.println("Dien tich hinh tron = " + s);
    }

    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.inChuVi();
        ht.tinhDientich();
        ht.inDientich();
    }

}
