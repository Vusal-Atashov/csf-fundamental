package az.edu.turing;

import java.util.Scanner;

public class task13App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b;
        if (a >= 10) {
            b = a * a * a + 5 * a;
        } else {
            b = a * a - 2 * a + 4;
        }
        System.out.print(b);
        scanner.close();
    }
}
