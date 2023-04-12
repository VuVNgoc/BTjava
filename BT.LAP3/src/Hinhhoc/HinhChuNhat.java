package Hinhhoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public void hChuNhat() {
        ten = "Hinh Chu Nhat";
    }

    public void nhapChieudai() {
        System.out.print("Chieu dai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }

    public void tinhChuVi() {
        cv = 2 * (dai + rong);
    }

    public void tinhDientich() {
        dt = dai * rong;
    }
}
