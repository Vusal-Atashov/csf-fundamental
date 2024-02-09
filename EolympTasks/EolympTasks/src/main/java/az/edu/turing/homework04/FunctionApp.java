package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long y = scanner.nextInt();
        long z = scanner.nextInt();
        long f =((x * y * z) + x + (y*y) + (z*z*z));
        System.out.println(f);
    }
}

