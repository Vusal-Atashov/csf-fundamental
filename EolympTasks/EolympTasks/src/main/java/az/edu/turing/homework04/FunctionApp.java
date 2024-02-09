package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            // Read the value of x
            double x = scanner.nextDouble();

            // Evaluate the function f(x)
            double result = evaluateFunction(x);

            // Print the result with four digits after the decimal point
            System.out.printf("%.4f\n", result);
        }
    }

    // Function to evaluate f(x) = x^3 + 2x^2 - 3
    public static double evaluateFunction(double x) {
        return x*x*x + 2*x*x - 3;
    }
}


