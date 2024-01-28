package az.edu.turing.homework02;

import java.util.Scanner;

public class task9App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int max1;
        int max2;
        if (a > b) {
            max1 = a;
        } else max1 = b;
        if (c > d) {
            max2 = c;
        } else max2 = d;
        if (max1 > max2) {
            System.out.println(max1);
        } else System.out.println(max2);
    }
}
