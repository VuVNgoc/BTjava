import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Slide54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // thêm các ptu vào HashSet
        hashSet.add(0);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(7);
        hashSet.add(9);
        hashSet.add(5);
        // hiển thị các hashSet
        System.out.println("Cac phan tu trong hashSetInterger: ");
        System.out.println(hashSet);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();

        if (!hashSet.contains(number)) {
            hashSet.add(number);
            System.out.println("Them thanh cong !");
            System.out.println("Cac phan tu trong hashSetInteger sau khi them: ");
            System.out.println(hashSet);
        } else {
            System.out.println("Phan tu " + number + " da ton tai !");
        }

    }

}
