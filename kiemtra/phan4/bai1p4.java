package kiemtra;

import java.util.Arrays;
import java.util.Scanner;

public class bai1p4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập vào số lượng phần tử mảng
        System.out.print("Nhập số lượng phần tử mảng: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        // 2. Nhập các phần tử mảng
        System.out.println("Nhập các phần tử mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        // 3. Tìm giá trị lớn nhất và nhỏ nhất
        int max = Arrays.stream(mang).max().orElse(Integer.MIN_VALUE);
        int min = Arrays.stream(mang).min().orElse(Integer.MAX_VALUE);
        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Giá trị nhỏ nhất: " + min);

        // 4. Tính tổng các phần tử
        int tong = Arrays.stream(mang).sum();
        System.out.println("Tổng các phần tử: " + tong);

        // 5. Thêm phần tử vào mảng
        System.out.print("Nhập giá trị cần thêm: ");
        int giaTriThem = scanner.nextInt();
        System.out.print("Nhập vị trí cần thêm: ");
        int viTriThem = scanner.nextInt();
        mang = themPhanTu(mang, giaTriThem, viTriThem);

        // 6. Xóa các phần tử bằng giá trị nhập vào
        System.out.print("Nhập giá trị cần xóa: ");
        int giaTriXoa = scanner.nextInt();
        mang = xoaPhanTu(mang, giaTriXoa);

        // 7. Tìm phần tử lớn thứ 3
        int lonThu3 = timPhanTuLonThu3(mang);
        System.out.println("Phần tử lớn thứ 3: " + lonThu3);

        scanner.close();
    }

    public static int[] themPhanTu(int[] mang, int giaTriThem, int viTriThem) {
        if (viTriThem < 0 || viTriThem > mang.length) {
            System.out.println("Vị trí không hợp lệ.");
            return mang;
        }

        int[] mangMoi = new int[mang.length + 1];
        System.arraycopy(mang, 0, mangMoi, 0, viTriThem);
        mangMoi[viTriThem] = giaTriThem;
        System.arraycopy(mang, viTriThem, mangMoi, viTriThem + 1, mang.length - viTriThem);
        return mangMoi;
    }

    public static int[] xoaPhanTu(int[] mang, int giaTriXoa) {
        int dem = 0;
        for (int num : mang) {
            if (num != giaTriXoa) {
                dem++;
            }
        }
        int[] mangMoi = new int[dem];
        int j = 0;
        for (int num : mang) {
            if (num != giaTriXoa) {
                mangMoi[j++] = num;
            }
        }
        return mangMoi;
    }

    public static int timPhanTuLonThu3(int[] mang) {
        if (mang.length < 3) {
            return Integer.MIN_VALUE; // Không đủ 3 phần tử
        }
        Arrays.sort(mang);
        return mang[mang.length - 3];
    }
}