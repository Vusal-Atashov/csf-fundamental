package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int product = 1;
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            sum += digit;
            temp /= 10;
        }

        double ratio = (double) product / sum;

        System.out.printf("%.3f\n", ratio);
    }

}

