import java.util.Scanner;
import java.util.LinkedList;

public class Slide111 {
    public static void main(String[] args) {
        int n, number, sum = 0, count = 0;
        double tbCong;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.print("Nhap vao so phan tu cua danh sach : ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + i + ": ");
            number = sc.nextInt();
            linkedList.add(number);
        }
        for (int i = 0; i < n; i++) {
            if (linkedList.get(i) % 2 == 0) {
                sum += linkedList.get(i);
                count++; // biến lưu trữ các số chẳn
            }
        }
        tbCong = (double) sum / count;
        System.out.println("Trung binh cong cua cac so chan trong danh sach = " + tbCong);

    }

}
