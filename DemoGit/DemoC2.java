import java.util.Scanner;

public class MaxValueMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và số cột của ma trận, kiểm tra đầu vào
        int m, n;
        while (true) {
            System.out.print("Nhập vào số dòng của ma trận: ");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                if (m > 0) break;
            } else {
                scanner.next(); // Xóa dữ liệu không hợp lệ
            }
            System.out.println("Vui lòng nhập một số nguyên dương!");
        }

        while (true) {
            System.out.print("Nhập vào số cột của ma trận: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) break;
            } else {
                scanner.next(); // Xóa dữ liệu không hợp lệ
            }
            System.out.println("Vui lòng nhập một số nguyên dương!");
        }

        // Khai báo và khởi tạo ma trận A[m][n]
        int[][] A = new int[m][n];

        // Nhập giá trị các phần tử của ma trận
        System.out.println("Nhập các phần tử cho ma trận:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                while (true) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    if (scanner.hasNextInt()) {
                        A[i][j] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Vui lòng nhập một số nguyên hợp lệ!");
                        scanner.next(); // Xóa dữ liệu sai
                    }
                }
            }
        }

        // Tìm phần tử lớn nhất trong ma trận
        int max = A[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
        }

        // In kết quả
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);

        // Đóng scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }
}
