import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		int thang;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap thang: ");
		thang = sc.nextInt();

		switch (thang) {
			case 1 -> System.out.println("Thang 1");
			case 2 -> System.out.println("Thang 2 ");
			case 3 -> System.out.println("Thang 3 ");
			case 4 -> System.out.println("Thang 4 ");
			case 5 -> System.out.println("Thang 5 ");
			case 6 -> System.out.println("Thang 6 ");
			case 7 -> System.out.println("Thang 7 ");
			case 8 -> System.out.println("Thang 8 ");
			case 9 -> System.out.println("Thang 9 ");
			case 10 -> System.out.println("Thang 10 ");
			case 11 -> System.out.println("Thang 11 ");
			case 12 -> System.out.println("Thang 12 ");

			default -> System.out.println("Khong la thang nao ");
		}
	}
}