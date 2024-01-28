package az.edu.turing.homework02;

import java.util.Scanner;

public class task19App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 != 0 && (n > 0 && n >= 100 && n <= 999)) {
            System.out.println("NO");
        } else if (n % 2 != 0) {
            System.out.println("YES");
        } else if (n > 0 && n >= 100 && n <= 999) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
