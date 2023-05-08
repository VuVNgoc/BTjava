import java.util.ArrayList;

public class Slide16 {
    public static void main(String[] args) throws Exception {
        ArrayList<Float> arrayList = new ArrayList<>();

        arrayList.add(2.13f);
        arrayList.add(4.12f);
        arrayList.add(3.1f);
        arrayList.add(1.4f);
        arrayList.add(3.5f);

        System.out.println("Cac phan tu co trong arrList la : ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "\t");
        }
    }
}
