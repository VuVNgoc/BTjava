package HinhHoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float cc;

    public float getChieuCao() {
        return cc;
    }

    public void setChieuCao(float cc) {
        this.cc = cc;
    }

    public HinhTru() {
        super.setTen("Hinh Tru");
    }

    public void nhapChieuCao() {
        System.out.print("Chieu cao = ");
        Scanner sc = new Scanner(System.in);
        setChieuCao(sc.nextFloat());
    }

    public void tinhThetich() {
        tt = super.getPI() * (float) Math.pow(super.getBanKinh(), 2) * cc;
        super.setTheTich(tt);
    }
}
