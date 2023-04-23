package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    public HinhChuNhat() {
        super.setTen("Hinh Chu Nhat");
    }

    public void nhapChieudai() {
        System.out.print("Nhap chieu dai : ");
        Scanner sc = new Scanner(System.in);
        setDai(sc.nextFloat());
    }

    public void nhapChieuRong() {
        System.out.print("Nhap chieu rong : ");
        Scanner sc = new Scanner(System.in);
        setRong(sc.nextFloat());
    }

    public void tinhChuVi() {
        cv = 2 * (dai + rong);
        setChuVi(cv);
    }

    public void tinhDientich() {
        dt = dai * rong;
    }
}
