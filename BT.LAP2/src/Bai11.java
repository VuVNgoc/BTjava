import java.util.Scanner;
import java.util.Arrays;

public class Bai11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhap vao so phan tu cua mang: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao thu tu %d cua mang:  ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Mang sau khi da sap xep ");

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();

    }

}
