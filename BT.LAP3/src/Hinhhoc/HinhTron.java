package HinhHoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    private float bk;

    public float getBanKinh() {
        return bk;
    }

    public void setBanKinh(float bk) {
        this.bk = bk;
    }

    public HinhTron() {
        super.setTen("Hinh Tron");
    }

    public void nhapBanKinh(Scanner sc) {
        System.out.print("Nhap ban kinh : ");
        setBanKinh(sc.nextFloat());
    }

    public void TinhChuVi() {
        cv = 2 * super.getPI() * bk;
        super.setChuVi(cv);
    }

    public void TinhDienTich() {
        dt = super.getPI() * bk * bk;
    }
}
