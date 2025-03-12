package kiemtra;

import java.util.Scanner;

public class bai3p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập số chuyến đi
        System.out.print("Nhập số chuyến đi: ");
        int soChuyen = scanner.nextInt();

        // 2. Áp dụng giảm giá
        double giaVe = 10000; // 10.000 VNĐ
        double tongTien = soChuyen * giaVe;

        if (soChuyen > 10) {
            tongTien *= 0.8; // Giảm 20%
        } else if (soChuyen > 5) {
            tongTien *= 0.9; // Giảm 10%
        }

        // 3. In số tiền phải trả
        System.out.println("Số tiền phải trả: " + tongTien + " VNĐ");

        scanner.close();
    }
}