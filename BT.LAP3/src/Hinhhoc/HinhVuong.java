package HinhHoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        super.setTen("Hinh Vuong");
    }

    public void nhapCanh() {
        System.out.print("Nhap canh : ");
        Scanner sc = new Scanner(System.in);
        dai = rong = sc.nextFloat();
    }
}
