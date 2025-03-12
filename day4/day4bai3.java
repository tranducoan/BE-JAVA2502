import java.util.*;

public class day4bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 1. Nhập mảng
        System.out.println("Mảng đã nhập: " + Arrays.toString(arr));

        // 2. Tính tổng chẵn, lẻ
        tinhTongChanLe(arr);

        // 3. Tìm số nguyên tố
        timSoNguyenTo(arr);

        // 4. Sắp xếp mảng
        sapXepMang(arr);

        // 5. Chia mảng thành 2 mảng con
        chiaMang(arr);

        // 6. Tìm phần tử trùng lặp
        timPhanTuTrungLap(arr);

        // 7. Thêm phần tử
        System.out.print("Nhập giá trị cần thêm: ");
        int value = scanner.nextInt();
        System.out.print("Nhập vị trí index cần thêm: ");
        int index = scanner.nextInt();
        arr = themPhanTu(arr, value, index);

        // 8. Xóa phần tử
        System.out.print("Nhập giá trị cần xóa: ");
        value = scanner.nextInt();
        arr = xoaPhanTu(arr, value);

        scanner.close();
    }

    public static void tinhTongChanLe(int[] arr) {
        int tongChan = 0, tongLe = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                tongChan += num;
            } else {
                tongLe += num;
            }
        }
        System.out.println("Tổng các phần tử chẵn: " + tongChan);
        System.out.println("Tổng các phần tử lẻ: " + tongLe);
    }

    public static void timSoNguyenTo(int[] arr) {
        System.out.print("Các số nguyên tố trong mảng: ");
        for (int num : arr) {
            if (laSoNguyenTo(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void sapXepMang(int[] arr) {
        List<Integer> chan = new ArrayList<>();
        List<Integer> le = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                chan.add(num);
            } else {
                le.add(num);
            }
        }
        chan.sort(Collections.reverseOrder());
        le.sort(Comparator.naturalOrder());
        chan.addAll(le);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = chan.get(i);
        }
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }

    public static void chiaMang(int[] arr) {
        double trungBinh = Arrays.stream(arr).average().orElse(0);
        List<Integer> mang1 = new ArrayList<>();
        List<Integer> mang2 = new ArrayList<>();
        for (int num : arr) {
            if (num <= trungBinh) {
                mang1.add(num);
            } else {
                mang2.add(num);
            }
        }
        System.out.println("Mảng 1 (<= trung bình): " + mang1);
        System.out.println("Mảng 2 (> trung bình): " + mang2);
    }

    public static void timPhanTuTrungLap(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int num : arr) {
            if (!unique.add(num)) {
                duplicate.add(num);
            }
        }
        System.out.println("Các phần tử trùng lặp: " + duplicate);
    }

    public static int[] themPhanTu(int[] arr, int value, int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("Vị trí không hợp lệ.");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        newArr[index] = value;
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);
        System.out.println("Mảng sau khi thêm: " + Arrays.toString(newArr));
        return newArr;
    }

    public static int[] xoaPhanTu(int[] arr, int value) {
        List<Integer> list = new ArrayList<>();
        boolean found = false;
        for (int num : arr) {
            if (num == value && !found) {
                found = true;
                continue;
            }
            list.add(num);
        }
        if (!found) {
            System.out.println("Không tìm thấy giá trị cần xóa.");
            return arr;
        }
        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(newArr));
        return newArr;
    }
}