package kiemtra;

import java.util.Scanner;

public class bai1p3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một chuỗi
        System.out.print("Nhập vào một chuỗi: ");
        String chuoi = scanner.nextLine();

        // Sử dụng StringBuilder để đảo ngược chuỗi
        StringBuilder daoNguoc = new StringBuilder(chuoi).reverse();

        // In kết quả
        System.out.println("Chuỗi đảo ngược: " + daoNguoc.toString());

        scanner.close();
    }
}