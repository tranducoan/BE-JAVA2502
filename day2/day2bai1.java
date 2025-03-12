import java.util.Scanner;

public class day2bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
}


