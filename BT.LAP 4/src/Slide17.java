
import java.util.ArrayList;

public class Slide17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(9);
        arrList.add(6);
        arrList.add(7);
        arrList.add(2);
        System.out.println("Cac phan tu co trong arr la : ");
        for (int number : arrList) {
            System.out.print(number + "\t");
        }
    }
}
