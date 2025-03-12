import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập n (n dương): ");
            n = scanner.nextInt();
        } while (n <= 0);

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 3);
        }

        System.out.println("S(" + n + ") = " + sum);

        scanner.close();
    }
}