//Cau1: Tạo 1 class, tên do ng dùng tự đặt, gồm có : -3 thuộc tính (có kiểu dữ liệu khác nhau),-Bao gồm các phương thức EnterData,Insert, Uppdate, Delete, Display, SearchByName, dữ liệu kiểu class trên(sử dụng ArrayList/LinkesList).-Viết hàm main trong file App.java để chạy thực thi các phướng thức

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class VVN452KDL {
    Scanner sc = new Scanner(System.in);
    public int tuoi;
    public int namsinh;
    public String Name;
    public float chieucao;

    public void nhapThongTin() {
        System.out.println("Nhap thong ho va ten sinh vien : ");
        Name = sc.nextLine();
        System.out.println("Nhap nam sinh cua sinh vien : ");
        namsinh = sc.nextInt();
        System.out.println("Nhap chieu cao cua sinh vien: ");
        chieucao = sc.nextFloat();
    }

    public void EnterData() {
        System.out.println("");
    }

    public void Insert() {

    }

    public void Uppdate() {

    }

    public void Delete() {

    }

    public void Display() {

    }

    public void SearchByName() {

    }

}
