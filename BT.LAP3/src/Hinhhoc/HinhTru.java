package Hinhhoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float cc;

    public HinhTru() {
        ten = "Hinh Tru";
    }

    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.print("Chieu cao = ");
        Scanner sc = new Scanner(System.in);
        cc = sc.nextFloat();
    }

    public void tinhThetich() {
        tinhDientich();
        tt = dt * cc;
    }
}
