import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;
        int sl;
        System.out.print("Nhap A= ");
        a = sc.nextInt();
        System.out.print("Nhap B= ");
        b = sc.nextInt();
        System.out.println("Nhap vao lua chon cua ban: ");
        System.out.println("1-Tinh tong ");
        System.out.println("2-Tinh hieu ");
        System.out.println("3-Tinh tich ");
        System.out.println("4-Tinh thuong ");
        sl = sc.nextInt();
        switch (sl) {
            case 1: {
                int tong = a + b;
                System.out.print(a + " + " + b + " = " + tong);
                break;
            }
            case 2: {
                int hieu = a - b;
                System.out.print(a + " - " + b + " = " + hieu);
                break;
            }
            case 3: {
                int tich = a * b;
                System.out.print(a + " * " + b + " = " + tich);
                break;
            }
            case 4: {
                int thuong = a / b;
                float l = thuong;
                System.out.print(a + " / " + b + " = " + l + thuong);
                break;
            }

        }
    }
}
