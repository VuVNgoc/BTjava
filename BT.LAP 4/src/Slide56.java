import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSet.add("Nhung");
        hashSet.add("Hoa");
        hashSet.add("Minh");
        hashSet.add("Hung");
        hashSet.add("Tuan");
        hashSet.add("Ngoc");

        System.out.println("Cac phan tu trong hashSet: ");
        System.out.println(hashSet);
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine();
        // nếu phần tử cần xóa có tồn tại trong hashSet thì sẽ thông báo xóa thành công
        // và hiển thị các phần tử còn lại, ngược lại thông báo xóa không thành công

        if (hashSet.contains(name)) {
            hashSet.remove(name);
            System.out.println("Xoa thanh cong !");
            System.out.println("Cac phan tu con lai trong hashSet : ");
            System.out.println(hashSet);
        } else {
            System.out.println("Xoa khong thanh cong !");
        }
    }

}
