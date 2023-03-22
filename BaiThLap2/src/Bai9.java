
//Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả số, ký tự thường và ký tự hoa từ bàn phím. 
//Sau đó đếm và in ra số ký tự thường và ký tự hoa và số có trong chuỗi đó.
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        int number = 0;
        char kytuhoa = 0, kytuthuong = 0;

        System.out.print("Nhap vao chuoi bat ky: ");
        chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isUpperCase(chuoi.charAt(i))) {
                kytuhoa++;
            }
            if (Character.isLowerCase(chuoi.charAt(i))) {
                kytuthuong++;
            }
            if (Character.isDigit(chuoi.charAt(i))) {
                number++;
            }
        }
        // System.out.print("Cac ky tu co trong chuoi la: ");
        // for (int i = 0; i < chuoi.length(); i++) {
        // trả về ký tự tại vị trí thứ i trong chuỗi
        // và gán vào cho biến kyTu
        // i chạy từ 0 đến vị trí độ dài của chuỗi - 1
        // KyTu = chuoi.charAt(i);
        // System.out.println(KyTu);
        System.out.println("Trong chuoi co so ky tu in hoa la: " + kytuhoa);
        System.out.println("Trong chuoi co so ky tu in thuong la: " + kytuthuong);
        System.out.println("Trong chuoi co so ky tu chu so la: " + number);
    }
}