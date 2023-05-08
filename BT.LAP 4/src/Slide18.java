import java.util.ArrayList;
import java.util.Iterator;

public class Slide18 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("HA");
        arrayList.add("THUY");
        arrayList.add("BAC");
        arrayList.add("TUAN");

        // Khai báo một Iterator có kiểu là Float
        Iterator<String> iterator = arrayList.iterator();
        System.out.println("Cac phan tu cotrong arrlist la: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}
