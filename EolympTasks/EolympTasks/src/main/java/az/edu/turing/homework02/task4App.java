package az.edu.turing.homework02;

import java.util.Scanner;

public class task4App {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        long prod = 1;
        while (num > 0) {
            int remainder = num % 10;
            prod *= remainder;
            num /= 10;
        }
        System.out.println(prod);
    }
}



