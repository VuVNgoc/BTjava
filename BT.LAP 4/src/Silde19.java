import java.util.ArrayList;
import java.util.ListIterator;

public class Silde19 {
    public static void main(String[] args) {
        ArrayList<Character> arrayListChar = new ArrayList<>();

        arrayListChar.add('a');
        arrayListChar.add('b');
        arrayListChar.add('c');
        arrayListChar.add('d');
        arrayListChar.add('e');

        // Khai báo một ListIterator có kiểu Charater
        ListIterator<Character> listIterator = arrayListChar.listIterator();
        System.out.println("Cac phan tu co trong arrList la : ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }
    }
}
