package az.edu.turing;

import java.util.Scanner;

public class task16App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        if (a > 0) {
            b = 1;
        } else if (a < 0) {
            b = -1;
        } else b = 0;
        System.out.print(b);
        scanner.close();
    }
}
