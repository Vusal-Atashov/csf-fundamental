package az.edu.turing;

import java.util.Scanner;

public class task17App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Water\n");
        } else System.out.println("Ice\n");
    }
}
