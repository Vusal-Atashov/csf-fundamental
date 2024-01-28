package az.edu.turing.homework02;

import java.util.Scanner;

public class task18App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (b < c) {
            if (a >= b && a <= c) {
                System.out.println("IN");
            } else System.out.println("OUT\n");

        } else if (a <= b && a >= c) {
            System.out.println("IN");
        } else System.out.println("OUT\n");
    }
}
