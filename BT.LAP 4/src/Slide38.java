import java.util.LinkedList;

public class Slide38 {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<Character>();

        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');

        System.out.println("Vi du su dung phuong thuc addAll()");
        System.out.println("...................................");

        // thêm các phần tử của list vào ListA
        LinkedList<Character> listA = new LinkedList<Character>();
        listA.addAll(list);
        System.out.print("listA: ");
        showList(listA);

        System.out.println("\n vi du su dung phuong thuc retainAll ()");
        System.out.println("..........................................");
        // khởi tạo listB \\
        LinkedList<Character> listB = new LinkedList<Character>();
        listB.add('a');
        // xóa những phần tử không thuộc listA ra khỏi listB
        listA.retainAll(listB);
        System.out.println("listA: ");
        showList(listA);

        System.out.println("\n vi du su dung phuong thuc removeAll()");
        System.out.println(".......................................");
        // xóa những phần tử thuộc listB khỏi list
        list.removeAll(listB);
        System.out.println("list: ");
        showList(list);
    }

    public static void showList(LinkedList<Character> list) {
        // Show list through for - each
        for (Character obj : list) {
            System.out.println("\t" + obj + ", ");
        }
        System.out.println();
    }

}
