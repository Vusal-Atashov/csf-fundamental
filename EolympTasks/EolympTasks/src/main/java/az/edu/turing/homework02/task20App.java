package az.edu.turing.homework02;

import java.util.Scanner;

public class task20App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();

        // Check conditions
        if (n % 3 == 0 && ((n > 9 && n < 100 || n < -9 && n > -100) && n % 2 == 0)) System.out.println("YES");
        else System.out.println("NO");

        scanner.close();
    }
}

