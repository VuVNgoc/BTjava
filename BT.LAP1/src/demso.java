import java.util.Scanner;

public class demso {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so dong cua ma tran: ");
        m = sc.nextInt();
        System.out.print("Nhap vao so cot cua ma tran: ");
        n = sc.nextInt();
        // Khai báo ma trân A có m dòng, n cột
        int A[][] = new int[m][n];
        System.out.print("Nhap cac phan tu cho ma tran: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }
        // tìm phần tử có giá trị lớn nhất trong ma trận
        // giả sử ptu tại vị trí (0,0) là phần tử lớn nhất
        int max = A[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran = " + max);
    }
}
