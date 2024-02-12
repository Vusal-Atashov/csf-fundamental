package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum = a + b;

            System.out.println(sum);
        }
    }

}

