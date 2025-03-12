import java.util.Scanner;

public class day2bai4 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-------------------------");
            System.out.println("1. Tính điểm sinh viên");
            System.out.println("2. Kiểm tra loại tam giác");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("-------------------------");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tinhDiemSinhVien();
                    break;
                case 2:
                    kiemTraLoaiTamGiac();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void tinhDiemSinhVien() {
        Scanner scanner = new Scanner(System.in);
        // ... (Mã bài 1 từ trước) ...
        System.out.print("Nhập điểm chuyên cần: ");
        double chuyenCan = scanner.nextDouble();

        System.out.print("Nhập điểm giữa kỳ: ");
        double giuaKy = scanner.nextDouble();

        System.out.print("Nhập điểm cuối kỳ: ");
        double cuoiKy = scanner.nextDouble();

        double diemTrungBinh = (chuyenCan + giuaKy + cuoiKy) / 3;

        String xepLoai;
        if (diemTrungBinh >= 9) {
            xepLoai = "A";
        } else if (diemTrungBinh >= 7) {
            xepLoai = "B";
        } else if (diemTrungBinh >= 5) {
            xepLoai = "C";
        } else {
            xepLoai = "D";
        }

        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Xếp loại: " + xepLoai);

        scanner.close();
    }

    public static void kiemTraLoaiTamGiac() {
        Scanner scanner = new Scanner(System.in);
        // ... (Mã bài 2 từ trước) ...
        System.out.print("Nhập độ dài cạnh a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập độ dài cạnh b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập độ dài cạnh c: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Tam giác đều");
            } else if (a == b || a == c || b == c) {
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("Tam giác vuông cân");
                } else {
                    System.out.println("Tam giác cân");
                }
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Tam giác vuông");
            } else {
                System.out.println("Tam giác thường");
            }
        } else {
            System.out.println("Không phải tam giác");
        }

        scanner.close();
    }

    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        // ... (Mã bài 3 từ trước) ...
        System.out.print("Nhập số điện sử dụng: ");
        int soDien = scanner.nextInt();

        double tienDien = 0;
        if (soDien <= 50) {
            tienDien = soDien * 1678;
        } else if (soDien <= 100) {
            tienDien = 50 * 1678 + (soDien - 50) * 1734;
        } else if (soDien <= 200) {
            tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
        } else if (soDien <= 300) {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
        } else if (soDien <= 400) {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
        } else {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (soDien - 400) * 2927;
        }

        System.out.println("Tiền điện: " + tienDien + " VND");

        scanner.close();
    }
}
