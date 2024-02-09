package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();

            double result = calculateFunction(x);

            System.out.printf("%.4f\n", result);
        }

        scanner.close();
    }

    public static double calculateFunction(double x) {
        return Math.sqrt(x) + 2 * x + Math.sin(x);
    }


}

