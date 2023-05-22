import java.util.Scanner;
import java.util.ArrayList;

public class Slide110 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        // Tìm số nguyên có giá trị lớn nhất.
        System.out.print("Nhap vao so nguyen : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen thu : " + i + ": ");
            number = sc.nextInt();
            arr.add(number);
        }
        int max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).compareTo(max) > 0) {
                max = arr.get(i);
            }
        }
        System.out.println("So nguyen co gia tri lon nhat = " + max);
        // Nhập vào 1 số nguyên, xoá khỏi mảng các phần từ có giá trị bằng giá trị vừa
        System.out.println("Nhap cac so can xoa: ");
        number = sc.nextInt();
        if (arr.contains(number)) {
            arr.remove(number);
            System.out.println("Xoa thanh cong !");
            System.out.println("Cac so nguyen con lai : ");
            System.out.println(arr);
        } else {
            System.out.println("Xoa khong thanh cong !");
        }

    }

}
