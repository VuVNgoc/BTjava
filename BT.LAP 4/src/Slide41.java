
import java.util.Scanner;
import java.util.LinkedList;

public class Slide41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Tháng 1");
        linkedList.add("Tháng 2");
        linkedList.add("Tháng 3");
        linkedList.add("Tháng 4");
        linkedList.add("Tháng 5");
        linkedList.add("Tháng 6");
        linkedList.add("Tháng 7");
        linkedList.add("Tháng 8");
        linkedList.add("Tháng 9");
        linkedList.add("Tháng 10");
        linkedList.add("Tháng 11");
        linkedList.add("Tháng 12");

        System.out.print("Nhap vao chi so phan tu can lay: ");
        int index = sc.nextInt();

        if ((index < 0 || (index > linkedList.size() - 1))) {
            System.out.println("Chi so can phai lay lon hon 0 va nho hon " + (linkedList.size() - 1));
        } else {
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedlist la " + node);
        }
        String firstNode = linkedList.getFirst();

        String lastNode = linkedList.getLast();

        System.out.println("\n phan tu dau tien co trong danh sach la " + firstNode
                + " ; Phan tu cuoi cung trong danh sach la " + lastNode);
    }
}
