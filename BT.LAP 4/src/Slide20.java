import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class Slide20 {
    public static void main(String[] args) {
        ArrayList<Float> arr = new ArrayList<Float>(3);
        arr.add(1.3f);
        arr.add(3.2f);
        arr.add(7.9f);
        arr.add(5.7f);
        arr.add(1.2f);
        arr.add(0.5f);
        arr.add(0.75f);

        System.out.println(arr.get(2));
        System.out.println(arr.contains("1.2f"));
        System.out.println(arr.size());
        System.out.println(arr);
    }

}
