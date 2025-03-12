package kiemtra;

import java.util.Scanner;

public class bai2p3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập vào một chuỗi
        System.out.print("Nhập vào một chuỗi: ");
        String chuoi = scanner.nextLine();

        // 2. Kiểm tra nếu chuỗi đó là Palindrome
        String chuoiDaoNguoc = new StringBuilder(chuoi).reverse().toString();
        boolean laPalindrome = chuoi.equalsIgnoreCase(chuoiDaoNguoc);

        // 3. In ra kết quả
        if (laPalindrome) {
            System.out.println("Chuỗi là Palindrome");
        } else {
            System.out.println("Chuỗi không phải là Palindrome");
        }

        scanner.close();
    }
}