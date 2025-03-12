import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        String nhiPhan = "";
        int temp = n;

        while (temp > 0) {
            nhiPhan = (temp % 2) + nhiPhan;
            temp /= 2;
        }

        System.out.println(n + " -> " + nhiPhan);

        scanner.close();
    }
}