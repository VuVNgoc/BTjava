import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        int a = Scanner.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = Scanner.nextInt();
        // 1
        int tong = a + b;
        System.out.println("Tong = " + (a + b));
        int hieu = a - b;
        System.out.println("Hieu = " + (a - b));
        int tich = a * b;
        System.out.println("Tich = " + (a * b));
        float thuong = a / b;
        System.out.println("Thuong = " + (a / b));
        // 2
        int phanDu = a % b;
        System.out.println("Phan du = " + (a % b));
        // 3
        System.out.println("Ket qua ss bang 2 so " + a + " va " + b + " la " + (a == b));
        System.out.println("Ket qua ss khong bang 2 so " + a + " va " + b + " la " + (a != b));
        System.out.println("Ket qua ss lon hon 2 so " + a + " va " + b + " la " + (a > b));
        System.out.println("Ket qua ss nho 2 so " + a + " va " + b + " la " + (a < b));
        System.out.println("Ket qua ss nho hon hoac bang 2 so " + a + " va " + b + " la " + (a <= b));
        System.out.println("Ket qua ss lon hon hoac bang 2 so " + a + " va " + b + " la " + (a >= b));
    }
}