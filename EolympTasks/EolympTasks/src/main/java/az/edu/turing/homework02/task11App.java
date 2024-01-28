package az.edu.turing.homework02;

import java.util.Scanner;

public class task11App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("EVEN\n");
        } else System.out.println("ODD\n");
    }
}
