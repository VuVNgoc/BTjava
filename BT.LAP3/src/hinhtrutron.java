import java.util.Scanner;

public class hinhtrutron {
    Scanner sc = new Scanner(System.in);
    final float PI = 3.14f;
    float r, h, cv, s, v;

    public void nhapBanKinh() {
        System.out.print("Nhap vao ban kinh: ");
        r = sc.nextFloat();
        System.out.print("Nhap vao chieu cao: ");
        h = sc.nextFloat();
    }

    public void tinhChuVi() {
        cv = 2 * r * PI;
    }

    public void inChuVi() {
        System.out.println("Chu vi = " + cv);
    }

    public void tinhDientich() {
        s = r * r * PI;
    }

    public void inDientich() {
        System.out.println("Dien tich = " + s);
    }

    public void tinhThetich() {
        v = PI * r * r * h;
    }

    public void inThetich() {
        System.out.println("The tich = " + v);
    }

    public static void main(String[] args) {
        hinhtrutron htt = new hinhtrutron();
        htt.nhapBanKinh();
        htt.tinhChuVi();
        htt.tinhDientich();
        htt.tinhThetich();
        htt.inChuVi();
        htt.inDientich();
        htt.inThetich();
    }
}
