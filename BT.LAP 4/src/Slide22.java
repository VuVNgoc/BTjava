import java.util.ArrayList;
import java.util.Scanner;

public class Slide22 {
    public static void main(String[] args) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        float number; // phần tử của mảng

        System.out.print("Nhap vao phan tu cua ArrayList : ");
        float n = sc.nextFloat();

        for (float i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            number = sc.nextFloat();
            arrayList.add(number);
        }
        float max = arrayList.get(0);

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).compareTo(max) > 0) {
                max = arrayList.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrList = " + max);
    }
}
