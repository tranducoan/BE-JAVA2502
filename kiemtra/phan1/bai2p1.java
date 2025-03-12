package kiemtra;

import java.util.Scanner;

public class bai2p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập vào bán kính hình tròn
        System.out.print("Nhập bán kính hình tròn: ");
        double banKinh = scanner.nextDouble();

        // 2. Tính diện tích hình tròn
        double dienTich = Math.PI * banKinh * banKinh;
        System.out.println("Diện tích hình tròn là: " + dienTich);

        // 3. Kiểm tra diện tích là chẵn hay lẻ và in kết quả
        int dienTichInt = (int) dienTich; // Ép kiểu double sang int để kiểm tra chẵn lẻ
        if (dienTichInt % 2 == 0) {
            System.out.println("Diện tích (phần nguyên) là số chẵn.");
        } else {
            System.out.println("Diện tích (phần nguyên) là số lẻ.");
        }

        scanner.close();
    }
}