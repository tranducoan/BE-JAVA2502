package kiemtra;

import java.util.Scanner;

public class bai2p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập số nguyên từ 1 đến 7
        System.out.print("Nhập số nguyên từ 1 đến 7: ");
        int ngay = scanner.nextInt();

        // 2. Dùng switch-case để in tên ngày
        switch (ngay) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case 5:
                System.out.println("Thứ năm");
                break;
            case 6:
                System.out.println("Thứ sáu");
                break;
            case 7:
                System.out.println("Thứ bảy");
                break;
            default:
                System.out.println("Số không hợp lệ");
        }

        scanner.close();
    }
}