package Main;

import Hinhhoc.HinhChuNhat;
import Hinhhoc.HinhTron;
import Hinhhoc.HinhTru;
import Hinhhoc.HinhVuong;

public class mainHH {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDientich();
        ht.inChuVi();
        ht.inDientich();

        System.out.println("\n");

        HinhTru htru = new HinhTru();
        htru.xuatTen();
        htru.nhapChieuCao();
        htru.tinhThetich();
        htru.inThetich();
        System.out.println("\n");

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieudai();
        hcn.tinhChuVi();
        hcn.tinhDientich();
        hcn.inChuVi();
        hcn.inDientich();

        System.out.println("\n");

        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDientich();
        hv.inChuVi();
        hv.inDientich();
    }
}
