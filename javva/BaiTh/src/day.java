import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao lua chon cua ban: ");
        number = sc.nextInt();

        switch (number) {
            case 2:
                System.out.println("Thu Hai");
                break;
            case 3:
                System.out.println("Thu Ba");
                break;
            case 4:
                System.out.println("Thu Tu");
                break;
            case 5:
                System.out.println("Thu Nam");
                break;
            case 6:
                System.out.println("Thu Sau");
                break;
            case 7:
                System.out.println("Thu Bay");
                break;
            case 8:
                System.out.println("Chu Nhat");
                break;
            default:
                System.out.println("Ngay khong hop le !!!");
        }
    }
}