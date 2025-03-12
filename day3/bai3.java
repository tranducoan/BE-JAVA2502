import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập n (n dương): ");
            n = scanner.nextInt();
        } while (n <= 0);

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);

        scanner.close();
    }
}