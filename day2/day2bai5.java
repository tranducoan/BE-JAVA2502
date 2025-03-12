import java.util.Scanner;

public class day2bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();

        int days = getDaysInMonth(year, month);

        if (days != -1) {
            System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");
        } else {
            System.out.println("Tháng không hợp lệ.");
        }

        scanner.close();
    }

    public static int getDaysInMonth(int year, int month) {
        if (month < 1 || month > 12) {
            return -1; // Tháng không hợp lệ
        }

        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    return 29; // Năm nhuận
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}