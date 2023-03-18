import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, temp = 1;
        long giaiThua = 1;
        do {
            System.out.printf("Nhap mot so nguyen duong bat ky: ");
            number = sc.nextInt();
        } while ((number <= 0) || (number > 10));
        while (temp <= number) {
            giaiThua *= temp;
            temp++;
        }
        System.out.println(number + "!= " + giaiThua);
    }
}