package Main;

import java.util.Scanner;

import HinhHoc.HinhChuNhat;
import HinhHoc.HinhTron;
import HinhHoc.HinhTru;
import HinhHoc.HinhVuong;

public class mainHH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh(sc);
        ht.TinhChuVi();
        ht.TinhDienTich();
        ht.inChuVi();
        ht.inDientich();

        HinhTru htru = new HinhTru();
        htru.xuatTen();
        htru.nhapChieuCao();
        htru.tinhThetich();
        htru.inThetich();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieudai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.inChuVi();
        hcn.tinhDientich();
        hcn.inDientich();

        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDientich();
        hv.inChuVi();
        hv.inDientich();
    }
}
