import java.util.Scanner;

public class Bai10 {
    public void main(String[] args) {
        String chuoi;
        char kyTu;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap vao mot chuoi bat ky: ");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);
        System.out.print("Nhap vao ky tu can dem so lan xuat hien: ");
        kyTu = sc.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (kyTu == chuoi.length()) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu " + kyTu + "trong chuoi vua nhap la: " + count);
    }

}
