package az.edu.turing.homework04;

import java.util.Scanner;

public class PerfectSquareApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (Math.sqrt(x) % 1 == 0) {
            System.out.println((int) Math.sqrt(x));
        } else System.out.println("No");
    }
}
