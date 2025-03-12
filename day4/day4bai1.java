import java.util.HashMap;
import java.util.Map;

public class day4bai1 {

    public static void main(String[] args) {
        String input = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khoi " +
                "xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. " +
                "Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù " +
                "hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho " +
                "các ứng dụng di động.";

        String testInput = "Tôi học lập trình, học lập trình rất hay";

        // Test case 1
        System.out.println("Test case 1:");
        demSoLuongTu(testInput);
        vietHoaChuCaiDau(testInput);
        xoaNguyenAm(testInput);

        // Xử lý đoạn văn đầu vào
        System.out.println("\nĐoạn văn đầu vào:");
        demSoLuongTu(input);
        vietHoaChuCaiDau(input);
        xoaNguyenAm(input);
    }

    public static void demSoLuongTu(String input) {
        String[] words = input.toLowerCase().split("[\\s.,:]+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("a) Đếm số lượng từng từ:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("\"" + entry.getKey() + ": " + entry.getValue() + " từ\"");
        }
    }

    public static void vietHoaChuCaiDau(String input) {
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }

        System.out.println("\nb) Viết hoa chữ cái đầu trong mỗi từ:");
        System.out.println(result.toString().trim());
    }

    public static void xoaNguyenAm(String input) {
        String nguyenAm = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (nguyenAm.indexOf(c) == -1) {
                result.append(c);
            }
        }

        System.out.println("\nc) Xóa các nguyên âm trong câu:");
        System.out.println(result.toString());
    }
}