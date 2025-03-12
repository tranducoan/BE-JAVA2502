package kiemtra;

import java.util.Scanner;

public class bai1p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập một số nguyên từ bàn phím
        System.out.print("Nhập một số nguyên: ");
        int so = scanner.nextInt();

        // 2. Kiểm tra và in kết quả
        if (so % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }

        scanner.close();
    }
}