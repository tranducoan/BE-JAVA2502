package kiemtra;

import java.util.Scanner;

public class bai1p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập vào hai số nguyên từ bàn phím
        System.out.print("Nhập số nguyên thứ nhất: ");
        int so1 = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int so2 = scanner.nextInt();

        // 2. Tính tổng và in ra kết quả
        int tong = so1 + so2;
        System.out.println("Tổng của hai số là: " + tong);

        scanner.close();
    }
}