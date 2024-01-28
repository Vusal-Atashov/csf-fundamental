package az.edu.turing.homework02;

import java.util.Scanner;

public class task12App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 5) {
            System.out.println(a * a - 3 * a + 4);
        } else System.out.println(a + 7);
    }
}
