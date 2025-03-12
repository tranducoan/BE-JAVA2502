public class day4bai2 {

    public static boolean kiemTraSoDienThoai(String sdt) {
        // Loại bỏ khoảng trắng và dấu gạch ngang
        String cleanedSdt = sdt.replaceAll("[\\s-]", "");

        // Kiểm tra định dạng +84 hoặc 84
        if (cleanedSdt.startsWith("+84") || cleanedSdt.startsWith("84")) {
            if (cleanedSdt.length() != 11) {
                return false;
            }
            return cleanedSdt.substring(cleanedSdt.startsWith("+84") ? 3 : 2).matches("[0-9]{9}");
        }

        // Kiểm tra định dạng 0xxx...
        if (cleanedSdt.startsWith("0")) {
            if (cleanedSdt.length() != 10) {
                return false;
            }
            return cleanedSdt.substring(1).matches("[0-9]{9}");
        }

        // Kiểm tra định dạng 9 số
        if (cleanedSdt.length() == 9) {
            return cleanedSdt.matches("[0-9]{9}");
        }

        return false;
    }

    public static void main(String[] args) {
        String[] testCases = {
                "+84912345678",
                "091-234-5678",
                "18481234567",
                "0912.345 678",
                "0123456789",
                "0841234"
        };

        for (String testCase : testCases) {
            System.out.println("Đầu vào: " + testCase);
            System.out.println("Kết quả: " + (kiemTraSoDienThoai(testCase) ? "Hợp lệ" : "Không hợp lệ"));
        }
    }
}