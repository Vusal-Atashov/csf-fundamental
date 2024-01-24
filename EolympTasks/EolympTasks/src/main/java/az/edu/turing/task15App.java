package az.edu.turing;

import java.util.Scanner;

public class task15App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a % b == 0 && a % c == 0) {
            System.out.println("YES\n");
        } else System.out.println("NO\n");

        scanner.close();
    }
}
