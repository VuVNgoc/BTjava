import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, number;
        String a = "";
        do {
            System.out.print("Nhap so: ");
            number = sc.nextInt();
            a += number + "+";
            sum += number;
        } while (sum < 100);
        System.out.println("Tong cac so: ");
        System.out.println("" + a.substring(0, a.length() - 1) + " = " + sum);
    }
}